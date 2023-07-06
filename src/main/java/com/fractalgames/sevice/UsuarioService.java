
package com.fractalgames.sevice;

import com.fractalgames.domain.Usuario;
import com.fractalgames.dto.UsuarioRegistroDTO;

public interface UsuarioService {
    
    public Usuario save(UsuarioRegistroDTO registroDTO);
    
}
