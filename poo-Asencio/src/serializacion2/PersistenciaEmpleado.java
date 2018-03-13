/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import serializacion.Usuario;

/**
 *
 * @author T-102
 */
public class PersistenciaEmpleado {
    ArrayList<Empleado> empleados;
    
    public PersistenciaEmpleado()
    {
        empleados=new ArrayList<>();
    }
    //Generamos el metodo serializar a nuestro usuario

    public void  guardar(Empleado e)
    {
        //Para serializar el primer paso es generar el archivo fisico
        //donde esta nuestro objeto de tipo usuario
        File file=new File("empleados.yo");
        
        if(file.exists())
        {
            empleados= buscarTodos();
        }
        //Despues lo abrimos para escribir sobre el
        try{
        FileOutputStream fos=new FileOutputStream(file);
        //Luego Serializamos
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        //Guardamos el usuario!!!
        empleados.add(e);
        oos.writeObject(empleados);
        //Ponemos un mensaje
            System.out.println("Objeto guardado con exito!!!");
        }catch (Exception e){
    }
    }
    public ArrayList<Empleado> buscarTodos()
    {
        File file=new File("empleados.yo");
        try
        {
            FileInputStream fis=new FileInputStream(file);
            ObjectInputStream ois=new ObjectInputStream(fis);
            empleados=(ArrayList<Empleado>) ois.readObject();
            
        }catch(Exception e)
        {
            
        }
        return empleados;
    }
    public Usuario getU() {
        return u;
    }
public void setU(Usuario u) {
        this.u = u;
    }
    
   
public Usuario recobrarUsuario()
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
