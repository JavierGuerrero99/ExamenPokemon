package com.example.backend.controllers;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.entities.Pokemon;
import com.example.backend.repositories.PokemonRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path="/api/v1/pokemons")
@RequiredArgsConstructor
@CrossOrigin(origins="http://localhost:8080")
public class PokemonController {
	PokemonRepository pokemonRepository;	
	  	
	public PokemonController(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }
	
		@PostMapping 
	    public ResponseEntity<Pokemon> crearPokemon(@RequestBody Pokemon nuevoPokemon) {
	       	        Pokemon pokemonGuardado = pokemonRepository.save(nuevoPokemon);	        
	        return ResponseEntity.status(HttpStatus.CREATED).body(pokemonGuardado);
	    }
	  
		@GetMapping("/tipo/{uuid}")
		public ResponseEntity<List<Pokemon>> getPokemonesPorUuid(@PathVariable String uuid) {
		    List<Pokemon> pokemonesPorTipo = pokemonRepository.findByUuid(uuid);

		    if (pokemonesPorTipo.isEmpty()) {
		        return ResponseEntity.notFound().build();
		    }

		    return ResponseEntity.ok(pokemonesPorTipo);
		}
	  
	
}
