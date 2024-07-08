package com.proyecto.distribuidas.Vistas.InterfacesVistas;
import com.proyecto.distribuidas.Vistas.*;;
public interface Clientes {
    public String ip = "";
    public String puerto = "";
    public Usuario usuarioActivo = new Usuario();
    
    
    public void IniciarSesion();
    public void CerrarSesion();

    public void RegistrarUsuario();
    public void ModificarCuenta();
    public void EliminarCuenta();
}
