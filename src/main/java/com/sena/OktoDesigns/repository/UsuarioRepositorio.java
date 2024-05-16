package com.sena.OktoDesigns.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.OktoDesigns.model.Usuario;


@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> {
	
    // Aquí puedes agregar métodos personalizados si necesitas consultas específicas
	
	public Usuario findByEmail(String email);
	
}
