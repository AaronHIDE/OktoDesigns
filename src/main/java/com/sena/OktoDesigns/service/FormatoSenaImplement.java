package com.sena.OktoDesigns.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.OktoDesigns.model.FormatoSena;
import com.sena.OktoDesigns.repository.FormatoSenaRepository;

@Service
public class FormatoSenaImplement implements IFormatoSenaService{
	
	@Autowired
	private FormatoSenaRepository formatoSenaRepository;

	@Override
	public FormatoSena save(FormatoSena hojavidaSENA) {
		// TODO Auto-generated method stub
		return formatoSenaRepository.save(hojavidaSENA);
	}

	@Override
	public Optional<FormatoSena> get(Integer Id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public void update(FormatoSena hojaSena) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer Id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<FormatoSena> findAll() {		
		return formatoSenaRepository.findAll();
	}

	
}
