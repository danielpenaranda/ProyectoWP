package com.fractalgames.dao;

import com.fractalgames.domain.Ofertas;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author HUAWEI PC
 */
public interface OfertasDao extends JpaRepository <Ofertas,Long>{
     public List<Ofertas> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);
     //FALTA
}
