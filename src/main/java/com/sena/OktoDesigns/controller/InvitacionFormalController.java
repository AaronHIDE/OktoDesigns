package com.sena.OktoDesigns.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sena.OktoDesigns.model.invitacionFormal;
import com.sena.OktoDesigns.service.IinvitacionFormalService;

import ch.qos.logback.classic.Logger;

@Controller
@RequestMapping("/invitacionFormal")
public class InvitacionFormalController {
private final Logger LOGGER = (Logger) LoggerFactory.getLogger(InvitacionInformalController.class);
	
	@Autowired
	private IinvitacionFormalService invitacionFormalService;
	
	@GetMapping("")
	public String show(Model model) {
		model.addAttribute("invitacionFormal", invitacionFormalService.findAll());
		return "invitacionFormal/show";
	}
	
	@PostMapping("/save")    
    public String save(invitacionFormal invitacionFormal) {
		LOGGER.info("Formato Sena a guardar en la db {}", invitacionFormal);
		invitacionFormalService.save(invitacionFormal);
		return "redirect:/administrador";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable Integer id, Model model) {
//		FormatoSena formatoSena = new FormatoSena();
//			Optional<FormatoSena> optionalFormatoSena = formatoSenaService.get(id);
//			invitacionFormal = optionalFormatoSena.get();
//			LOGGER.info("Busqueda de formato sena: {}", invitacionFormal);
//			model.addAttribute("invitacionFormal", invitacionFormal);
		return "";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Integer id) {
		return "redirect:/invitacionFormal";
	}
	
}