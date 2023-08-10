package com.fractalgames.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author HUAWEI PC
 */
@Controller
public class OfertasController {
    
    @GetMapping("/ofertas/listado")
    public String getOfertasPage() {
        return "ofertas/listado";
    }
    
}
