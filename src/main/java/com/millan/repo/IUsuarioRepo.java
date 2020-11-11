package com.millan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.millan.model.Usuario;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer> {
	
	Usuario findByNombre(String nombre);

}
