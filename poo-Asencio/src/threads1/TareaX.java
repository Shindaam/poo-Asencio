/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads1;

/**
 *
 * @author T-102
 * Primera forma de Crear un Thread:
 * Heredando la clase Thread
 */
public class TareaX extends Thread{
    @Override
    public void run()
    {
        System.out.println("Soy un thread muy sencillito "+"Y me llamo "+Thread.currentThread().getName());
       
    }
}
