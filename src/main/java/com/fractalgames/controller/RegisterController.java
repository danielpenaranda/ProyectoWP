
package com.fractalgames.controller;

import com.fractalgames.dto.UsuarioRegistroDTO;
import com.fractalgames.sevice.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
    public String mostrarFormularioRegister(){
        return "/registro/listado";
    }
    
    @PostMapping("/guardar")
    public String guardarUsuario(@ModelAttribute("usuario") UsuarioRegistroDTO usuarioDTO) {
        usuarioservice.save(usuarioDTO);
        return "redirect:/index";
    }
    
    
}
