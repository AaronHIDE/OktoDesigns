package com.sena.OktoDesigns.service;

import java.util.List;
import java.util.Optional;

import com.sena.OktoDesigns.model.HojaSena;


public interface HojaSenaService {
	// create
	public HojaSena save(HojaSena hojaSena);
	// read
	public Optional<HojaSena> get(Integer Id);
	public void update(HojaSena hojaSena);
	public void delete(Integer Id);	
	// lists - tables
	public List<HojaSena> findAll();
}
