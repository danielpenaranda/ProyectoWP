/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fractalgames.sevice.impl;

import com.fractalgames.dao.RegisterDao;
import com.fractalgames.dao.UsuarioDao;
import com.fractalgames.domain.Rol;
import com.fractalgames.domain.Usuario;
import com.fractalgames.domain.repository.UsuarioRepository;
import com.fractalgames.dto.UsuarioRegistroDTO;
import com.fractalgames.sevice.UsuarioService;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioServiceImpl implements UsuarioService{
    
    @Autowired
    private UsuarioDao usuarioDao;

     @Override
     @Transactional (readOnly=true)
    public List<Usuario> getUsuario(Usuario usuario) {
        return (List<Usuario>) usuarioDao.findById(usuario.getId()).orElse(null);
    }

    @Override
    @Transactional (readOnly=true)
    public List<Usuario> getUsuario(boolean activo) {
        var lista = usuarioDao.findAll();
        if (activo) {
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }
    
    
    @Override
    public Usuario save(UsuarioRegistroDTO registroDTO) {
        Usuario usuario = new Usuario(registroDTO.getNombre(),
                                        registroDTO.getApellido(),
                                        registroDTO.getEmail(),
                                        registroDTO.getPassword(),
                                        Arrays.asList(new Rol("USER")));
        return usuarioDao.save(usuario);
    }

    
    @Override
    public boolean validarCredenciales(String email, String password) {
        Usuario usuario = usuarioDao.findByEmail(email);
        if (usuario == null) {
            return false;
        }
        return usuario.getPassword().equals(password);
    }
    @Override
    public boolean findByEmail(String email) {
        Usuario usuarioEncontrado = usuarioDao.findByEmail(email);
        return usuarioEncontrado != null;
    }


    
}
