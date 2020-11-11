package com.millan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.millan.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer> {

}
