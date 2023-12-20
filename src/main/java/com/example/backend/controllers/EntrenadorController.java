package com.example.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.backend.repositories.EntrenadorRepository;


import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path="/api/vi/entrenador")
@RequiredArgsConstructor
@CrossOrigin(origins="http://localhost:8080")
public class EntrenadorController {
	
	
	@Autowired
	EntrenadorRepository entrenadorRepository;
	
	@PostMapping("/login")
    public String postLogin(@RequestBody String email) {
		
        return null;
    }
}
