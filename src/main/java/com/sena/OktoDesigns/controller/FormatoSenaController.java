package com.sena.OktoDesigns.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sena.OktoDesigns.model.FormatoSena;
import com.sena.OktoDesigns.service.IFormatoSenaService;

import ch.qos.logback.classic.Logger;

@Controller
@RequestMapping("/formatoSena")
public class FormatoSenaController {

	private final Logger LOGGER = (Logger) LoggerFactory.getLogger(FormatoSenaController.class);

	@Autowired
	private IFormatoSenaService formatoSenaService;

	private static final ObjectMapper objectMapper = new ObjectMapper();

	@GetMapping("")
	public String show(Model model) {
		model.addAttribute("formatoSena", formatoSenaService.findAll());
		return "formatoSena/show";
	}

	@PostMapping("/save")
	public String save(FormatoSena formatoSena) {
		LOGGER.info("Formato Sena a guardar en la db {}", formatoSena);
		formatoSenaService.save(formatoSena);
		return "redirect:/administrador";
	}

	@GetMapping("/edit/{id}")
	public String edit(@PathVariable Integer id, Model model) {
//		FormatoSena formatoSena = new FormatoSena();
//			Optional<FormatoSena> optionalFormatoSena = formatoSenaService.get(id);
//			formatoSena = optionalFormatoSena.get();
//			LOGGER.info("Busqueda de formato sena: {}", formatoSena);
//			model.addAttribute("formatoSena", formatoSena);
		return "";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Integer id) {
		return "redirect:/formatoSena";
	}

	@GetMapping("/list")
	public List<FormatoSena> getAllFormatos() {
		return formatoSenaService.findAll();
	}

	@GetMapping("/{id}")
	public ModelAndView getFormatoById(@PathVariable Integer id) {
		ModelAndView modelAndView = new ModelAndView("administrador/formatoSenaSave");
		Optional<FormatoSena> optionalFormatoSena = formatoSenaService.get(id);
		if (optionalFormatoSena.isPresent()) {
			FormatoSena formatoSena = optionalFormatoSena.get();
			modelAndView.addObject("formatoSena", formatoSena);
		} else {
			// Manejar el caso cuando el formato no se encuentra
			// Por ejemplo, redirigir a una página de error o mostrar un mensaje
			modelAndView.addObject("mensaje", "Formato no encontrado");
		}
		return modelAndView;
	}

	@PostMapping("/update")
	public String update(@ModelAttribute("formatoSena") FormatoSena formatoSena) {
		LOGGER.info("Formato a actualizar en la db {}", formatoSena);
		formatoSenaService.update(formatoSena);
		return "redirect:/administrador";
	}

	@PostMapping("/cards")
	@ResponseBody
	public String cards(@RequestParam("verificacion") String verificacion) throws JsonProcessingException {
		Map<String, Object> mensaje = new HashMap<>();
		List<FormatoSena> datos = new ArrayList<>();

		try {
			datos = formatoSenaService.findAll();
			mensaje.put("codigo", "200");
			mensaje.put("informacion", datos);
			String jsonMessage = objectMapper.writeValueAsString(mensaje);
			return jsonMessage;
		} catch (Exception e) {
			mensaje.put("codigo", "425");
			mensaje.put("informacion", "");
			String jsonMessage = objectMapper.writeValueAsString(mensaje);
			return jsonMessage;
		}

	}
}
