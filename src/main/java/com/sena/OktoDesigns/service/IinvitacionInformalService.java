package com.sena.OktoDesigns.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sena.OktoDesigns.model.InvitacionInformal;

@Service
public interface IinvitacionInformalService {
	// create
	public InvitacionInformal save(InvitacionInformal invitacionInformal);
	// read
	public Optional<InvitacionInformal> get(Integer Id);
	public void update(InvitacionInformal invitacionInformal);
	public void delete(Integer Id);	
	// lists - tables
	public List<InvitacionInformal> findAll();
}

