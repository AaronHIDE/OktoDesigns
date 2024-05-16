package com.sena.OktoDesigns.service;

import com.sena.OktoDesigns.controller.dto.UsuarioRegistroDTO;
import com.sena.OktoDesigns.model.Usuario;

public interface UsuarioServicio {

	public Usuario guardar(UsuarioRegistroDTO registroDTO);
	
}
