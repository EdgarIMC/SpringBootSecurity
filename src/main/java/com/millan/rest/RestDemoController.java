package com.millan.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.millan.model.Persona;
import com.millan.repo.IPersonaRepo;

@RestController
@RequestMapping("/personas")
public class RestDemoController {
	
	@Autowired
	private IPersonaRepo repo;
	
	@GetMapping
	public List<Persona> listar(){
		return repo.findAll();
	}
	
	@PostMapping
	public void insertar(@RequestBody Persona persona) {
		repo.save(persona);
	}
	
	@PutMapping
	public void actualizar(@RequestBody Persona persona) {
		repo.save(persona);
	}
	
	@DeleteMapping(value = ("/{id}"))
	public void insertar(@PathVariable("id") int id) {
		repo.deleteById(id);
	}
	
	

}
