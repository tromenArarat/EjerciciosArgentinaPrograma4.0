
/*
minuto 11, segundo 47
https://www.youtube.com/watch?v=lDCgErCsoPY&t=639s
*/

import java.util.Date;
import java.util.GregorianCalendar;


public class Utilidad {
    
public static Date convertirStringEnDate(String fecha){
    // Ej.: 14/09/1985
    
    String diaString = fecha.substring(0,2);
    String mesString = fecha.substring(3,5);
    String anioString = fecha.substring(6,fecha.length());
    
    int diaNumero = Integer.valueOf(diaString);
    int mesNumero = Integer.valueOf(mesString);
    int anioNumero = Integer.valueOf(anioString);
    
    GregorianCalendar calendario = new GregorianCalendar();
    calendario.set(diaNumero,mesNumero,anioNumero,0,0);
    
    Date fechaRetorno = calendario.getTime();
    
    return fechaRetorno;
    
}    

public static String convertirDateEnString(Date fecha){
    GregorianCalendar calendario = new GregorianCalendar();
    calendario.setTime(fecha);
    
    int anio = calendario.get(GregorianCalendar.YEAR);
    int mes = calendario.get(GregorianCalendar.MONTH);
    int dia = calendario.get(GregorianCalendar.DATE);
    
    String fechaString = dia+"/"+mes+"/"+anio;
    
    return fechaString;
    
}
    
}
