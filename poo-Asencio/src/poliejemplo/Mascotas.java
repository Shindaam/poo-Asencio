/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poliejemplo;

/**
 *
 * @author T-102
 */
public class Mascotas {
    public static void main(String[] args) {
        Animal animales[]=new Animal[12];
        
        //primero generamos alos gatos
        animales [0]=new Gato();        
       animales [1]=new Gato();
       animales [2]=new Gato();
         //Siguen los perros
         
         animales [3]=new Perro();
         animales [4]=new Perro();
         
         //Siguen los pollitos
         
         animales [5]=new Pollo();
         animales [6]=new Pollo();
         animales [7]=new Pollo();
         animales [8]=new Pollo();
         animales [9]=new Pollo();
         
         animales [10]=new Raton();
         animales [11]=new Raton();
         
         ServicioAnimales s=new ServicioAnimales();
        
        //la magia del poliformismo!!
        for(Animal a:animales)
        {
        s.servicioHacerRuido((ComportamientoAnimal)a);
        }
        
    }
    
}
