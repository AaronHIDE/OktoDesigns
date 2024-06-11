package com.sena.OktoDesigns.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sena.OktoDesigns.model.cartaRefPersonal;
import com.sena.OktoDesigns.service.ICartaRefPersonalService;


import ch.qos.logback.classic.Logger;

@Controller
@RequestMapping("/cartaRefPersonal")
public class CartaRefPersonalController {

	private final Logger LOGGER = (Logger) LoggerFactory.getLogger(CartaRefPersonalController.class);
	
	@Autowired
    private ICartaRefPersonalService cartaRefPersonalService;
    
    @GetMapping("")
    public String show(Model model) {
        model.addAttribute("cartaRefPersonal", cartaRefPersonalService.findAll());
        return "cartaRefPersonal/show";
    }
    
    @PostMapping("/save")
    @ResponseBody
    public ResponseEntity<cartaRefPersonal> save(@RequestBody cartaRefPersonal cartaRefPersonal) {
        LOGGER.info("Formato a guardar en la db {}", cartaRefPersonal);
        cartaRefPersonal savedcartaRefPersonal = cartaRefPersonalService.save(cartaRefPersonal);
        return ResponseEntity.ok(savedcartaRefPersonal);
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
}