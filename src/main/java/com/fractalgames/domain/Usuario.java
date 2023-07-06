/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fractalgames.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import java.io.Serializable;
import java.util.Collection;
import lombok.Data;

@Data
@Entity
//Se mapea usuarios y con uniqueConstraints = @UniqueConstraint(columnNames = "email") estamos indicando que la
//columna de email va a ser unica
@Table(name = "usuarios", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Usuario implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    
    @Column(name="nombre")
    private String nombre;
    
    @Column(name="apellido")
    private String apellido;
    private String email;
    private boolean activo;
    private String password;
    
    //Se agrega la relacion de muchos a muchos ManyToMany
    //muchos usuarios pueden tener muchos roles y viceversa
    
    
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    //Vamos a indicar una relacion ManyToMany y vamos a unir las columnas con las columnas referenciadas
    //Con el inverso va a tomar el id y lo va a buscar con la otra tabla para hacer lo mismo
    @JoinTable(
            name = "usuarios_roles",
            joinColumns = @JoinColumn(
                    name = "usuario_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "rol_id", referencedColumnName = "id"))
    
    private Collection<Rol> roles;
    
    public Usuario(){
        super();
    }
    public Usuario(String nombre,String apellido, String email, String password, Collection roles){
        this.nombre=nombre;
        this.apellido=apellido;
        this.email=email;
        this.password=password;
        this.roles=roles;
    }
    public Usuario(Long id, String nombre,String apellido, String email, boolean activo, String password, Collection roles){
        super();
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.email=email;
        this.activo=activo;
        this.password=password;
        this.roles=roles;
    }
    
    public Long getId() {
        return id;
    }  
    public void setId(Long id) {
        this.id = id;
    }

    
    public String getNombre() {
        return nombre;
    }   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

   
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
 
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
