/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ETE;

/**
 *
 * @author T-102
 */
public class Alumno {
     private long cuenta;
     private String nombre,apaterno,amaterno;
     public Alumno(long cuenta, String nombre, String apaterno, String amaterno) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.apaterno = apaterno;
        this.amaterno = amaterno;
    }
    public long getCuenta() {
        return cuenta;
    }

    public void setCuenta(long cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApaterno() {
        return apaterno;
    }

    public void setApaterno(String apaterno) {
        this.apaterno = apaterno;
    }

    public String getAmaterno() {
        return amaterno;
    }

    public void setAmaterno(String amaterno) {
        this.amaterno = amaterno;
    }

  
    
    
}
