package com.fractalgames.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/index")
    public String getIndexPage() {
        return "index";
    }
    
    @GetMapping("/listado")
    public String getRegisterPage() {
        // Antes: return "/registro/listado";
        return "registro/listado";
    }
    
}