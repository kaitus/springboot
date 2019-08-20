package com.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer> {

}
