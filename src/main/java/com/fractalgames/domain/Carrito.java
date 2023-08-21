/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fractalgames.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Table(name="carrito")
public class Carrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long usuarioId;
    private Date fechaCreacion;
    private BigDecimal total;

    @OneToMany(mappedBy = "carrito")
    private List<CarritoProducto> productosEnCarrito = new ArrayList<>();

    

    public List<CarritoProducto> getProducto() {
        return productosEnCarrito;
    }

    public void setProducto(List<CarritoProducto> producto) {
        this.productosEnCarrito = producto;
    }

    public Carrito(Long id, Long usuarioId, Date fechaCreacion, BigDecimal total) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.fechaCreacion = fechaCreacion;
        this.total = total;
    }


  

    public Carrito() {
        
    }

    // getters, setters, etc.

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Carrito get() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void agregarProducto(Producto producto) {
    CarritoProducto carritoProducto = new CarritoProducto();
    carritoProducto.setProducto(producto);
    carritoProducto.setCarrito(this);
    // También podrías configurar otros atributos aquí, como la cantidad.
    
    productosEnCarrito.add(carritoProducto);
}

}
