/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cabañas;

import alojamientos.Alojamiento;

/**
 *
 * @author Student
 */
public class Cabaña extends Alojamiento{
    private int metros;
    private String piscina;
    private int total;

    public int getMetros() {
        return metros;
    }

    public String getPiscina() {
        return piscina;
    }

    public Cabaña(int metros, String piscina, String codigo, String nombre, int capacidad, int precio) {
        super(codigo, nombre, capacidad, precio);
        this.metros = metros;
        this.piscina = piscina;
    }
    
    public Cabaña(String codigo, String nombre, int capacidad, int precio) {
        super(codigo, nombre, capacidad, precio);
    }
    
    public int calcularEspacio(int metros){
        if(this.metros>80) {
        System.out.println("es una cabaña amplia");
        }else{
            System.out.println("no es una cabaña amplia");
        }
        return metros;
    }
    public int calcualarImpuesto(int total){
    total=calcularNoche(calcularNoches*0.13);
    return total;
   
    
    }
    
    
    
}
