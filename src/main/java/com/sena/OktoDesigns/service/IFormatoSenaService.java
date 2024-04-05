package com.sena.OktoDesigns.service;

import java.util.List;
import java.util.Optional;

import com.sena.OktoDesigns.model.FormatoSena;


public interface IFormatoSenaService {
	// create
	public FormatoSena save(FormatoSena hojaSena);
	// read
	public Optional<FormatoSena> get(Integer Id);
	public void update(FormatoSena hojaSena);
	public void delete(Integer Id);	
	// lists - tables
	public List<FormatoSena> findAll();
}
