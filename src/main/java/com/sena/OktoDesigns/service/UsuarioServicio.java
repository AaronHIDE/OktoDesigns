package com.sena.OktoDesigns.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.sena.OktoDesigns.controller.dto.UsuarioRegistroDTO;
import com.sena.OktoDesigns.model.Usuario;

public interface UsuarioServicio extends UserDetailsService {

	public Usuario guardar(UsuarioRegistroDTO registroDTO);
	
	public List<Usuario> listarUsuarios();
}
