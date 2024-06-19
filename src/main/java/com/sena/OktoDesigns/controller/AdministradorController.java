package com.sena.OktoDesigns.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;


@Controller
@RequestMapping("/administrador")
public class AdministradorController {
	
	@GetMapping("")
	public String home(Model model) {
		return "administrador/home";
	}
	
	@GetMapping("/email")
	public String email(Model model) {
		return "administrador/email";
	}
	
	@GetMapping("/formatoSena")
	public String formatoSena(Model model) {
		return "administrador/formatoSena";
	}
	
	@GetMapping("/formato")
	public String formato(Model model) {
		return "administrador/formato";
	}
	
	@GetMapping("/formatoSave")
	public String formatoSave(Model model) {
		return "administrador/formatoSave";
	}
	
	@GetMapping("/perfil")
	public String perfil(Model model) {
		return "administrador/perfil";
	}

	@GetMapping("/cartaRefPersonal")
	public String cartaRefPersonal(Model model) {
		return "administrador/cartaRefPersonal";
	}
	
	@GetMapping("/cartaRefPersonalSave")
	public String cartaRefPersonalSave(Model model) {
		return "administrador/cartaRefPersonalSave";
	}

	@GetMapping("/invitacionFormal")
	public String invitacionFormal(Model model) {
		return "administrador/invitacionFormal";
	}

	@GetMapping("/cartaRenuncia")
	public String cartaRenuncia(Model model) {
		return "administrador/cartaRenuncia";
	}
	
	@GetMapping("/cartaRenunciaSave")
	public String cartaRenunciaSave(Model model) {
		return "administrador/cartaRenunciaSave";
	}
	
	@GetMapping("/signature")
	public String firma(Model model) {
		return "administrador/signature";
	}
	
	@GetMapping("/cerrar")
	public String cerrarSesion(HttpSession session) {
		session.removeAttribute("idUsuario");
		return "redirect:/";
	}

}
