package saludMental;



import Servicios.GuardiasServicios;

import java.util.Scanner;


public class programa {

    public static void main(String[] args) {
     
        GuardiasServicios elTomi = new GuardiasServicios();
        elTomi.cargarGuardias();
        elTomi.cargarProfesionales();
        elTomi.asignarGuardias24();
        
        elTomi.mostrarGuardiasAsignadas();
        
     
    }
}
