package saludMental;


import Entidades.Dias;
import Entidades.Doctor;
import Entidades.Guardia;
import Entidades.Turno;
import Servicios.GuardiasServicios;
import java.time.DayOfWeek;
import java.util.HashSet;


public class programa {

    public static void main(String[] args) {
        
        Guardia laburo1 = new Guardia(Dias.LUNES,Turno.DIA,Boolean.TRUE);
        Guardia laburo2 = new Guardia(Dias.LUNES,Turno.NOCHE,Boolean.TRUE);
        Guardia laburo3 = new Guardia(Dias.MARTES,Turno.DIA,Boolean.TRUE);
        Guardia laburo4 = new Guardia(Dias.MARTES,Turno.NOCHE,Boolean.TRUE);
        Guardia laburo5 = new Guardia(Dias.MIERCOLES,Turno.DIA,Boolean.TRUE);
        Guardia laburo6 = new Guardia(Dias.MIERCOLES,Turno.NOCHE,Boolean.TRUE);
        Guardia laburo7 = new Guardia(Dias.JUEVES,Turno.DIA,Boolean.TRUE);
        Guardia laburo8 = new Guardia(Dias.JUEVES,Turno.NOCHE,Boolean.TRUE);
        Guardia laburo9 = new Guardia(Dias.VIERNES,Turno.DIA,Boolean.TRUE);
        Guardia laburo10 = new Guardia(Dias.VIERNES,Turno.NOCHE,Boolean.TRUE);
        Guardia laburo11 = new Guardia(Dias.SABADO,Turno.DIA,Boolean.TRUE);
        Guardia laburo12 = new Guardia(Dias.SABADO,Turno.NOCHE,Boolean.TRUE);
        Guardia laburo13 = new Guardia(Dias.DOMINGO,Turno.DIA,Boolean.TRUE);
        Guardia laburo14 = new Guardia(Dias.DOMINGO,Turno.NOCHE,Boolean.TRUE);
        Guardia laburo15 = new Guardia(Dias.LUNES,Turno.DIA,Boolean.TRUE);
        Guardia laburo16 = new Guardia(Dias.LUNES,Turno.NOCHE,Boolean.TRUE);
        Guardia laburo17 = new Guardia(Dias.MARTES,Turno.DIA,Boolean.TRUE);
        Guardia laburo18 = new Guardia(Dias.MARTES,Turno.NOCHE,Boolean.TRUE);
        Guardia laburo19 = new Guardia(Dias.MIERCOLES,Turno.DIA,Boolean.TRUE);
        Guardia laburo20 = new Guardia(Dias.MIERCOLES,Turno.NOCHE,Boolean.TRUE);
        Guardia laburo21 = new Guardia(Dias.JUEVES,Turno.DIA,Boolean.TRUE);
        Guardia laburo22 = new Guardia(Dias.JUEVES,Turno.NOCHE,Boolean.TRUE);
        Guardia laburo23 = new Guardia(Dias.VIERNES,Turno.DIA,Boolean.TRUE);
        Guardia laburo24 = new Guardia(Dias.VIERNES,Turno.NOCHE,Boolean.TRUE);
        Guardia laburo25 = new Guardia(Dias.SABADO,Turno.DIA,Boolean.TRUE);
        Guardia laburo26 = new Guardia(Dias.SABADO,Turno.NOCHE,Boolean.TRUE);
        Guardia laburo27 = new Guardia(Dias.DOMINGO,Turno.DIA,Boolean.TRUE);
        Guardia laburo28 = new Guardia(Dias.DOMINGO,Turno.NOCHE,Boolean.TRUE);
        
        
        HashSet<Dias> disponibilidadA = new HashSet<Dias>();
        disponibilidadA.add(Dias.LUNES);
        disponibilidadA.add(Dias.VIERNES);
        disponibilidadA.add(Dias.SABADO);
        disponibilidadA.add(Dias.DOMINGO);
        
        HashSet<Dias> disponibilidadB = new HashSet<Dias>();
        disponibilidadB.add(Dias.JUEVES);
        disponibilidadB.add(Dias.VIERNES);
        disponibilidadB.add(Dias.MARTES);
        disponibilidadB.add(Dias.SABADO);
        disponibilidadB.add(Dias.DOMINGO);
        
        HashSet<Dias> disponibilidadC = new HashSet<Dias>();
        disponibilidadC.add(Dias.MIERCOLES);
        disponibilidadC.add(Dias.JUEVES);
        disponibilidadA.add(Dias.MARTES);
        disponibilidadC.add(Dias.SABADO);
        disponibilidadC.add(Dias.DOMINGO);
        
        Doctor bartulero = new Doctor("Pepe",true,true,disponibilidadC);
        Doctor bartulero1 = new Doctor("Coco",false,false,disponibilidadA);
        Doctor bartulero2 = new Doctor("Pepa",false,true,disponibilidadC);
        Doctor bartulero3 = new Doctor("Lola",true,false,disponibilidadA);
        Doctor bartulero4 = new Doctor("Tucu",false,false,disponibilidadA);
        Doctor bartulero5 = new Doctor("Mano",false,true,disponibilidadB);
        Doctor bartulero6 = new Doctor("Larry",true,true,disponibilidadB);
        Doctor bartulero7 = new Doctor("O'Jana",true,true,disponibilidadC);
        
        GuardiasServicios servidor = new GuardiasServicios();
        servidor.agregarDoctor(bartulero);
        servidor.agregarDoctor(bartulero1);
        servidor.agregarDoctor(bartulero2);
        servidor.agregarDoctor(bartulero3);
        servidor.agregarDoctor(bartulero4);
        servidor.agregarDoctor(bartulero5);
        servidor.agregarDoctor(bartulero6);
        servidor.agregarDoctor(bartulero7);
        
        servidor.agregarGuardia(laburo1);
        servidor.agregarGuardia(laburo2);
        servidor.agregarGuardia(laburo3);
        servidor.agregarGuardia(laburo4);
        servidor.agregarGuardia(laburo5);
        servidor.agregarGuardia(laburo6);
        servidor.agregarGuardia(laburo7);
        servidor.agregarGuardia(laburo8);
        servidor.agregarGuardia(laburo9);
        servidor.agregarGuardia(laburo10);
        servidor.agregarGuardia(laburo11);
        servidor.agregarGuardia(laburo12);
        servidor.agregarGuardia(laburo13);
        servidor.agregarGuardia(laburo14);
        servidor.agregarGuardia(laburo15);
        servidor.agregarGuardia(laburo16);
        servidor.agregarGuardia(laburo17);
        servidor.agregarGuardia(laburo18);
        servidor.agregarGuardia(laburo19);
        servidor.agregarGuardia(laburo20);
        servidor.agregarGuardia(laburo21);
        servidor.agregarGuardia(laburo22);
        servidor.agregarGuardia(laburo23);
        servidor.agregarGuardia(laburo24);
        servidor.agregarGuardia(laburo25);
        servidor.agregarGuardia(laburo26);
        servidor.agregarGuardia(laburo27);
        servidor.agregarGuardia(laburo28);
        
//        servidor.asignarGuardias();
        
        System.out.println(bartulero6.getDiasDisponibles().toString());
        
        servidor.mostrarDiasDisponiblessDr(bartulero7);
        
        System.out.println(bartulero7.getDiasDisponibles().contains(laburo22.getDiaDeLaSemana()));
        
       
    }
    
}
