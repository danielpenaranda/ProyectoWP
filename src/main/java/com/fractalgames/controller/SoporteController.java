package com.fractalgames.controller;


import com.fractalgames.domain.Soporte;
import com.fractalgames.sevice.SoporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class SoporteController {

    private final SoporteService soporteService;

    @Autowired
    public SoporteController(SoporteService soporteService) {
        this.soporteService = soporteService;
    }

    @GetMapping("/soporte/listado")
    public String getSoportePage(Model model) {
        model.addAttribute("soporte", new Soporte());
        return "soporte/listado";
    }

    @PostMapping("/soporte/guardar")
    public String guardarSoporte(@ModelAttribute Soporte soporte) {
        soporteService.guardarSolicitud(soporte);
        return "redirect:/soporte/listado";
    }
}

