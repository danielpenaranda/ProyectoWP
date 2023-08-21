/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fractalgames.sevice.impl;

import com.fractalgames.dao.CarritoDao;
import com.fractalgames.dao.CarritoProductoDao;
import com.fractalgames.dao.ProductoDao;
import com.fractalgames.domain.Carrito;
import com.fractalgames.domain.CarritoProducto;
import com.fractalgames.domain.Producto;
import com.fractalgames.sevice.CarritoService;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author moral
 */
@Service
public class CarritoServiceImpl extends CarritoService {

    @Autowired
    private ProductoDao productoDao;
    
    @Autowired
    private CarritoDao carritoDao;
    
    @Autowired
    private CarritoProductoDao carritoProductoDao;

    @Override
    public void agregarProductoAlCarrito(Long usuarioId, Long productoId) {
        Producto producto = productoDao.findById(productoId).orElseThrow(() -> new RuntimeException("Producto no encontrado"));
        
        Carrito carrito = carritoDao.findByUsuarioId(usuarioId);
        if(carrito == null) {
            carrito = new Carrito();
            carrito.setUsuarioId(usuarioId);
            carrito.setFechaCreacion(new Date());
            carrito = carritoDao.save(carrito);
        }
        
        CarritoProducto carritoProducto = new CarritoProducto();
        carritoProducto.setCarrito(carrito);
        carritoProducto.setProducto(producto);
        carritoProducto.setCantidad(1); // puedes ajustar según necesidad
        
        carritoProductoDao.save(carritoProducto);
    }
    
    @Override
    public Carrito obtenerCarritoPorUsuarioId(Long usuarioId) {
        return carritoDao.findByUsuarioId(usuarioId);
    }
}

