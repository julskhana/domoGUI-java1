/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dispositivos;
import java.io.Serializable;

/**
Actuador
-id
-nombre
-modelo
-fabricante
-ubicacion
-estado
-tipo
-descripcion
*/

/**Esta clase guarda los atributos de actuador a usarse en el proyecto
 * @author Julian Bajaña
 * @author Norberto Vidal
 * @version 1.3
 */

public class Actuador implements Serializable{
    private String id;
    private String nombre;
    private String ubicacion;
    private String modelo;
    private String fabricante;
    private String tipo;
    private String descripcion;
    private int estado;
    
    public Actuador(String id,String nombre,String ubicacion,String modelo,String fabricante,String tipo,String descripcion,int estado){
        this.id = id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.estado = estado;
    }

   
    
    /** 
     *Funciones para obtener informacion
     * @return la id actual
     */
    
    public String getaId() {
        return id;
    }
    
    /** 
     *Funciones para obtener informacion
     * @return el nombre actual
     */
    
    public String getaNombre() {
        return nombre;
    }
          
    /** 
     *Funciones para obtener informacion
     * @return la ubicacion actual
     */
    
    public String getaUbicacion() {
        return ubicacion;
    }
    
    /** 
     *Funciones para obtener informacion
     * @return el fabricante actual
     */
    
    public String getaFabricante() {
        return fabricante;
    }
    
    /** 
     *Funciones para obtener informacion
     * @return el modelo actual
     */
    
    public String getaModelo() {
        return modelo;
    }
    
    /** 
     *Funciones para obtener informacion
     * @return el tipo actual
     */
    
    public String getaTipo() {
        return tipo;
    }
    
    /** 
     *Funciones para obtener informacion
     * @return la descipcion actual
     */
    
    public String getaDecripcion() {
        return descripcion;
    }
    
    /** 
     *Funciones para obtener informacion
     * @return el estado actual
     */
    
    public int getaEstado() {
        return estado;
    }
    
    
    /**
     *Funciones para ingresar informacion
     *@param id String recibe el valor ingresado
     */
    
    public void setaId(String id) {
        this.id = id;
    }
    
    /**
     *Funciones para ingresar informacion
     *@param nombre String recibe el valor ingresado
     */
    
    public void setaNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     *Funciones para ingresar informacion
     *@param modelo String recibe el valor ingresado
     */
    
    public void setaModelo(String modelo) {
        this.modelo = modelo;
    }
    
    /**
     *Funciones para ingresar informacion
     *@param ubicacion String recibe el valor ingresado
     */
    
    public void setaUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    /**
     *Funciones para ingresar informacion
     *@param fabricante String recibe el valor ingresado
     */
    
    public void setaFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    /**
     *Funciones para ingresar informacion
     *@param tipo String recibe el valor ingresado
     */
    
    public void setaTipo(String tipo) {
        this.tipo = tipo;
    }
    
    /**
     *Funciones para ingresar informacion
     *@param descripcion String recibe el valor ingresado
     */
    
    public void setaDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    /**
     *Funciones para ingresar informacion
     *@param estado String recibe el valor ingresado
     */
    
    public void setaEstado(int estado) {
        this.estado = estado;
    }
    
    /**
     *Imprime la informacion del actuador
     */
    
    public void imprimirInfoActuador1(){
        System.out.println("* INFO. ACTUADOR *");
        System.out.println("Id:          "+id);
        System.out.println("Nombre:      "+nombre);
        System.out.println("Ubicacion:   "+ubicacion);
        System.out.println("Modelo:      "+modelo);
        System.out.println("Fabricante:  "+fabricante);
        System.out.println("Tipo:        "+tipo);
        System.out.println("Descripcion: "+descripcion);
        System.out.println("Estado:      "+estado);
        System.out.println("----------");
    }
    
    /**
     *Imprime la informacion de los actuadores en horizontal
     */
    
    public void imprimirInfoActuador2(){
        System.out.println("*Información Actuador*");
        System.out.println("ID\t\tNombre\t\tUbic.\t\tModelo\t\tFabric.\t\tTipo\t\tDesc.\t\tEstado");
        System.out.println(id+"\t\t"+nombre+"\t\t"+ubicacion+"\t\t"+modelo+"\t\t"+fabricante+"\t\t"+tipo+"\t\t"+descripcion+"\t\t"+estado);
    }
}
