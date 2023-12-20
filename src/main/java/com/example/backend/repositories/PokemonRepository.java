package com.example.backend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.backend.entities.Pokemon;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon,Long>{

	List<Pokemon> findByTipoPokemonId(Long tipoPokemonId);

}
