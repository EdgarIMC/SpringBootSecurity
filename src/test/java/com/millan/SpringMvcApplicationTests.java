package com.millan;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.millan.model.Usuario;
import com.millan.repo.IUsuarioRepo;

@SpringBootTest
class SpringMvcApplicationTests {

	@Autowired
	private BCryptPasswordEncoder encode;
	@Autowired
	private IUsuarioRepo repo;
	@Test
	void crearUsuarioTest() {
		
		Usuario user = new Usuario();
		user.setId(2);
		user.setNombre("apolo");
		user.setClave(encode.encode("apolo"));
		Usuario retorno = repo.save(user);
		assertTrue(retorno.getClave().equalsIgnoreCase(user.getClave()));
	}

}
