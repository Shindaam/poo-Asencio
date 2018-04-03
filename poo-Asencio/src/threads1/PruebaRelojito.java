/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads1;

import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-102
 */
public class PruebaRelojito {
    public static void main(String[] args) {
       Thread t1=new Thread(new Runnable(){

            public void run() { new Relojito().setVisible(true);
                   while(true){
        LocalTime tiempo=LocalTime.now();
        int hora=tiempo.getHour();
        int minuto=tiempo.getMinute();
        int segundo=tiempo.getSecond();
        System.out.println("La hora es "+hora+":"+minuto+":"+segundo);
        try{
        Thread.sleep(1000);
        }catch (InterruptedException ex){
            Logger.getLogger(ProbarThreads.class.getName()).log(Level.SEVERE,null,ex);
                    
        }
        }
            }
