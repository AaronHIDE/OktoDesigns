package com.sena.OktoDesigns.service;

import java.util.List;
import java.util.Optional;

import com.sena.OktoDesigns.model.FormatoSena;

public interface IFormatoSenaService {
	// create
	public FormatoSena save(FormatoSena hojavidaSENA);
	
	// read
	public Optional<FormatoSena> get(Integer id);
	
	FormatoSena update(FormatoSena formatoSena);
	
	public void delete(Integer Id);	
	
	// lists - tables
	public List<FormatoSena> findAll();
	public Optional<FormatoSena> findById(Integer id);

}
