package com.sena.OktoDesigns.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/galeria")
public class GaleriaController {

	@GetMapping("")
	public String home(Model model) {
		return "galeria/home";
	}
	
	@GetMapping("/hojasDeVida")
	public String hojasDeVida(Model model) {
		return "/galeria/hojasDeVida";
	}
	
	@GetMapping("/formatosRegistraduria")
	public String formatosRegistraduria(Model model) {
		return "/galeria/formatosRegistraduria";
	}
	
	@GetMapping("/formatosColegios")
	public String formatosColegios(Model model) {
		return "/galeria/formatosColegios";
	}
	
	@GetMapping("/formatosUniversidades")
	public String formatosUniversidades(Model model) {
		return "/galeria/formatosUniversidades";
	}
}
