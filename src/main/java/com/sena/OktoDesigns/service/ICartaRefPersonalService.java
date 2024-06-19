package com.sena.OktoDesigns.service;

import java.util.List;
import java.util.Optional;

import com.sena.OktoDesigns.model.cartaRefPersonal;

public interface ICartaRefPersonalService {
	

    // Create
    public cartaRefPersonal save(cartaRefPersonal cartaRefPersonal);

    // Read
    public Optional<cartaRefPersonal> get(Integer id);
    
    // Update
    cartaRefPersonal update(cartaRefPersonal cartaRefPersonal);

    // Lists - tables
    public List<cartaRefPersonal> findAll();

    // Find by ID
    public Optional<cartaRefPersonal> findById(Integer id);

}
