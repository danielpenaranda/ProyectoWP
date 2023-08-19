package com.fractalgames.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author HUAWEI PC
 */
@Data
@Entity
@Table(name="ofertas")
public class Ofertas implements Serializable{
    private static final long serialVersionUID= 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_ofertas")
    
    private Long idOfertas;
    private String nombreO;
    private String descripcion;
    private double precio;
    private double descuento;
    private double precioNuevo;
    private int existencias;
    private String rutaImagen;
    private boolean activo;

    public Ofertas() {
    }

    public Ofertas(String nombreO, String descripcion, double precio, double descuento, double precioNuevo, int existencias, String rutaImagen, boolean activo) {
        this.nombreO = nombreO;
        this.descripcion = descripcion;
        this.precio = precio;
        this.descuento=descuento;
        this.precioNuevo= precioNuevo;
        this.existencias = existencias;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }
    
    
}
