package com.proyecto.distribuidas.Controllador;

import java.net.ServerSocket;

public interface ServerInterfaz {
    public String port = "";
    public String ip = "";
    public ServerSocket server = null;

    public void PedirCategorias();
    public void PedirPreguntas(String categoria);
    public void IniciarServidor();
    public void DetenerServidor();

    public void ConectarCliente();
    public void DesconectarCliente();

}
