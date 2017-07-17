/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fnArchivo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * @author julian
 */

public class rdArchivo {
    private ObjectInputStream entrada;
    
    public void abrir(String ruta)throws IOException{
         try{
         entrada = new ObjectInputStream(new FileInputStream(ruta));
      }catch(IOException e){
         System.err.println("ERROR ABRIENDO EL ARCHIVO.");
         throw e;
      }
    }
    
    public ArrayList get_objetos()throws Exception{
      Object obj;
      ArrayList registros = new ArrayList(); 
      try{ 
         while(true){              
            try{
                obj = (Object)entrada.readObject();
            }catch(Exception e){
                break;
            }
            registros.add(obj);                
         }
      }catch(Exception e){
          System.err.println("ERROR LEYENDO ARCHIVO.");
          throw e;
      }
      return registros;
   }   
    
   public void cerrar()throws IOException{
      try{
         if(entrada != null)
            entrada.close();         
      }catch(IOException e){
         System.err.println("ERROR CERRANDO ARCHIVO.");
         throw e;
      }
   } 
}
