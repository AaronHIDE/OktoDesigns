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
import com.sena.OktoDesigns.model.cartaRefPersonal;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sena.OktoDesigns.service.ICartaRefPersonalService;

import ch.qos.logback.classic.Logger;

@Controller
@RequestMapping("/cartaRefPersonal")
public class CartaRefPersonalController {

	private final Logger LOGGER = (Logger) LoggerFactory.getLogger(CartaRefPersonalController.class);
	
	@Autowired
    private ICartaRefPersonalService cartaRefPersonalService;
	
    private static final ObjectMapper objectMapper = new ObjectMapper();
    
	 @GetMapping("")
	    public String show(Model model) {
	        model.addAttribute("cartaRefPersonal", cartaRefPersonalService.findAll());
	        return "cartaRefPersonal/show";
	    }
	    
	    @PostMapping("/save")
	    public String save(cartaRefPersonal cartaRefPersonal) {
	        LOGGER.info("Formato a guardar en la db {}", cartaRefPersonal);

	        cartaRefPersonalService.save(cartaRefPersonal);
	        return "redirect:/administrador";
	    }
	    
	    @GetMapping("/edit/{id}")
	    public String edit(@PathVariable Integer id, Model model) {
	        // Lógica para editar el formato, si es necesario
	        return "";
	    }
	    
	    @GetMapping("/list")
	    public List<cartaRefPersonal> getAllFormatos() {
	        return cartaRefPersonalService.findAll();
	    }
	    
	    @GetMapping("/{id}")
	    public ModelAndView getFormatoById(@PathVariable Integer id) {
	        ModelAndView modelAndView = new ModelAndView("administrador/cartaRefPersonalSave");
	        Optional<cartaRefPersonal> optionalCartaRefPersonal = cartaRefPersonalService.get(id);
	        if (optionalCartaRefPersonal.isPresent()) {
	        	cartaRefPersonal cartaRefPersonal = optionalCartaRefPersonal.get();
	            modelAndView.addObject("cartaRefPersonal", cartaRefPersonal);
	        } else {
	            // Manejar el caso cuando el formato no se encuentra
	            // Por ejemplo, redirigir a una página de error o mostrar un mensaje
	            modelAndView.addObject("mensaje", "Formato no encontrado");
	        }
	        return modelAndView;
	    }
	    
	    @PostMapping("/update")
	    public String update(@ModelAttribute("cartaRefPersonal") cartaRefPersonal cartaRefPersonal) {
	        LOGGER.info("Formato a actualizar en la db {}", cartaRefPersonal);
	        cartaRefPersonalService.update(cartaRefPersonal);
	        return "redirect:/administrador";
	    }

	    
	    @PostMapping("/cardsRef")
	    @ResponseBody
	    public String cardsRef(@RequestParam("verificacion") String verificacion) throws JsonProcessingException{
	    	Map<String,Object> mensaje = new HashMap<>();
	    	List<cartaRefPersonal> datos = new ArrayList<>();
	    	
	    	try {
	    		datos = cartaRefPersonalService.findAll();
	    		LOGGER.info("prueba {}", datos);
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
	    
		@GetMapping("/delete/{id}")
		public String delete(@PathVariable Integer id) {
			LOGGER.info("datos borrados{}", id);
			cartaRefPersonalService.delete(id);
			return "redirect:/administrador";
		}
	}