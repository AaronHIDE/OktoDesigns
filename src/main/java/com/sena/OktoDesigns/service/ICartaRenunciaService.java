package com.sena.OktoDesigns.service;

import java.util.List;
import java.util.Optional;

import com.sena.OktoDesigns.model.cartaRenuncia;

public interface ICartaRenunciaService {

	 // Create
    public cartaRenuncia save(cartaRenuncia cartaRenuncia);

    // Read
    public Optional<cartaRenuncia> get(Integer id);
    
    // Update
    cartaRenuncia update(cartaRenuncia cartaRenuncia);

    // Lists - tables
    public List<cartaRenuncia> findAll();

    // Find by ID
    public Optional<cartaRenuncia> findById(Integer id);
    
	public void delete(Integer id);	
 
}