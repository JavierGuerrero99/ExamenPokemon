package com.example.backend.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path="/api/v1/pokemons")
@RequiredArgsConstructor
@CrossOrigin(origins="http://localhost:8080")
public class PokemonController {
	
}
