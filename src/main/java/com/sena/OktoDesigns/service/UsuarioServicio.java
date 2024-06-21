package com.sena.OktoDesigns.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.sena.OktoDesigns.controller.dto.UsuarioNombreCambioDTO;
import com.sena.OktoDesigns.controller.dto.UsuarioRegistroDTO;
import com.sena.OktoDesigns.model.Usuario;

public interface UsuarioServicio extends UserDetailsService {
	
	Usuario findByEmail(String email);

	public Usuario guardar(UsuarioRegistroDTO registroDTO);
	
	public List<Usuario> listarUsuarios();
	
	Usuario actualizarNombreUsuario(Integer id, UsuarioNombreCambioDTO nombreCambioDTO);
	
	 boolean actualizarContrasena(Integer id, String currentPassword, String newPassword); // Añadir esta línea
}