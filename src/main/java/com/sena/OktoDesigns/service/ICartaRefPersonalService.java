package com.sena.OktoDesigns.service;

import java.util.List;

import java.util.Optional;

import com.sena.OktoDesigns.model.cartaRefPersonal;

public interface ICartaRefPersonalService {
	
	// Create
	
	public cartaRefPersonal save(cartaRefPersonal cartaRefPersonal);
	
	// Read
	
	public Optional<cartaRefPersonal> get(Integer Id);
	public void update(cartaRefPersonal hojaVida);
	
	
// lists - tables
	public List<cartaRefPersonal> findAll();

}
