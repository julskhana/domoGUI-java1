/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fnArchivo;

import dispositivos.Actuador;
import dispositivos.Sensor;
import funciones.Validacion;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author julian
 */
public class archivo {
    private static final String RUTA_SENSOR = "sensores.txt";
    private static final String RUTA_ACTUADOR = "actuadores.txt";    
    //funcion para crear los archivos de sensores y actuadores
    public static boolean crearS(){
        wrtArchivo archivo = new wrtArchivo();
        try{            
            archivo.abrir(RUTA_SENSOR);
            archivo.cerrar();
        }catch(IOException e){
            return false;
        }
        return true;
    }
    
    public static boolean crearA(){
        wrtArchivo archivo = new wrtArchivo();
        try{            
            archivo.abrir(RUTA_ACTUADOR);
            archivo.cerrar();
        }catch(IOException e){
            return false;
        }
        return true;
    }
    
    //escribir contenido de un archivo
    public static boolean borrar_contenidoS(){
        try{
            wrtArchivo archivo = new wrtArchivo();
            archivo.borrar_contenido(RUTA_SENSOR);
            archivo.cerrar();
        }catch(IOException e){
            return false;
        }
        return true;
    }
    
    public static boolean borrar_contenidoA(){
        try{
            wrtArchivo archivo = new wrtArchivo();
            archivo.borrar_contenido(RUTA_ACTUADOR);
            archivo.cerrar();
        }catch(IOException e){
            return false;
        }
        return true;
    }
        
    //obtener
    //registros de archivo sensores
    public static ArrayList<Sensor> obtener_registroS()throws Exception{
        ArrayList<Sensor> sensores;
        try{
            rdArchivo s = new rdArchivo();
            s.abrir(RUTA_SENSOR);
            sensores = s.get_objetos();
            s.cerrar();
        }catch(Exception e){
            throw e;
        }    
        return sensores;        
    }
    
    //registros de archivo actuadores
    public static ArrayList<Actuador> obtener_registroA()throws Exception{
        ArrayList<Actuador> actuadores;
        try{
            rdArchivo a = new rdArchivo();
            a.abrir(RUTA_ACTUADOR);
            actuadores = a.get_objetos();
            a.cerrar();
        }catch(Exception e){
            throw e;
        }    
        return actuadores;        
    }
    
    //insertar info de sensores en el archivo
    public static boolean insert_registroS(Sensor sensor){
        wrtArchivo s = new wrtArchivo();
        try{
            s.abrir(RUTA_SENSOR);
            s.ins_obj(sensor);
            s.cerrar(); 
        }catch(Exception e){
            return false;
        }                          
        return true;
    }
    
    //insertar info de actuadores en el archivo
    public static boolean insert_registroA(Actuador act){
        wrtArchivo a = new wrtArchivo();
        try{
            a.abrir(RUTA_ACTUADOR);
            a.ins_obj(act);
            a.cerrar(); 
        }catch(Exception e){
            return false;
        }                          
        return true;
    }
    
    //Actualizar
    //sensores
    public static boolean act_registroS(ArrayList sensor){
        borrar_contenidoS();
        wrtArchivo archivo = new wrtArchivo();
        try{            
            archivo.abrir(RUTA_SENSOR);
            for(int i=0;i<sensor.size();i++)
                archivo.ins_obj(sensor.get(i));
            archivo.cerrar();
        }catch(Exception e){
            return false;
        }                 
        return true;
    }
    
    //actuadores
    public static boolean act_registroA(ArrayList actuador){
        borrar_contenidoA();
        wrtArchivo archivo = new wrtArchivo();
        try{            
            archivo.abrir(RUTA_ACTUADOR);
            for(int i=0;i<actuador.size();i++)
                archivo.ins_obj(actuador.get(i));
            archivo.cerrar();
        }catch(Exception e){
            return false;
        }                 
        return true;
    }
    
