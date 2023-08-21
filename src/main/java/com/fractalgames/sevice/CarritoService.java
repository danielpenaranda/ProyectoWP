/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fractalgames.sevice;

import com.fractalgames.dao.CarritoDao;
import com.fractalgames.dao.ProductoDao;
import com.fractalgames.domain.Carrito;
import com.fractalgames.domain.Producto;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service

public class CarritoService {

    @Autowired
    private CarritoDao carritoRepository;

    @Autowired
    private ProductoDao productoRepository;

    public void agregarProductoAlCarrito(Long productoId, Long usuarioId) {
        // 1. Buscar el carrito del usuario
        Carrito carrito = carritoRepository.findByUsuarioId(usuarioId);

        if (carrito == null) {
            // Lanzar una excepción o manejar este caso (por ejemplo, creando un nuevo carrito).
            throw new RuntimeException("Carrito no encontrado para el usuario con ID: " + usuarioId);
        }

        // 2. Verificar si el producto existe
        Producto producto = productoRepository.findById(productoId)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado con ID: " + productoId));

        // 3. Agregar el producto al carrito
        carrito.agregarProducto(producto);

        // 4. Guardar el carrito actualizado
        carritoRepository.save(carrito);
    }

    public Carrito obtenerCarritoPorUsuarioId(Long usuarioId) {
        Carrito carrito = carritoRepository.findByUsuarioId(usuarioId);
        if (carrito == null) {
            throw new RuntimeException("Carrito no encontrado para el usuario con ID: " + usuarioId);
        }
        return carrito;
    }
}



