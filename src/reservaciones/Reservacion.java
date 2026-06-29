/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservaciones;

import alojamientos.Alojamiento;
import clientes.Cliente;
import java.time.LocalDate;

/**
 *
 * @author Student
 */
public class Reservacion {
    private Cliente cliente;
    private Alojamiento alojamiento;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private Reservacion estado;

    public Cliente getCliente() {
        return cliente;
    }

    public Alojamiento getAlojamiento() {
        return alojamiento;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public Reservacion getEstado() {
        return estado;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Reservacion(Cliente cliente, Alojamiento alojamiento, LocalDate fechaEntrada, LocalDate fechaSalida) {
        this.cliente = cliente;
        this.alojamiento = alojamiento;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }
    
    public Reservacion(Reservacion estado) {
        this.estado = estado.getEstado();
    }
    
    protected void calcularNoches(){
        
    }
    
    
    
}
