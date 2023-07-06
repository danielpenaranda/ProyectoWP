package com.fractalgames.controller;

import ch.qos.logback.core.model.Model;
import com.fractalgames.dto.UsuarioRegistroDTO;
import com.fractalgames.sevice.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author HUAWEI PC
 */
@Controller
@RequestMapping("/login")

public class loginController {
    @Autowired
    private UsuarioService usuarioservice;
    
    @ModelAttribute("usuario")
    public UsuarioRegistroDTO retornarNuevoUsuarioRegistroDTO(){
        return new UsuarioRegistroDTO();
    }
    
      @GetMapping("/login")
    public String mostrarLogin(Model model){
        return "login";
    }
    
    @PostMapping("/login/iniciar")
    public String iniciarUsuario(@ModelAttribute("usuario") UsuarioRegistroDTO usuarioDTO) {
        usuarioservice.save(usuarioDTO);
        return "redirect:/index";
    }
}