    //actualizar datos
    //sensores
    public static boolean actDataS(Sensor s){        
        ArrayList<Sensor> registros = null;
        
        try{
            registros = archivo.obtener_registroS();
            for(int i=0;i<registros.size();i++){
                Sensor tmp = registros.get(i); 
                if(tmp.getId().equals(s.getId())){                
                    s.setId(tmp.getId());
                    s.setNombre(tmp.getNombre());
                    s.setUbicacion(tmp.getUbicacion());
                    s.setModelo(tmp.getModelo());
                    s.setFabricante(tmp.getFabricante());
                    s.setTipo(tmp.getTipo());
                    s.setDescripcion(tmp.getDescripcion());
                    s.setValAct((int) tmp.getValAct());
                    s.setValAlarma((int) tmp.getValAralma());
                    return true;
                }
            }
        }catch(Exception e){
            return false;
        }    
        return false;
    }
    
    //editar reg
    //ACtuadores
    public static boolean editar_registroA(Actuador a){        
        ArrayList<Actuador> registros = null;
        
        try{
            registros = archivo.obtener_registroA();
            for(Actuador tmp:registros){
                if(tmp.getaId().equals(a.getaId())){                
                    tmp.setaNombre(a.getaNombre());
                    tmp.setaUbicacion(a.getaUbicacion());
                    tmp.setaModelo(a.getaModelo());
                    tmp.setaFabricante(a.getaFabricante());
                    tmp.setaTipo(a.getaTipo());
                    tmp.setaDescripcion(a.getaDecripcion());
                    tmp.setaEstado((int) a.getaEstado());
                    return archivo.act_registroA(registros);
                }
            }
        }catch(Exception e){
            return false;
        }    
        return false;
    }
    
    //ACtuadores
    public static boolean editar_registroS(Sensor s){        
        ArrayList<Sensor> registros = null;
        //ArrayList<Sensor> registros;
        try{
            registros = archivo.obtener_registroS();
            for(Sensor tmp:registros){
                if(tmp.getId().equals(s.getId())){                
                    tmp.setNombre(s.getNombre());
                    tmp.setUbicacion(s.getUbicacion());
                    tmp.setModelo(s.getModelo());
                    tmp.setFabricante(s.getFabricante());
                    tmp.setTipo(s.getTipo());
                    tmp.setDescripcion(s.getDescripcion());
                    tmp.setValAct((int) s.getValAct());
                    tmp.setValAlarma((int) s.getValAralma());
                    return archivo.act_registroS(registros);
                }
            }
        }catch(Exception e){
            return false;
        }    
        return false;
    }
    
    //sensores
    public static boolean actDataA(Actuador a){        
        ArrayList<Actuador> registros = null;
        
        try{
            registros = archivo.obtener_registroA();
            for(int i=0;i<registros.size();i++){
                Actuador tmp = registros.get(i); 
                if(tmp.getaId().equals(a.getaId())){                
                    a.setaId(tmp.getaId());
                    a.setaNombre(tmp.getaNombre());
                    a.setaUbicacion(tmp.getaUbicacion());
                    a.setaModelo(tmp.getaModelo());
                    a.setaFabricante(tmp.getaFabricante());
                    a.setaTipo(tmp.getaTipo());
                    a.setaDescripcion(tmp.getaDecripcion());
                    a.setaEstado((int) tmp.getaEstado());
                    return true;
                }
            }
        }catch(Exception e){
            return false;
        }    
        return false;
    }
    
    //eliminacion de registros
    //sensores
    public static boolean eliminar_registroS(String id){
        ArrayList<Sensor> regs = null;
        
        try{
            regs = archivo.obtener_registroS();
            for(Sensor tmp:regs){
                if(tmp.getId().equals(id)){                
                    regs.remove(tmp);
                    return archivo.act_registroS(regs);
                }
            }
        }catch(Exception e){
            return false;
        }    
        return false;
    }
    
    //actuadores
    public static boolean eliminar_registro(String id){
        ArrayList<Actuador> rega = null;
        
        try{
            rega = archivo.obtener_registroA();
            for(Actuador tmp:rega){
                if(tmp.getaId().equals(id)){                
                    rega.remove(tmp);
                    return archivo.act_registroA(rega);
                }
            }
        }catch(Exception e){
            return false;
        }    
        return false;
    }
    
}

