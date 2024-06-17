package com.sena.OktoDesigns.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.OktoDesigns.model.invitacionFormal;
import com.sena.OktoDesigns.repository.invitacionFormalRepository;


@Service
public class invitacionFormalImplement implements IinvitacionFormalService{

	@Autowired
	private invitacionFormalRepository invitacionFormalRepository;
	
	@Override
	public invitacionFormal save(invitacionFormal invitacionFormal) {
		// TODO Auto-generated method stub
		return invitacionFormalRepository.save(invitacionFormal);
	}

	@Override
	public Optional<invitacionFormal> get(Integer Id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public void update(invitacionFormal invitacionFormal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer Id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<invitacionFormal> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
