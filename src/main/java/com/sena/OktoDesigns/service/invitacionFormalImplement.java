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
	public Optional<invitacionFormal> get(Integer id) {
		// TODO Auto-generated method stub
		return invitacionFormalRepository.findById(id);
	}

	@Override
	public invitacionFormal update(invitacionFormal invitacionFormal) {
		
        if(invitacionFormalRepository.existsById(invitacionFormal.getId())) {
            return invitacionFormalRepository.save(invitacionFormal);
        } else {
            throw new RuntimeException("Formato no encontrado");
        }
	}
	
    @Override
    public Optional<invitacionFormal> findById(Integer id) {
        return invitacionFormalRepository.findById(id);
    }

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		invitacionFormalRepository.deleteById(id);
	}

	@Override
	public List<invitacionFormal> findAll() {
		// TODO Auto-generated method stub
		return invitacionFormalRepository.findAll();
	}

}
