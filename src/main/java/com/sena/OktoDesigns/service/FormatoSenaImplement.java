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
	public Optional<FormatoSena> get(Integer id) {
		// TODO Auto-generated method stub
		return formatoSenaRepository.findById(id);
	}

    @Override
    public FormatoSena update(FormatoSena formatoSena) {

        if(formatoSenaRepository.existsById(formatoSena.getId())) {
            return formatoSenaRepository.save(formatoSena);
        } else {
            throw new RuntimeException("Formato no encontrado");
        }
    }

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		formatoSenaRepository.deleteById(id);
	}

	@Override
	public List<FormatoSena> findAll() {		
		return formatoSenaRepository.findAll();
	}

    @Override
    public Optional<FormatoSena> findById(Integer id) {
        return formatoSenaRepository.findById(id);
    }
}