/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author T-102
 */
public class Primero {
    public static void main(String[] args) {
        int x[]={5,-2,6};
        System.out.println(x[0]);
        System.out.println(x.length);
        //vamos a iterar el arreglo con un ciclo for 
        for(int i=0;i<3;i++)
        {
            System.out.println(x[i]);
        }
        //lo mismo pero mejor
        for(int a:x)
        {
            System.out.println(a);
        }
    }
}
