package com.sena.OktoDesigns.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import com.sena.OktoDesigns.service.UsuarioServicio;

@Controller
public class RegistroControlador {

	@Autowired
	private UsuarioServicio servicio;
	
	@GetMapping("/login")
	public String iniciarSesion() {
		return "usuario/login";
	}
	
    @GetMapping("/home")
    public String verPaginaDeInicio(Model modelo) {
        modelo.addAttribute("usuarios", servicio.listarUsuarios());
        return "usuario/home"; // Asegúrate de que esta ruta coincide con tu archivo HTML
    }
	
}