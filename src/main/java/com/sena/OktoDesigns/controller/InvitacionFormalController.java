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
import com.sena.OktoDesigns.model.invitacionFormal;
import com.sena.OktoDesigns.service.IinvitacionFormalService;

import ch.qos.logback.classic.Logger;

@Controller
@RequestMapping("/invitacionFormal")
public class InvitacionFormalController {
	
private final Logger LOGGER = (Logger) LoggerFactory.getLogger(InvitacionFormalController.class);
	
	@Autowired
	private IinvitacionFormalService invitacionFormalService;
	
    private static final ObjectMapper objectMapper = new ObjectMapper();
	
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
    
    @GetMapping("/{id}")
    public ModelAndView getFormatoById(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView("administrador/invitacionFormalSave");
        Optional<invitacionFormal> optionalInvitacionFormal = invitacionFormalService.get(id);
        if (optionalInvitacionFormal.isPresent()) {
        	invitacionFormal invitacionFormal = optionalInvitacionFormal.get();
            modelAndView.addObject("invitacionFormal", invitacionFormal);
        } else {
            // Manejar el caso cuando el formato no se encuentra
            // Por ejemplo, redirigir a una página de error o mostrar un mensaje
            modelAndView.addObject("mensaje", "Formato no encontrado");
        }
        return modelAndView;
    }
    
    @PostMapping("/update")
    public String update(@ModelAttribute("invitacionFormal") invitacionFormal invitacionFormal) {
        LOGGER.info("Formato a actualizar en la db {}", invitacionFormal);
        invitacionFormalService.update(invitacionFormal);
        return "redirect:/administrador";
    }

    
    @PostMapping("/cards")
    @ResponseBody
    public String cards(@RequestParam("verificacion") String verificacion) throws JsonProcessingException{
    	Map<String,Object> mensaje = new HashMap<>();
    	List<invitacionFormal> datos = new ArrayList<>();
    	
    	try {
    		datos = invitacionFormalService.findAll();
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
