package com.sena.OktoDesigns.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sena.OktoDesigns.controller.FormatoSenaController;
import com.sena.OktoDesigns.model.FormatoSena;
import com.sena.OktoDesigns.service.IFormatoSenaService;

import ch.qos.logback.classic.Logger;

@Controller
@RequestMapping("/formatoSena")
public class FormatoSenaController {

	private final Logger LOGGER = (Logger) LoggerFactory.getLogger(FormatoSenaController.class);
	
	@Autowired
	private IFormatoSenaService formatoSenaService;
	
	@GetMapping("")
	public String show(Model model) {
		model.addAttribute("formatoSena", formatoSenaService.findAll());
		return "formatoSena/show";
	}
	
	@PostMapping("/save")
	public String save(FormatoSena formatosena) {
		LOGGER.info("Formato Sena a guardar en la db {}", formatosena);
		
		
		formatoSenaService.save(formatosena);
		return "redirect:/administrador";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable Integer id, Model model) {
		
		return "";
	}
	
}
