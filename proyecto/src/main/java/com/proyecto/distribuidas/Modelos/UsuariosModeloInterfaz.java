package com.proyecto.distribuidas.Modelos;

import com.proyecto.distribuidas.Vistas.Usuario;

public interface UsuariosModeloInterfaz {
    public Usuario usuario = new Usuario();
    
    public void RegistrarUsuario();
    public void ModificarUsuario();
    public void EliminarUsuario();
}
