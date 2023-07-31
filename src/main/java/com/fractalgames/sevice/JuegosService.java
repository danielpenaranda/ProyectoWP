package com.fractalgames.sevice;

import com.fractalgames.domain.Juegos;
import java.util.List;

/**
 *
 * @author HUAWEI PC
 */
public interface JuegosService {
     //Listdo
    public List<Juegos> getjuegos(boolean activos);
    //UN JUEGO
    public List<Juegos> getJuego(Juegos juegos);
    
    public void save(Juegos juegos);
    
    public void delete(Juegos juegos);
    
    //Falta Consultas
}
