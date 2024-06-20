package com.sena.OktoDesigns.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.OktoDesigns.model.cartaRefPersonal;
import com.sena.OktoDesigns.repository.CartaRefPersonalRepository;

@Service
public class CartaRefPersonalImplement implements ICartaRefPersonalService{
	
	
	  
    @Autowired
    private CartaRefPersonalRepository cartaRefPersonalRepository;

    @Override
    public cartaRefPersonal save(cartaRefPersonal cartaRefPersonal) {
        return cartaRefPersonalRepository.save(cartaRefPersonal);
    }

    @Override
    public Optional<cartaRefPersonal> get(Integer id) {
        return cartaRefPersonalRepository.findById(id);
    }

    @Override
    public cartaRefPersonal update(cartaRefPersonal cartaRefPersonal) {

        if(cartaRefPersonalRepository.existsById(cartaRefPersonal.getId())) {
            return cartaRefPersonalRepository.save(cartaRefPersonal);
        } else {
            throw new RuntimeException("Formato no encontrado");
        }
    }

    @Override
    public List<cartaRefPersonal> findAll() {
        return cartaRefPersonalRepository.findAll();
    }

    @Override
    public Optional<cartaRefPersonal> findById(Integer id) {
        return cartaRefPersonalRepository.findById(id);
    }
}