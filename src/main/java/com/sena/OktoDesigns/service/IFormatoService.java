package com.sena.OktoDesigns.service;

import java.util.List;

import java.util.Optional;

import com.sena.OktoDesigns.model.Formato;

public interface IFormatoService {

	// Create
	
	public Formato save(Formato hojaVida);
	
	// Read
	
	public Optional<Formato> get(Integer Id);
	public void update(Formato hojaVida);
	
	
// lists - tables
	public List<Formato> findAll();
	
}
