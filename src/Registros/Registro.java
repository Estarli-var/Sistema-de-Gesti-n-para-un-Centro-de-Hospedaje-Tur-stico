/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Registros;

import clientes.Cliente;
import java.time.LocalDate;

/**
 *
 * @author Student
 */
public class Registro extends Cliente {
    public Registro(int identificacion, String nombreCompleto, LocalDate fechaNacimiento, int telefono, String correoElectronico, String pais) {
        super(identificacion, nombreCompleto, fechaNacimiento, telefono, correoElectronico, pais);
    }
}
