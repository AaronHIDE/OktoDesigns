package com.sena.OktoDesigns.service;

import java.util.List;
import java.util.Optional;

import com.sena.OktoDesigns.model.Formato;

public interface IFormatoService {

    // Create
    public Formato save(Formato hojaVida);

    // Read
    public Optional<Formato> get(Integer id);
    
    // Update
    Formato update(Formato formato);

    // Lists - tables
    public List<Formato> findAll();

    // Find by ID
    public Optional<Formato> findById(Integer id);
    
	public void delete(Integer id);	
 
}