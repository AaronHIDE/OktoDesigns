package com.sena.OktoDesigns.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.OktoDesigns.model.Formato;
import com.sena.OktoDesigns.repository.FormatoRepository;

@Service
public class FormatoImplement implements IFormatoService{
	
	@Autowired
	private FormatoRepository formatoRepository;

	@Override
	public Formato save(Formato hojaVida) {
		// TODO Auto-generated method stub
		return formatoRepository.save(hojaVida);
	}
	
	@Override
	public Optional<Formato> get(Integer Id){
		// TODO Auto-generated method stub
		return Optional.empty();
	}
	
	@Override
	public void update(Formato hojaVida) {
		// TODO Auto-generated method stub
	
	}
	

	@Override
	public List<Formato> findAll(){
		return formatoRepository.findAll();
	}
	
}
