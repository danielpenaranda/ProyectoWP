
package com.fractalgames.sevice.impl;

import com.fractalgames.dao.JuegosDao;
import com.fractalgames.domain.Juegos;
import com.fractalgames.sevice.JuegosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author HUAWEI PC
 */
public class JuegosServiceImpl implements JuegosService{
    @Autowired
    private JuegosDao juegosDao;
   
   @Override
   @Transactional (readOnly=true)
   public List<Juegos> getjuegos(boolean activos){
       var lista = juegosDao.findAll();
       if (activos) {
           lista.removeIf(e -> !e.isActivo());
       }
       return lista;
   }
   
   @Override
   @Transactional (readOnly=true)
   public List<Juegos> getJuego (Juegos juegos){
       return (List<Juegos>) juegosDao.findById(juegos.getIdJuegos()).orElse(null);
   }
   @Override
   @Transactional
   public void save(Juegos juegos){
       juegosDao.save(juegos);
   }
   
   @Override
   @Transactional
   public void delete(Juegos juegos){
       juegosDao.delete(juegos);
   }
}
