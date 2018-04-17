/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ETE;

import java.io.*;
import serializacion.Usuario;
public class PersistenciaAlumno {
    Alumno a;
    public void guardar()
    {  
        File file=new File("alumnos");
        
        try{
        FileOutputStream fos=new FileOutputStream(file);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(a);
        
            System.out.println("Objeto guardado con exito!!!");
        }catch (Exception e){
    }
    }
    
    public Alumno getA() {
        return a;
    }

    public void setA(Alumno a) {
        this.a = a;
    }

public Alumno recobrarAlumno()
{
    File file=new File ("alumnos");
    Alumno recobrado=null;
    //El proceso inverso
    try{
    FileInputStream fis=new FileInputStream(file);
    ObjectInputStream ois=new ObjectInputStream(fis);
    recobrado=(Alumno) ois.readObject();
}catch(Exception e)
        {
        
        }
    return recobrado;
        }
}