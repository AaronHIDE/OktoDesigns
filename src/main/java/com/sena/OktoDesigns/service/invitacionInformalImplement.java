package com.sena.OktoDesigns.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.OktoDesigns.model.InvitacionInformal;
import com.sena.OktoDesigns.repository.invitacionInformalRepository;

@Service
public class invitacionInformalImplement implements IinvitacionInformalService{
	
	@Autowired
	private invitacionInformalRepository invitacionInformalRepository;

	@Override
	public InvitacionInformal save(InvitacionInformal invitacionInformal) {
		// TODO Auto-generated method stub
		return invitacionInformalRepository.save(invitacionInformal);
	}

	@Override
	public Optional<InvitacionInformal> get(Integer Id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public void update(InvitacionInformal invitacionInformal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer Id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<InvitacionInformal> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
