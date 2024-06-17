package com.sena.OktoDesigns.service;

import java.util.List;
import java.util.Optional;

import com.sena.OktoDesigns.model.cartaRefPersonal;

public interface IcartaRefPersonalService {
	// create
	public cartaRefPersonal save(cartaRefPersonal ReferenciaPersonal);
	// read
	public Optional<cartaRefPersonal> get(Integer Id);
	public void update(cartaRefPersonal ReferenciaPersonal);
	public void delete(Integer Id);	
	// lists - tables
	public List<cartaRefPersonal> findAll();

}
