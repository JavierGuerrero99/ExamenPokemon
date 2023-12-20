package com.example.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.backend.entities.Entrenador;

@Repository
public interface EntrenadorRepository extends JpaRepository<Entrenador,Long>{

}
