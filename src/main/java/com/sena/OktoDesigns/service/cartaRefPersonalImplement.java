package com.sena.OktoDesigns.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.OktoDesigns.model.cartaRefPersonal;
import com.sena.OktoDesigns.repository.cartaRefPersonalRepository;

@Service
public class cartaRefPersonalImplement implements IcartaRefPersonalService{

	@Autowired
	private cartaRefPersonalRepository cartaRefPersonalRepository;
	
	@Override
	public cartaRefPersonal save(cartaRefPersonal ReferenciaPersonal) {
		// TODO Auto-generated method stub
		return cartaRefPersonalRepository.save(ReferenciaPersonal);
	}

	@Override
	public Optional<cartaRefPersonal> get(Integer Id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public void update(cartaRefPersonal ReferenciaPersonal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer Id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<cartaRefPersonal> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


}
