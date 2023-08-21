/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fractalgames.domain;

import java.io.Serializable;

/**
 *
 * @author moral
 */
public class CarritoProductoId implements Serializable {
    private Long carrito;
    private Long producto;

    public CarritoProductoId(Long carrito, Long producto) {
        this.carrito = carrito;
        this.producto = producto;
    }
    
    // getters, setters, equals, hashCode

    public Long getCarrito() {
        return carrito;
    }

    public void setCarrito(Long carrito) {
        this.carrito = carrito;
    }

    public Long getProducto() {
        return producto;
    }

    public void setProducto(Long producto) {
        this.producto = producto;
    }
}
