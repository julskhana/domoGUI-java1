/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domogui;

import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author Laboratorio 5
 */
public class ConexionSerial implements SerialPortEventListener{
    public static BufferedReader entrada;
    public static OutputStream salida;
    public static final int TIME_OUT = 2000;
    public static final int DATA_RATE = 9600;
    public SerialPort puertoSerial;
    public Dashboard frm;

    public ConexionSerial(Dashboard frm){
        this.frm=frm;
    }
    
    
    public boolean conectar(String puerto){
        CommPortIdentifier puertoSel = null;
        Enumeration puertos = CommPortIdentifier.getPortIdentifiers();
        boolean resultado = true;
        
        while(puertos.hasMoreElements()){
           CommPortIdentifier p = (CommPortIdentifier)puertos.nextElement();
            if(p.getName().equalsIgnoreCase(puerto)){
                puertoSel = p;                
                break;
            }           
        }    
        
        if(puertoSel!=null){//CONECTARSE
            try{
                puertoSerial = (SerialPort)puertoSel.open("PracticaArduino", TIME_OUT);
                puertoSerial.setSerialPortParams(DATA_RATE,SerialPort.DATABITS_8,SerialPort.STOPBITS_1,SerialPort.PARITY_NONE);
                entrada = new BufferedReader(new InputStreamReader(puertoSerial.getInputStream()));
                salida = puertoSerial.getOutputStream();
                char ch = 1;
                salida.write(ch);
                puertoSerial.addEventListener(this);
                puertoSerial.notifyOnDataAvailable(true);                
            }catch(Exception e){
                System.out.println("OCURRIÓ UN ERROR EN LA CONEXIÓN");
                resultado = false;
            }
        }else{//MENSAJE DE ERROR
            System.out.println("El puerto seleccionado no existe");
            resultado = false;
        }
        return resultado;   
    }
    
    public static Vector obtenerPuertos(){
        Enumeration puertos = CommPortIdentifier.getPortIdentifiers();
        Vector resultado = new Vector();
        
        while(puertos.hasMoreElements()){
           CommPortIdentifier puerto = (CommPortIdentifier)puertos.nextElement();
           resultado.add(puerto.getName());                 
        }        
        return resultado;
    }
    
    public synchronized void desconectar(){
        if(puertoSerial != null){
            puertoSerial.removeEventListener();
            puertoSerial.close();
        }
    }
    
    public static synchronized void enviarDatos(String d){
        try{
            salida.write(d.getBytes());
        }catch(Exception e){
            System.out.println("Ocurrio un error en el envio");
        }    
    }
    
    public synchronized void serialEvent(SerialPortEvent e){
        if(e.getEventType() == SerialPortEvent.DATA_AVAILABLE){
            try{
                String linea = entrada.readLine();
                System.out.println(linea);
                frm.actualizarEstadoLEDs(Integer.parseInt(linea));
            }catch(Exception ex){
                
            }   
        }    
    }
    
}
