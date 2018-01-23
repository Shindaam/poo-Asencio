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
public class Imc {
    //El siguiente atributo es de tipo composicion agregacion
    
    /*Atributo u de tipo Usuario*/Usuario u;
    
    public String calcular()
    {
        float imc=u.getPeso()/(u.getAltura()*u.getAltura());
        
        return "Aqui aparecera tu IMC: "+imc;
    }
}
