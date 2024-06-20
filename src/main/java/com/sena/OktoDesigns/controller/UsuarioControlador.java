package com.sena.OktoDesigns.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.sena.OktoDesigns.service.UsuarioServicio;
import com.sena.OktoDesigns.controller.dto.UsuarioNombreCambioDTO;
import com.sena.OktoDesigns.model.Usuario;

@RestController
public class UsuarioControlador {

    @Autowired
    private UsuarioServicio usuarioServicio;

    @PostMapping("/cambiar-nombre")
    public ResponseEntity<String> cambiarNombre(@RequestParam("nuevoNombre") String nuevoNombre) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        String email = userDetails.getUsername();

        Usuario usuario = usuarioServicio.findByEmail(email);
        if (usuario == null) {
            return ResponseEntity.badRequest().body("Usuario no encontrado");
        }

        UsuarioNombreCambioDTO dto = new UsuarioNombreCambioDTO();
        dto.setNuevoNombre(nuevoNombre);
        usuarioServicio.actualizarNombreUsuario(usuario.getId(), dto);
        return ResponseEntity.ok("Nombre de usuario actualizado correctamente");
    }

    @PostMapping("/cambiar-contrasena")
    @ResponseBody
    public String cambiarContrasena(@RequestParam String currentPassword, @RequestParam String newPassword, @RequestParam String confirmPassword) {
        if (!newPassword.equals(confirmPassword)) {
            return "Las nuevas contraseñas no coinciden.";
        }

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        String email = userDetails.getUsername();

        Usuario usuario = usuarioServicio.findByEmail(email);
        if (usuario == null) {
            return "Error: Usuario no encontrado.";
        }

        boolean result = usuarioServicio.actualizarContrasena(usuario.getId(), currentPassword, newPassword);
        if (result) {
            return "Contraseña actualizada correctamente.";
        } else {
            return "Error al actualizar la contraseña.";
        }
    }
}