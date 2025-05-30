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

import com.sena.OktoDesigns.model.Formato;
import com.sena.OktoDesigns.service.IFormatoService;

import ch.qos.logback.classic.Logger;

@Controller
@RequestMapping("/formato")
public class FormatoController {

    private final Logger LOGGER = (Logger) LoggerFactory.getLogger(FormatoController.class);
    
    @Autowired
    private IFormatoService formatoService;
    
    @GetMapping("")
    public String show(Model model) {
        model.addAttribute("formato", formatoService.findAll());
        return "formato/show";
    }
    
    @PostMapping("/save")
    @ResponseBody
    public ResponseEntity<Formato> save(@RequestBody Formato formato) {
        LOGGER.info("Formato a guardar en la db {}", formato);
        Formato savedFormato = formatoService.save(formato);
        return ResponseEntity.ok(savedFormato);
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
}
