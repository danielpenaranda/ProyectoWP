package com.fractalgames.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    @GetMapping("/index")
    public String getIndexPage(
            //ACA ESTABA
            @RequestParam(name = "minPrecio", required = false) Integer minPrecio,
            @RequestParam(name = "maxPrecio", required = false) Integer maxPrecio,
            Model model) {
        
        model.addAttribute("index"/*, filteredGiftCards*/);
        
        return "index";
    }
    
    @GetMapping("/listado")
    public String getRegisterPage() {
        // Antes: return "/registro/listado";
        return "registro/listado";
    }
    
    
    
}
/*@GetMapping("/index")
    public String getIndexPage() {
        return "index";
    }*/