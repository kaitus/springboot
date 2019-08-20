package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.model.Persona;
import com.springboot.repo.IPersonaRepo;

@Controller
public class DemoController {
	
	@Autowired
	private IPersonaRepo repo;
	
	@GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        
		Persona p = new Persona();
        p.setIdPersona(1);
        p.setNombre("Carlos");
		repo.save(p);
		
		model.addAttribute("name", name);
        return "greeting";
    }
	
	@GetMapping("/findAll")
    public String greeting(Model model) {
		model.addAttribute("personas", repo.findAll());
        return "greeting";
    }

}
