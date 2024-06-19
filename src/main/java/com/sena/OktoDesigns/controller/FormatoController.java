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
import com.sena.OktoDesigns.model.Formato;
import com.sena.OktoDesigns.service.IFormatoService;

import ch.qos.logback.classic.Logger;


@Controller
@RequestMapping("/formato")
public class FormatoController {

    private final Logger LOGGER = (Logger) LoggerFactory.getLogger(FormatoController.class);
    
    @Autowired
    private IFormatoService formatoService;
  
    private static final ObjectMapper objectMapper = new ObjectMapper();
    
    @GetMapping("")
    public String show(Model model) {
        model.addAttribute("formato", formatoService.findAll());
        return "formato/show";
    }
    
    @PostMapping("/save")
    public String save(Formato formato) {
        LOGGER.info("Formato a guardar en la db {}", formato);

        formatoService.save(formato);
        return "redirect:/administrador";
    }
    
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        // Lógica para editar el formato, si es necesario
        return "";
    }
    
    @GetMapping("/list")
    public List<Formato> getAllFormatos() {
        return formatoService.findAll();
    }
    
    @GetMapping("/{id}")
    public ModelAndView getFormatoById(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView("administrador/formatoSave");
        Optional<Formato> optionalFormato = formatoService.get(id);
        if (optionalFormato.isPresent()) {
            Formato formato = optionalFormato.get();
            modelAndView.addObject("formato", formato);
        } else {
            // Manejar el caso cuando el formato no se encuentra
            // Por ejemplo, redirigir a una página de error o mostrar un mensaje
            modelAndView.addObject("mensaje", "Formato no encontrado");
        }
        return modelAndView;
    }
    
    @PostMapping("/update")
    public String update(@ModelAttribute("formato") Formato formato) {
        LOGGER.info("Formato a actualizar en la db {}", formato);
        formatoService.update(formato);
        return "redirect:/administrador";
    }

    
    @PostMapping("/cards")
    @ResponseBody
    public String cards(@RequestParam("verificacion") String verificacion) throws JsonProcessingException{
    	Map<String,Object> mensaje = new HashMap<>();
    	List<Formato> datos = new ArrayList<>();
    	
    	try {
    		datos = formatoService.findAll();
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
