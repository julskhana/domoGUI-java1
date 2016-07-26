/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fnArchivo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author julian
 */
public class wrtArchivo {
    private ObjectOutputStream salida;
    
    //Funcion para abrir un archivo
    public void abrir(String ruta)throws IOException{
        try {
            File f = new File(ruta);
            FileOutputStream fos = new FileOutputStream(f,true);
            if (f.exists() && f.length()>0){
                salida = new ObjectOutputStream(fos) {protected void writeStreamHeader() throws IOException{}}; 
            }else{
                salida = new ObjectOutputStream(fos);
            }
        }catch (IOException e){
            System.err.println("ERROR ABRIENDO EL ARCHIVO...");
            throw e;
        }
        
    }
    
    //funcion para insertar objeto al archivo
    public void ins_obj(Object obj)throws IOException{
        try {
            salida.writeObject(obj);
            salida.flush();
        }catch (IOException e){
            System.err.println("ERROR ESCRIBIENDO EN EL ARCHIVO...");
            throw e;
        }
    }
    
    //funcion para borrar contenido de un archivo
    public void borrar_contenido(String ruta)throws IOException{
      try{
          File archivo = new File(ruta);
          archivo.delete();
          FileOutputStream fos = new FileOutputStream(archivo,true);
            if (archivo.exists() && archivo.length()>0)
                salida = new ObjectOutputStream(fos){protected void writeStreamHeader() throws IOException{}};
            else
                salida = new ObjectOutputStream(fos); 
      }catch(IOException e){
         System.err.println("ERROR BORRANDO CONTENIDO DEL ARCHIVO...");
         throw e;
      }
   }
    
   // funcion para cerrar un archivo
   public void cerrar()throws IOException{
      try{
         if(salida != null)
            salida.close();
      }catch(IOException e){
         System.err.println("ERROR CERRANDO ARCHIVO...");
         throw e;
      }
   }   
}
