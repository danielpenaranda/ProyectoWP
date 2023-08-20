package com.fractalgames.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JuegosController {
    
   @GetMapping("/juegos/listado")
    public String getJuegosPage(
            //ACA ESTABA
            @RequestParam(name = "minPrecio", required = false) Integer minPrecio,
            @RequestParam(name = "maxPrecio", required = false) Integer maxPrecio,
            Model model) {
        
        model.addAttribute("juegos"/*, filteredGiftCards*/);
        
        return "juegos/listado";
    }
      
}
 /*@GetMapping("/juegos/listado")
    public String getJuegosPage() {
        return "juegos/listado";
    }*/