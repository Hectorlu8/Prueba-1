/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad_lig_dinamica;

import java.util.Date;

/**
 *
 * @author hector
 */
public class Persona {
    
    private String dni;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String fechaNacimiento;

    public Persona(String dni, String nombre, String apellido1, String apellido2, String fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public void mostrarInformacion(){
        System.out.println("Persona : "+nombre +" "+apellido1+" "+apellido2+" Dni : "+dni+ " Fecha de nacimiento : "+fechaNacimiento+"  "+ this.getClass().getSimpleName() );
    }
}
