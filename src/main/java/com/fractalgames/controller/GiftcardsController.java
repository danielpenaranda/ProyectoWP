package com.fractalgames.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author HUAWEI PC
 */
@Controller
public class GiftcardsController {
  
    @GetMapping("/giftcards/listado")
    public String getGiftcardsPage(
            //ACA ESTABA
            @RequestParam(name = "minPrice", required = false) Integer minPrice,
            @RequestParam(name = "maxPrice", required = false) Integer maxPrice,
            Model model) {
        
        // Aquí implementar la lógica de filtrado en función de los parámetros minPrice y maxPrice
        
        // Por ahora, supongamos que tienes una lista llamada "filteredGiftCards" con los productos filtrados
        model.addAttribute("giftCards");
        
        return "giftcards/listado";
    }
    
    
}
/*  @GetMapping("/giftcards/listado")
    public String getGiftcardsPage() {
        return "giftcards/listado";
    }*/