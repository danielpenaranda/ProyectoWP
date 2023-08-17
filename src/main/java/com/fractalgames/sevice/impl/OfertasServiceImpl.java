/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fractalgames.sevice.impl;

import com.fractalgames.dao.OfertasDao;
import com.fractalgames.domain.Ofertas;
import com.fractalgames.sevice.OfertasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author HUAWEI PC
 */
public class OfertasServiceImpl implements OfertasService{
    @Autowired
    private OfertasDao ofertasDao;
   
   @Override
   @Transactional (readOnly=true)
   public List<Ofertas> getOfertas(boolean activos){
       var lista = ofertasDao.findAll();
       if (activos) {
           lista.removeIf(e -> !e.isActivo());
       }
       return lista;
   }
   
   @Override
   @Transactional (readOnly=true)
   public List<Ofertas> getOferta (Ofertas ofertas){
       return (List<Ofertas>) ofertasDao.findById(ofertas.getIdOfertas()).orElse(null);
   }
   @Override
   @Transactional
   public void save(Ofertas ofertas){
       ofertasDao.save(ofertas);
   }
    
}
