/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad_lig_dinamica;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hector
 */
public class Actividad_lig_dinamica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<Persona>();
        Persona per;
        Alumno al;
        Trabajador tra;
        Profesor pro;
        Scanner sc = new Scanner(System.in);
        String dni;
        String nombre;
        String apellido1;
        String apellido2;
        String fechaNacimiento;
        int nia;
        int nrp;
        String departamento;
        int comprobante;
        int indice=0;
        //nrp=Integer.parseInt(sc.nextLine());
        System.out.println("Dame el nombre de la persona");
        nombre = sc.nextLine();
        while(!"fin".equals(nombre)){
            System.out.println("Dame el dni de la persona");
            dni= sc.nextLine();
            System.out.println("Dame el primer apellido de la persona");
            apellido1 = sc.nextLine();
            System.out.println("Dame el segundo apellido de la persona");
            apellido2 = sc.nextLine();
            System.out.println("Dame la fecha de nacimietno de la persona");
            fechaNacimiento = sc.nextLine();
            System.out.println("Escriba 0 si la persona es un alumno, 1 si es un trabajador y 2 si es profesor");
            comprobante= sc.nextInt();
            if(comprobante == 0){
                System.out.println("Escriba el nia del alumno");
                nia = sc.nextInt();
                al = new Alumno(dni,nombre,apellido1,apellido2,fechaNacimiento,nia);
                personas.add(al);
            }
            if(comprobante == 1){
                System.out.println("Escriba el nrp del trabajador");
                nrp = sc.nextInt();
                tra = new Trabajador(dni,nombre,apellido1,apellido2,fechaNacimiento,nrp);
                personas.add(tra);
            }
            if(comprobante == 2){
                System.out.println("Escriba el nrp del trabajador");
                nrp = sc.nextInt();
                System.out.println("Escriba el departamento del profesor");
                departamento = sc.next();
                pro = new Profesor(dni,nombre,apellido1,apellido2,fechaNacimiento,nrp,departamento);
                personas.add(pro);
            }
//            else{
//                per = new Persona(dni,nombre,apellido1,apellido2,fechaNacimiento);
//                personas.add(per);
//            }
// Se ejecuta solo
            System.out.println("Escriba el nombre de la próxima persona sino fin");
            nombre = sc.next();
        
        }
        while (indice<personas.size()){
            personas.get(indice).mostrarInformacion();
            indice++;
        }
    }
    
}
