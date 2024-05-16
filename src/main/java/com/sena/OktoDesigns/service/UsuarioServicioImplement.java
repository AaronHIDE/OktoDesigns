package com.sena.OktoDesigns.service;

import org.springframework.stereotype.Service;

import com.sena.OktoDesigns.repository.UsuarioRepositorio;
import com.sena.OktoDesigns.controller.dto.UsuarioRegistroDTO;
import com.sena.OktoDesigns.model.Usuario;

@Service
public class UsuarioServicioImplement implements UsuarioServicio {

	private UsuarioRepositorio usuarioRepositorio;
	
	
	
	public UsuarioServicioImplement(UsuarioRepositorio usuarioRepositorio) {
		super();
		this.usuarioRepositorio = usuarioRepositorio;
	}



	@Override
	public Usuario guardar(UsuarioRegistroDTO registroDTO) {
		Usuario usuario = new Usuario(registroDTO.getId(), registroDTO.getNombre(), registroDTO.getEmail(), registroDTO.getPassword());
		return usuarioRepositorio.save(usuario);
	}

}
