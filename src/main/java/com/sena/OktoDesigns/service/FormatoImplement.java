package com.sena.OktoDesigns.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.OktoDesigns.model.Formato;
import com.sena.OktoDesigns.repository.FormatoRepository;

@Service
public class FormatoImplement implements IFormatoService {
    
    @Autowired
    private FormatoRepository formatoRepository;

    @Override
    public Formato save(Formato hojaVida) {
        return formatoRepository.save(hojaVida);
    }

    @Override
    public Optional<Formato> get(Integer id) {
        return formatoRepository.findById(id);
    }

    @Override
    public Formato update(Formato formato) {

        if(formatoRepository.existsById(formato.getId())) {
            return formatoRepository.save(formato);
        } else {
            throw new RuntimeException("Formato no encontrado");
        }
    }

    @Override
    public List<Formato> findAll() {
        return formatoRepository.findAll();
    }

    @Override
    public Optional<Formato> findById(Integer id) {
        return formatoRepository.findById(id);
    }
}