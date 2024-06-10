package com.sena.OktoDesigns.controller;

import java.io.IOException;
import java.util.Optional;

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
import com.sena.OktoDesigns.service.UsuarioServicio;

import ch.qos.logback.classic.Logger;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/formatoSena")
public class FormatoSenaController {

	private final Logger LOGGER = (Logger) LoggerFactory.getLogger(FormatoSenaController.class);
	
	@Autowired
	private IFormatoSenaService formatoSenaService;
	@Autowired
	private UsuarioServicio usuarioService;
	
	@GetMapping("")
	public String show(Model model) {
		model.addAttribute("formatoSena", formatoSenaService.findAll());
		return "formatoSena/show";
	}
	
	@PostMapping("/save")
	public String save(FormatoSena formatosena, HttpSession session) throws IOException {
		LOGGER.info("Formato Sena a guardar en la db {}", formatosena);
//		Usuario u = UsuarioServicio.findById(Integer.parseInt(session.getAttribute("idUsuario").toString())).get();
//		formatosena.setUsuario(u);
		
		formatoSenaService.save(formatosena);
		return "redirect:/administrador";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable Integer id, Model model) {
		FormatoSena formatoSena = new FormatoSena();
			Optional<FormatoSena> optionalFormatoSena = formatoSenaService.get(id);
			formatoSena = optionalFormatoSena.get();
			LOGGER.info("Busqueda de formato sena: {}", formatoSena);
			model.addAttribute("formatoSena", formatoSena);
		return "";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Integer id) {
		return "redirect:/formatoSena";
	}
	
}
