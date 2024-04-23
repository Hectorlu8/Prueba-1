/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad_lig_dinamica;

/**
 *
 * @author hector
 */
public class Profesor extends Trabajador {
    private String departamento;
    
    Profesor(String dni, String nombre, String apellido1, String apellido2, String fechaNacimiento,int nrp,String departamento){
        super(dni,nombre,apellido1,apellido2,fechaNacimiento,nrp);
        this.departamento = departamento;
    }
    
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("departamento : "+departamento);
    }
}
