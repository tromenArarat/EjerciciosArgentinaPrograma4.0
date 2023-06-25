package saludMental;

import Servicios.GuardiasServicios;


public class programa {

    public static void main(String[] args) {
     
        GuardiasServicios bedel = new GuardiasServicios();
        bedel.cargarGuardias();
        bedel.cargarProfesionales();
        bedel.asignarGuardias24();
        bedel.borrarRepes24();
        bedel.asignarGuardias12Dia();
        bedel.asignarGuardias12Noche();
        bedel.asignarGuardias12Dia();
        bedel.asignarGuardias12Noche();
        bedel.asignarGuardias12Dia();
        bedel.asignarGuardias12Noche();
        bedel.asignarGuardias12Dia();
        bedel.asignarGuardias12Noche();
        bedel.asignarGuardias12Dia();
        bedel.asignarGuardias12Noche();
        bedel.mostrarGuardias();
        
     
    }
}
