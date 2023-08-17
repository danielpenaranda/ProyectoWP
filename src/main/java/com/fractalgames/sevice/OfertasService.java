package com.fractalgames.sevice;

import com.fractalgames.domain.Ofertas;
import java.util.List;

/**
 *
 * @author HUAWEI PC
 */
public interface OfertasService {
     //Listdo
    public List<Ofertas> getOfertas(boolean activos);
    //UN JUEGO
    public List<Ofertas> getOferta(Ofertas ofertas);
    
    public void save(Ofertas ofertas);
    
    
    //Falta Consultas
    
}
