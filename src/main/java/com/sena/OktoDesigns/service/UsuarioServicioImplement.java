package com.sena.OktoDesigns.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.sena.OktoDesigns.repository.UsuarioRepositorio;
import com.sena.OktoDesigns.controller.dto.UsuarioRegistroDTO;
import com.sena.OktoDesigns.controller.dto.UsuarioNombreCambioDTO;
import com.sena.OktoDesigns.model.Usuario;

@Service
public class UsuarioServicioImplement implements UsuarioServicio {

    private final UsuarioRepositorio usuarioRepositorio;
    private final BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public UsuarioServicioImplement(UsuarioRepositorio usuarioRepositorio, BCryptPasswordEncoder passwordEncoder) {
        this.usuarioRepositorio = usuarioRepositorio;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public Usuario guardar(UsuarioRegistroDTO registroDTO) {
        Usuario usuario = new Usuario(registroDTO.getId(), registroDTO.getNombre(), registroDTO.getEmail(), passwordEncoder.encode(registroDTO.getPassword()));
        return usuarioRepositorio.save(usuario);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepositorio.findByEmail(username);
        if (usuario == null) {
            throw new UsernameNotFoundException("Usuario/Password inválidos");
        }
        return new User(usuario.getEmail(), usuario.getPassword(), new ArrayList<>());
    }

    @Override
    public List<Usuario> listarUsuarios() {
        return usuarioRepositorio.findAll();
    }

    @Override
    public Usuario actualizarNombreUsuario(Integer id, UsuarioNombreCambioDTO nombreCambioDTO){
        Optional<Usuario> usuarioOptional = usuarioRepositorio.findById(id);
        if (usuarioOptional.isPresent()) {
            Usuario usuario = usuarioOptional.get();
            usuario.setNombre(nombreCambioDTO.getNuevoNombre());
            return usuarioRepositorio.save(usuario);
        }
        throw new UsernameNotFoundException("Usuario no encontrado");
    }
    
    @Override
    public Usuario findByEmail(String email) {
        return usuarioRepositorio.findByEmail(email);
    }
    
    @Override
    public boolean actualizarContrasena(Integer id, String currentPassword, String newPassword) {
        Optional<Usuario> usuarioOptional = usuarioRepositorio.findById(id);
        if (usuarioOptional.isPresent()) {
            Usuario usuario = usuarioOptional.get();
            if (passwordEncoder.matches(currentPassword, usuario.getPassword())) {
                usuario.setPassword(passwordEncoder.encode(newPassword));
                usuarioRepositorio.save(usuario);
                return true;
            }
        }
        return false;
    }

    
}
