package com.springboot.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.springboot.DemoConsolaApplication;

@Repository
@Qualifier("persona2")
public class PersonaRepositoryImpl2 implements IPersonaRepository {
	
	private static Logger LOG = LoggerFactory.getLogger(DemoConsolaApplication.class);

	@Override
	public void registrar(String nombre) {
		LOG.info("Se registro a " + nombre);
	}

}
