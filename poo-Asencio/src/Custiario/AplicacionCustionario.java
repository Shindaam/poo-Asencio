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


public class AplicacionCustionario {
    
    public static void main(String[] args) {
        
    
    Objeto op1=new Objeto("Grasa",false);
    Objeto op2=new Objeto("Contaminacion",false);
    Objeto op3=new Objeto("Sol",false);
        
    Objeto op4=new Objeto("azucar",false);
     ArrayList<Objeto> opciones =new ArrayList<> ();
     
     opciones.add(op1);
      opciones.add(op2);
      opciones.add(op3);
      opciones.add(op4);
    
     
     Pregunta p1=new Pregunta();
     p1.setTitulo("¿Cual es el pricipal causante de cancer");
     p1.setOpciones(opciones);
     
     ModeloCuestionario modelo=new ModeloCuestionario();
     modelo.agregrarpreguntas(p1);
     ArrayList<Pregunta> c=modelo.obtnercuestionario();
     for (Pregunta p:c)
     {
         System.out.println(p.getTitulo());
         for (Objeto o:p.getOpciones())
         {
             System.out.println(o.getTitulo()+" "+ o.isCorrecta());
         }
     }
}
}