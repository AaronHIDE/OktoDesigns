package com.sena.OktoDesigns.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeUserController {

	@GetMapping("")
	public String home(Model model) {
		return "usuario/home";
	}
	
	@GetMapping("/login")
	public String login(Model model) {
		return "usuario/login";
	}

	@GetMapping("/admin")
	public String admin(Model model) {
		return "redirect:/administrador";
	}
	
	@GetMapping("/hojasDeVida")
	public String hojasDeVida(Model model) {
		return "usuario/hojasDeVida";
	}
	
	@GetMapping("/formatosRegistraduria")
	public String formatosRegistraduria(Model model) {
		return "usuario/formatosRegistraduria";
	}
	
	@GetMapping("/formatosColegios")
	public String formatosColegios(Model model) {
		return "usuario/formatosColegios";
	}
	
	@GetMapping("/formatosUniversidades")
	public String formatosUniversidades(Model model) {
		return "usuario/formatosUniversidades";
	}
	
	@GetMapping("/infoFS")
	public String infoFS(Model model) {
		return "usuario/infoFS";
	}
	
	@GetMapping("/infoFE")
	public String infoFE(Model model) {
		return "usuario/infoFE";
	}
}
