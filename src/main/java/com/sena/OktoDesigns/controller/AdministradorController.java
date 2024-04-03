package com.sena.OktoDesigns.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


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
	

}
