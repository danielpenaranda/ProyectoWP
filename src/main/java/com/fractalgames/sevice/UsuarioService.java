
package com.fractalgames.sevice;

import com.fractalgames.domain.Usuario;
import com.fractalgames.dto.UsuarioRegistroDTO;
import java.util.List;

public interface UsuarioService {
    
    public List<Usuario> getUsuario(boolean activo);
    
    public List<Usuario> getUsuario(Usuario usuario);
    
    public Usuario save(UsuarioRegistroDTO registroDTO);

    public boolean findByEmail(String email);

    public boolean validarCredenciales(String email, String password);
    
}
