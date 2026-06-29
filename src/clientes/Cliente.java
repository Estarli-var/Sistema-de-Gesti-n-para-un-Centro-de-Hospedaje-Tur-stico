/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clientes;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Student
 */
public class Cliente {
    private int identificacion;
    private String nombreCompleto;
    private LocalDate fechaNacimiento;
    private int telefono;
    private String correoElectronico;
    private String pais;

    public int getIdentificacion() {
        return identificacion;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getPais() {
        return pais;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }  
    
   
    public Period getEdad(){
        return Period.between(fechaNacimiento, LocalDate.now());
    }

    public Cliente(int identificacion, String nombreCompleto, LocalDate fechaNacimiento, int telefono, String correoElectronico, String pais) {
        this.identificacion = identificacion;
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "\nIdentificacion: " + identificacion + "\nNombre Completo: " + nombreCompleto + 
                "\nFecha Nacimiento: " + fechaNacimiento + "\nEdad: " + getEdad() + "años" +
                "\nTelefono: " + telefono + 
                "\nCorreo Electronico: " + correoElectronico + ", pais: " + pais;
    }
    
    
}
