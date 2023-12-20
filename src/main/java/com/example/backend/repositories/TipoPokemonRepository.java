package com.example.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.backend.entities.TipoPokemon;

@Repository
public interface TipoPokemonRepository extends JpaRepository<TipoPokemon,Long>{

}
