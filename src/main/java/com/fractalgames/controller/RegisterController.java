
package com.fractalgames.controller;

import com.fractalgames.dto.UsuarioRegistroDTO;
import com.fractalgames.sevice.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registro")
public class RegisterController {
    
    @Autowired
    private UsuarioService usuarioservice;
    
    @ModelAttribute("usuario")
    public UsuarioRegistroDTO retornarNuevoUsuarioRegistroDTO(){
        return new UsuarioRegistroDTO();
    }
    
    @GetMapping("/listado")
    public String mostrarFormularioRegister() {
        // Antes: return "/registro/listado";
        return "registro/listado";
    }

    @PostMapping("/guardar")
    public String guardarUsuario(@ModelAttribute("usuario") UsuarioRegistroDTO usuarioDTO, Model model) {
        if (usuarioservice.findByEmail(usuarioDTO.getEmail())) {
            model.addAttribute("error", "Ya existe un usuario registrado con este correo electrónico.");
            return "registro/listado";
        }

        usuarioservice.save(usuarioDTO);
        return "redirect:/login/listado";
    }
    
}
