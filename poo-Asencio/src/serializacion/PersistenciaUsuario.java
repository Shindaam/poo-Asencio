/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;

import java.io.*;
public class PersistenciaUsuario {
    Usuario u;
    //Generamos el metodo serializar a nuestro usuario

    public void  guardar()
    {
        //Para serializar el primer paso es generar el archivo fisico
        //donde esta nuestro objeto de tipo usuario
        File file=new File("archivo.ase");
        //Despues lo abrimos para escribir sobre el
        try{
        FileOutputStream fos=new FileOutputStream(file);
        //Luego Serializamos
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        //Guardamos el usuario!!!
        oos.writeObject(u);
        //Ponemos un mensaje
            System.out.println("Objeto guardado con exito!!!");
        }catch (Exception e){
    }
     
    
    public Usuario getU() {
        return u;
    }
public void setU(Usuario u) {
        this.u = u;
    }
    
   
public Usuario reobrarUsuario()
{
    File file=new File ("archivo.ase");
    Usuario recobrado=null;
    //El proceso inverso
    try{
    FileInputStream fis=new FileInputStream(file);
    ObjectInputStream ois=new ObjectInputStream(fis);
    recobrado=(Usuario) ois.readObject();
}catch(Exception e)
        {
        
        }
    return recobrado;
        }
}
