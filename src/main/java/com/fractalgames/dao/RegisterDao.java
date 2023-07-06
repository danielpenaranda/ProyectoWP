package com.fractalgames.dao;

import com.fractalgames.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author moral
 */
public interface RegisterDao extends JpaRepository <Usuario,Long>{
    
    
}
