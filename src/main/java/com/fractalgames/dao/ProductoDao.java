/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fractalgames.dao;

import com.fractalgames.domain.Producto;
import java.math.BigDecimal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductoDao extends JpaRepository<Producto, Long> {
    
    // Búsqueda por nombre
    List<Producto> findByNombre(String nombre);

    // Búsqueda por descripción
    List<Producto> findByDescripcionContaining(String descripcion);

    // En caso de que quieras buscar un producto específico por su ID (aunque esto ya está incluido en JpaRepository)
    Optional<Producto> findById(Long id);

    // Si deseas buscar productos por un rango de precios:
    List<Producto> findByPrecioBetween(BigDecimal precioMinimo, BigDecimal precioMaximo);
}

