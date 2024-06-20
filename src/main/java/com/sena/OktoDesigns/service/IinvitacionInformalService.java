package com.sena.OktoDesigns.service;

import java.util.List;
import java.util.Optional;

import com.sena.OktoDesigns.model.InvitacionInformal;

public interface IinvitacionInformalService {
	// create
	public InvitacionInformal save(InvitacionInformal invitacionInformal);
	
	// read
	public Optional<InvitacionInformal> get(Integer id);
	
	InvitacionInformal update(InvitacionInformal invitacionInformal);
	
	public void delete(Integer id);	
	
	// lists - tables
	public List<InvitacionInformal> findAll();
	
    public Optional<InvitacionInformal> findById(Integer id);
}

