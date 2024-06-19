package com.sena.OktoDesigns.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.OktoDesigns.model.cartaRenuncia;
import com.sena.OktoDesigns.repository.CartaRenunciaRepository;

@Service
public class CartaRenunciaImplement implements ICartaRenunciaService{
	
	@Autowired
    private CartaRenunciaRepository cartaRenunciaRepository;

    @Override
    public cartaRenuncia save(cartaRenuncia cartaRenuncia) {
        return cartaRenunciaRepository.save(cartaRenuncia);
    }

    @Override
    public Optional<cartaRenuncia> get(Integer id) {
        return cartaRenunciaRepository.findById(id);
    }

    @Override
    public cartaRenuncia update(cartaRenuncia cartaRenuncia) {

        if(cartaRenunciaRepository.existsById(cartaRenuncia.getId())) {
            return cartaRenunciaRepository.save(cartaRenuncia);
        } else {
            throw new RuntimeException("Formato no encontrado");
        }
    }

    @Override
    public List<cartaRenuncia> findAll() {
        return cartaRenunciaRepository.findAll();
    }

    @Override
    public Optional<cartaRenuncia> findById(Integer id) {
        return cartaRenunciaRepository.findById(id);
    }
}