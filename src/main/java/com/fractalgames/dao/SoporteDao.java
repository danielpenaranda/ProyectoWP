package com.fractalgames.dao;


import com.fractalgames.domain.Soporte;
import com.fractalgames.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SoporteDao extends JpaRepository<Soporte, Long> {

}