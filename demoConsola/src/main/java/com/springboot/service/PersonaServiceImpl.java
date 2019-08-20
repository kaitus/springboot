package com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.springboot.repository.IPersonaRepository;
//import com.springboot.repository.PersonaRepositoryImpl;

@Service
public class PersonaServiceImpl implements IPersonaService {
	
	@Autowired
	@Qualifier("persona1")
	private IPersonaRepository repo;

	@Override
	public void registrar(String nombre) {
//		repo = new PersonaRepositoryImpl();
		repo.registrar(nombre);
	}

}
