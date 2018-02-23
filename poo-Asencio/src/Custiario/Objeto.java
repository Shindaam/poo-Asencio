/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Custiario;

/**
 *
 * @author T-102
 */
public class Objeto {
    private String titulo;
    private boolean correcta;
    
    public Objeto (String titulo,boolean correcta)
    {
    this.titulo=titulo;
    this.correcta=correcta;
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
     * @return the correcta
     */
    public boolean isCorrecta() {
        return correcta;
    }

    /**
     * @param correcta the correcta to set
     */
    public void setCorrecta(boolean correcta) {
        this.correcta = correcta;
    }
    
    
    
    }

