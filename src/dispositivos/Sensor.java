/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dispositivos;
import java.io.Serializable;
import java.util.ArrayList;

/**
Sensor
-id
-nombre
-ubicacion
-valorActual
-modelo
-fabricante
-tipo
-valorAlarma
-descripcion
-estado
 */

/**Esta clase guarda los atributos de sensor a usarse en el proyecto
 * @author Julian Bajaña
 * @author Christian Hidalgo
 * @version 1.3
 * 
 */

public class Sensor implements Serializable{
    private String id;
    private String nombre;
    private String ubicacion;
    private String modelo;
    private String fabricante;
    private String tipo;
    private String descripcion;
    private int val_act;
    private int val_alarma;
    
        public Sensor(String id,String nombre,String ubicacion,String modelo,String fabricante,String tipo,String descripcion,int val_act,int val_alarma){
        this.id = id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.val_act = val_act;
        this.val_alarma = val_alarma;
    }
    
    /** 
     *Funciones para obtener informacion
     * @return la id actual
     */
        
    public String getId() {
        return id;
    }
    
    /** 
     *Funciones para obtener informacion
     * @return el nombre actual
     */
    
    public String getNombre() {
        return nombre;
    }
    
    /** 
     *Funciones para obtener informacion
     * @return la ubicacion actual
     */
    
    public String getUbicacion() {
        return ubicacion;
    }
    
    /** 
     *Funciones para obtener informacion
     * @return el modelo actual
     */
    
    public String getModelo() {
        return modelo;
    }
    
    /** 
     *Funciones para obtener informacion
     * @return el fabricante actual
     */
    
    public String getFabricante() {
        return fabricante;
    }
    
    /** 
     *Funciones para obtener informacion
     * @return el tipo actual
     */
    
    public String getTipo() {
        return tipo;
    }
    
    /** 
     *Funciones para obtener informacion
     * @return la descripcion actual
     */
    
    public String getDescripcion() {
        return descripcion;
    }
    
    /** 
     *Funciones para obtener informacion
     * @return el valor actual
     */
    
    public int getValAct() {
        return val_act;
    }
    
    /** 
     *Funciones para obtener informacion
     * @return el valor de la alarma actual
     */
    
    public int getValAralma() {
        return val_alarma;
    }
    
    /**
     *Funciones para ingresar informacion
     *@param id String recibe el valor ingresado
     */
    
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     *Funciones para ingresar informacion
     *@param nombre String recibe el valor ingresado
     */
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     *Funciones para ingresar informacion
     *@param ubicacion String recibe el valor ingresado
     */
    
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    /**
     *Funciones para ingresar informacion
     *@param modelo String recibe el valor ingresado
     */
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    /**
     *Funciones para ingresar informacion
     *@param fabricante String recibe el valor ingresado
     */
    
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    /**
     *Funciones para ingresar informacion
     *@param tipo String recibe el valor ingresado
     */
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    /**
     *Funciones para ingresar informacion
     *@param descripcion String recibe el valor ingresado
     */
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    /**
     *Funciones para ingresar informacion
     *@param val_act String recibe el valor ingresado
     */
    
    public void setValAct(int val_act) {
        this.val_act = val_act;
    }
    
    /**
     *Funciones para ingresar informacion
     *@param val_alarma String recibe el valor ingresado
     */
    
    public void setValAlarma(int val_alarma) {
        this.val_alarma = val_alarma;
    }

    /**
     *Imprime la informacion del sensor
     */
    
    public void imprimirInfoSensor1(){
        System.out.println("* INFO. SENSOR *");
        System.out.println("Id:           "+id);
        System.out.println("Nombre:       "+nombre);
        System.out.println("Ubicacion:    "+ubicacion);
        System.out.println("Modelo:       "+modelo);
        System.out.println("Fabricante:   "+fabricante);
        System.out.println("Tipo:         "+tipo);
        System.out.println("Descripcion:  "+descripcion);
        System.out.println("Valor Actual: "+val_act);
        System.out.println("Valor Alarma: "+val_alarma);
        System.out.println("----------");
    }
    
    /**
     *Imprime la informacion de los sensores en horizontal
     */
    
    public void imprimirInfoSensor2(){
        System.out.println("*Información Sensor*");
        System.out.println("ID\t\tNombre\t\tUbic.\t\tModelo\t\tFabric.\t\tTipo\t\tDesc.\t\tValAct\t\tValAlarm");
        System.out.println(id+"\t\t"+nombre+"\t\t"+ubicacion+"\t\t"+modelo+"\t\t"+fabricante+"\t\t"+tipo+"\t\t"+descripcion+"\t\t"+val_act+"\t\t"+val_alarma);
    }
}
