package com.fractalgames.controller;


import com.fractalgames.domain.Usuario;
import com.fractalgames.sevice.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {
    
    private final UsuarioService usuarioService;

    @Autowired
    public LoginController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/login/listado")
    public String login(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "login/listado";
    }
    
    @PostMapping("/login/guardar")
    public String login(@ModelAttribute("usuario") Usuario usuario, RedirectAttributes attributes) {
        if (usuarioService.validarCredenciales(usuario.getEmail(), usuario.getPassword())) {
            attributes.addFlashAttribute("mensaje", "Inicio de sesión exitoso");
            return "redirect:/index";
        } else {
            attributes.addFlashAttribute("error", "Correo electrónico o contraseña incorrectos");
            return "redirect:/login/listado";
        }
    }
}

