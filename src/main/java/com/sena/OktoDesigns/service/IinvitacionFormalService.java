package com.sena.OktoDesigns.service;

import java.util.List;
import java.util.Optional;

import com.sena.OktoDesigns.model.invitacionFormal;

public interface IinvitacionFormalService {
	// create
	public invitacionFormal save(invitacionFormal invitacionFormal);
	
	// read
	public Optional<invitacionFormal> get(Integer Id);
	
    // Update
	invitacionFormal update(invitacionFormal invitacionFormal);
	
	public void delete(Integer Id);	
	
	// lists - tables
	
	public List<invitacionFormal> findAll();
	
    // Find by ID
	public Optional<invitacionFormal> findById(Integer id);
}
