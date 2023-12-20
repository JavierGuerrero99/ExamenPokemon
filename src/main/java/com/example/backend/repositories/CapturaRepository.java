package com.example.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backend.entities.Captura;


@Repository
public interface CapturaRepository extends JpaRepository<Captura,Long>{

}
