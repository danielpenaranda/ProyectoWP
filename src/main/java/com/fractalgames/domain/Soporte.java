package com.fractalgames.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Soporte implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="nombre", nullable = false)
    private String nombre;

    @Column(name="email", nullable = false)
    private String email;
    
    @Column(name="razon", nullable = false)
    private String razon;
    
    @Column(name="mensaje", nullable = false)
    private String mensaje;
    
    public Soporte(String nombre, String email, String razon, String mensaje) {
        this.nombre = nombre;
        this.email = email;
        this.razon = razon;
        this.mensaje = mensaje;
    }

}

