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
	public Optional<InvitacionInformal> get(Integer id) {
		// TODO Auto-generated method stub
		return invitacionInformalRepository.findById(id);
	}

	@Override
	public InvitacionInformal update(InvitacionInformal invitacionInformal) {
		
        if(invitacionInformalRepository.existsById(invitacionInformal.getId())) {
            return invitacionInformalRepository.save(invitacionInformal);
        } else {
            throw new RuntimeException("Formato no encontrado");
        }
	}

	   @Override
	    public Optional<InvitacionInformal> findById(Integer id) {
	        return invitacionInformalRepository.findById(id);
	    }

		@Override
		public void delete(Integer id) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public List<InvitacionInformal> findAll() {
			// TODO Auto-generated method stub
			return invitacionInformalRepository.findAll();
		}

	}