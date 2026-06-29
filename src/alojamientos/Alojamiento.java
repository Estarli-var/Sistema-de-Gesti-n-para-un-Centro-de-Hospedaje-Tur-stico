/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alojamientos;

/**
 *
 * @author Wesley Ruiz
 */
public class Alojamiento {
    private String codigo;
    private String nombre;
    private int tipoHabitacion;
    private int capacidad;
    private int precio;
    private String estado;

    
    
    public String getCodigo() {
        return this.codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getTipoHabitacion() {
        return tipoHabitacion;
    }
    

    public int getCapacidad() {
        return this.capacidad;
    }

    public int getPrecio() {
        return this.precio;
    }

    public String isEstado() {
        return this.estado;
    }
    
    public int setPrecio(){
        return this.precio;
    }
    
    public String setEstado(){
        return estado;
    }

    public Alojamiento(String codigo, String nombre, int capacidad, int precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.precio = this.precio=20000;
        this.estado = this.estado = "Disponible" ;
    }

    public Alojamiento(int tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }
    
    
}
