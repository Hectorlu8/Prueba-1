/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad_lig_dinamica;

/**
 *
 * @author hector
 */
public class Alumno extends Persona {
    private int nia;
    
    Alumno(String dni, String nombre, String apellido1, String apellido2, String fechaNacimiento, int nia){
        super(dni,nombre,apellido1,apellido2,fechaNacimiento);
        this.nia = nia;
    }
    
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("nia : "+nia);
    }
}
