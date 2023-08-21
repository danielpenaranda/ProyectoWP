/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fractalgames.sevice;

import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;


@Service
public interface UsuarioDetailsService {

    public UserDetails loadUserByEmail(String email, String password) throws UsernameNotFoundException;

}
