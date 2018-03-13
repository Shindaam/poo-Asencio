/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion2;

/**
 *
 * @author T-102
 */
public class Empleado {
    private String nombre;
    private String paterno;
    private String materno;
    private float sueldobase;
    private String departamento;

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", paterno=" + paterno + ", materno=" + materno + ", sueldobase=" + sueldobase + ", departamento=" + departamento + '}';
    }

     public Empleado(String nombre, String paterno, String materno, float sueldobase, String departamento)
    {
        this.departamento=departamento;
        this.materno=materno;
        this.nombre=nombre;
        this.paterno=paterno;
        this.sueldobase=sueldobase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public float getSueldobase() {
        return sueldobase;
    }

    public void setSueldobase(float sueldobase) {
        this.sueldobase = sueldobase;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
}
