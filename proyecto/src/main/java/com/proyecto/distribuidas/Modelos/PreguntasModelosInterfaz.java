package com.proyecto.distribuidas.Modelos;

public interface PreguntasModelosInterfaz {
    public String pregunta = "";
    public String[] opciones = new String[4];
    public Integer respuestas = 0;
    public String categoria = "";

    public void CrearPregunta();
    public void ModificarPregunta();
    public void EliminarPregunta();

}
