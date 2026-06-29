/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package habitaciones;

import alojamientos.Alojamiento;
/**
 *
 * @author Student
 */
public class Habitacion extends Alojamiento{
    private String piso;
    private boolean balcon ;

    public String getPiso() {
        return piso;
    }

    public boolean isBalcon() {
        return balcon;
    }

    public Habitacion(String piso, boolean balcon, String codigo, String nombre, int capacidad, int precio) {
        super(codigo, nombre, capacidad, precio);
        this.piso = piso;
        this.balcon = false;
    }
    
    public Habitacion(String codigo, String nombre, int capacidad, int precio) {
        super(codigo, nombre, capacidad, precio);
    }
    
   public int calcularCapacidad(int getCapacidad){
       if (5>getCapacidad()){
           System.out.println("la habitacion no tiene la capacidad");     
       }else{
            System.out.println("la habitacion tiene la capacidad");    
       }
        return getCapacidad();
   }
   
   public int calcualarImpuesto(int total){
    total=calcularNoche(calcularNoches*0.13);
    return total;
   
   public int calcularNoche(){
     return 0;
   }
   
    
}