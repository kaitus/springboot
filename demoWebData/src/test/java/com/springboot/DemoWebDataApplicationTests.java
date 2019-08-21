package com.springboot;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import com.springboot.model.Usuario;
import com.springboot.repo.IUsuarioRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoWebDataApplicationTests {

	@Autowired
	private IUsuarioRepo repo;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Test
	public void crearUsuarioTest() {
		Usuario ususario = new Usuario();
		ususario.setId(2);
		ususario.setNombre("springbootusuario");
		ususario.setClave(encoder.encode("123"));
		Usuario usuRetiorno = repo.save(ususario);
		
		assertTrue(usuRetiorno.getClave().equalsIgnoreCase(ususario.getClave()));
		
	}

}
