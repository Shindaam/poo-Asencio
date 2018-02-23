/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Custiario;

import java.util.ArrayList;

/**
 *
 * @author T-102
 */
public class Pregunta {
    private String titulo;
    private ArrayList<Objeto> opciones;

    public Pregunta() {
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the opciones
     */
    public ArrayList<Objeto> getOpciones() {
        return opciones;
    }

    /**
     * @param opciones the opciones to set
     */
    public void setOpciones(ArrayList<Objeto> opciones) {
        this.opciones = opciones;
    }
    
}
