/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fractalgames.sevice.impl;

import com.fractalgames.domain.Rol;
import com.fractalgames.domain.Usuario;
import com.fractalgames.domain.repository.UsuarioRepository;
import com.fractalgames.dto.UsuarioRegistroDTO;
import com.fractalgames.sevice.UsuarioService;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService{
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    
    
    @Override
    public Usuario save(UsuarioRegistroDTO registroDTO) {
        Usuario usuario = new Usuario(registroDTO.getNombre(),
                                        registroDTO.getApellido(),
                                        registroDTO.getEmail(),
                                        registroDTO.getPassword(),
                                        Arrays.asList(new Rol("ROLE_USER")));
        return usuarioRepository.save(usuario);
    }
    
}