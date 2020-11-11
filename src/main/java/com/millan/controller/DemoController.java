package com.millan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.millan.model.Persona;
import com.millan.repo.IPersonaRepo;

@Controller
public class DemoController {
	
	@Autowired
	private IPersonaRepo repository;
	@GetMapping("/saludo")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		Persona p = new Persona();
		p.setIdPersona(2);
		p.setNombre("Raquel Rosete");
		repository.save(p);
		model.addAttribute("name", name);
		return "greeting";
	}
	
	@GetMapping("/listar")
	public String greeting(Model model) {
		Persona p = new Persona();
		p.setIdPersona(1);
		p.setNombre("Edgar Millán");
		repository.save(p);
		model.addAttribute("personas", repository.findAll());
		return "greeting";
	}


}
