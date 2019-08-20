package com.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.service.IPersonaService;
//import com.springboot.service.PersonaServiceImpl;

@SpringBootApplication
public class DemoConsolaApplication implements CommandLineRunner {
	
	private static Logger LOG = LoggerFactory.getLogger(DemoConsolaApplication.class);
	
	@Autowired
	private IPersonaService service;

	public static void main(String[] args) {
		SpringApplication.run(DemoConsolaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		LOG.info("Hola coders desde SPRINGBOOT en consola...");
//		LOG.warn("Advertencia: Hola coders desde SPRINGBOOT en consola...");
//		service = new PersonaServiceImpl();
		
		service.registrar("MitoCode");
	}
	
	

}
