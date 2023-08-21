/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fractalgames.controller;

import com.fractalgames.domain.Carrito;
import com.fractalgames.sevice.CarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/carrito")
public class CarritoController {

    private static final Long USUARIO_ID_POR_DEFECTO = 1L;

    @Autowired
    private CarritoService carritoService;

    @PostMapping("/agregar/{productoId}")
    public ResponseEntity<Void> agregarProducto(@PathVariable Long productoId) {
        carritoService.agregarProductoAlCarrito(USUARIO_ID_POR_DEFECTO, productoId);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public Carrito verCarrito() {
        return carritoService.obtenerCarritoPorUsuarioId(USUARIO_ID_POR_DEFECTO);
    }
}


