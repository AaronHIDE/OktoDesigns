package com.sena.OktoDesigns.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sena.OktoDesigns.model.InvitacionInformal;
import com.sena.OktoDesigns.service.IinvitacionInformalService;

import ch.qos.logback.classic.Logger;

@Controller
@RequestMapping("/invitacionInformal")
public class InvitacionInformalController {
	
private final Logger LOGGER = (Logger) LoggerFactory.getLogger(InvitacionInformalController.class);
	
	@Autowired
	private IinvitacionInformalService invitacionInformalService;
	
	@GetMapping("")
	public String show(Model model) {
		model.addAttribute("invitacionInformal", invitacionInformalService.findAll());
		return "invitacionInformal/show";
	}
	
	@PostMapping("/save")    
    public String save(InvitacionInformal invitacionInformal) {
		LOGGER.info("Invitacion a guardar en la db {}", invitacionInformal);
		invitacionInformalService.save(invitacionInformal);
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
		return "redirect:/invitacionInformal";
	}
	
}