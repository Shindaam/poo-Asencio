/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.asencio;

/**
 *
 * @author T-102
 */
public class PooAsencio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Mundo");
        
        //Tenemos que generar antes los objetos de las clases anteriores
        
        
        /*Constructor*/Usuario x=new Usuario();
        x.altura=1.68f;
        x.peso=71f;
        /*Constructor*/Imc algo=new Imc();
        /*Objeto algo.atributo u=x*/algo.u=x;
        
        
        //Calculamos el imc a traves de su objeto
        System.out.println(algo.calcular());
        
                
    }
    
}
