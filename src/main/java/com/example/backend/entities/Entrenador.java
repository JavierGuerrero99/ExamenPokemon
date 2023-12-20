package com.example.backend.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Entrenador {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private	Long id;
	
	private String nombre;
	private String apellido;
	private Date fecha_nacimiento;
	private Date fecha_vinculacion;
	
	@ManyToOne
	@JoinColumn(name ="id")
	private Pueblo pueblo_id;
	
	private Integer uuid;
	
	private String email;
}
