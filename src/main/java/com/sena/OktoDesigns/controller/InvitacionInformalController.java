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
import com.sena.OktoDesigns.model.InvitacionInformal;
import com.sena.OktoDesigns.service.IinvitacionInformalService;

import ch.qos.logback.classic.Logger;


@Controller
@RequestMapping("/invitacionInformal")
public class InvitacionInformalController {
	
private final Logger LOGGER = (Logger) LoggerFactory.getLogger(InvitacionInformalController.class);
	
	@Autowired
	private IinvitacionInformalService invitacionInformalService;
	
    private static final ObjectMapper objectMapper = new ObjectMapper();
	
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
		LOGGER.info("datos borrados{}", id);
		invitacionInformalService.delete(id);
		return "redirect:/administrador";
	}
	
	   @GetMapping("/{id}")
	    public ModelAndView getFormatoById(@PathVariable Integer id) {
	        ModelAndView modelAndView = new ModelAndView("administrador/invitacionInformalSave");
	        Optional<InvitacionInformal> optionalInvitacionInformal = invitacionInformalService.get(id);
	        if (optionalInvitacionInformal.isPresent()) {
	        	InvitacionInformal invitacionInformal = optionalInvitacionInformal.get();
	            modelAndView.addObject("invitacionInformal", invitacionInformal);
	        } else {
	            // Manejar el caso cuando el formato no se encuentra
	            // Por ejemplo, redirigir a una página de error o mostrar un mensaje
	            modelAndView.addObject("mensaje", "Formato no encontrado");
	        }
	        return modelAndView;
	    }
	    
	    @PostMapping("/update")
	    public String update(@ModelAttribute("invitacionInformal") InvitacionInformal invitacionInformal) {
	        LOGGER.info("Formato a actualizar en la db {}", invitacionInformal);
	        invitacionInformalService.update(invitacionInformal);
	        return "redirect:/administrador";
	    }

	    
	    @PostMapping("/cards")
	    @ResponseBody
	    public String cards(@RequestParam("verificacion") String verificacion) throws JsonProcessingException{
	    	Map<String,Object> mensaje = new HashMap<>();
	    	List<InvitacionInformal> datos = new ArrayList<>();
	    	
	    	try {
	    		datos = invitacionInformalService.findAll();
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
