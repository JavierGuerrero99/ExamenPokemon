package com.example.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.backend.entities.Pokemon;
import com.example.backend.repositories.PokemonRepository;

@Service
public class EntrenadorService {
	PokemonRepository pokemonRepository;
	public List<Pokemon> getPokemonByUuid(String uuid){
		return pokemonRepository.findByUuid(uuid);
		
	} 
}
