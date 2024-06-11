package com.sena.OktoDesigns.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.OktoDesigns.model.cartaRefPersonal;
import com.sena.OktoDesigns.repository.CartaRefPersonalRepository;

@Service
public class cartaRefPersonalImplement implements ICartaRefPersonalService{
	
	
	@Autowired
	private CartaRefPersonalRepository cartaRefPersonalRepository;
	public cartaRefPersonal save(cartaRefPersonal cartaRefPersonal) {
		// TODO Auto-generated method stub
		return cartaRefPersonalRepository.save(cartaRefPersonal);
	}

	@Override
	public Optional<cartaRefPersonal> get(Integer Id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public void update(cartaRefPersonal cartaRefPersonal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<cartaRefPersonal> findAll(){
		return cartaRefPersonalRepository.findAll();
	}
}
