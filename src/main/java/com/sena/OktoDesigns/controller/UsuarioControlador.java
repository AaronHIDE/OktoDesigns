package com.sena.OktoDesigns.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.sena.OktoDesigns.service.UsuarioServicio;
import com.sena.OktoDesigns.controller.dto.UsuarioNombreCambioDTO;

@Controller
public class UsuarioControlador {

    @Autowired
    private UsuarioServicio usuarioServicio;

    @PostMapping("/cambiar-nombre")
    @ResponseBody
    public String cambiarNombre(@RequestParam("id") Integer id, @RequestParam("nuevoNombre") String nuevoNombre) {
        UsuarioNombreCambioDTO dto = new UsuarioNombreCambioDTO();
        dto.setNuevoNombre(nuevoNombre);
        usuarioServicio.actualizarNombreUsuario(id, dto);
        return "Nombre de usuario actualizado correctamente";
    }
}
