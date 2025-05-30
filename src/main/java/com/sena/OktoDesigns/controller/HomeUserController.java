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
	
//	@GetMapping("/login")
//	public String login(Model model) {
//		return "usuario/login";
//	}

	@GetMapping("/admin")
	public String admin(Model model) {
		return "redirect:/administrador";
	}
	
	@GetMapping("/hojasDeVida")
	public String hojasDeVida(Model model) {
		return "usuario/hojasDeVida";
	}
	
	@GetMapping("/formatosCartas")
	public String formatosCartas(Model model) {
		return "usuario/formatosCartas";
	}
	
	@GetMapping("/formatosInvitaciones")
	public String formatosInvitaciones(Model model) {
		return "usuario/formatosInvitaciones";
	}
	
	@GetMapping("/herramientas")
	public String herramientas(Model model) {
		return "usuario/herramientas";
	}
	
	@GetMapping("/infoFS")
	public String infoFS(Model model) {
		return "usuario/infoFS";
	}
	
	@GetMapping("/infoFE")
	public String infoFE(Model model) {
		return "usuario/infoFE";
	}
	
	@GetMapping("/infoRefPersonal")
	public String infoRefPersonal(Model model) {
		return "usuario/infoRefPersonal";
	}
	
	@GetMapping("/infoCartaRenuncia")
	public String infoCartaRenuncia(Model model) {
		return "usuario/infoCartaRenuncia";
	}
	
	@GetMapping("/infoInvitacionFormal")
	public String infoInvitacionFormal(Model model) {
		return "usuario/infoInvitacionFormal";
	}
	
	@GetMapping("/infoInvitacionInformal")
	public String infoInvitacionInformal(Model model) {
		return "usuario/infoInvitacionInformal";
	}
	
}
