/*
https://www.youtube.com/watch?v=NFhOrxtXXcM
 */
package Ejercicios;

public class BusquedaBinaria {
    public static void main(String[] args) {
        // 0,1 --  1,3  -- 2,5  -- 3,9 -- 4,11 -- ... -- 11,453777
        int[] serie = {1,3,5,9,11,56,108,1009,12345,187444,187445,453777};
        int buscado = 1009;
        
        System.out.println(busquedaBinaria(serie,buscado));
        System.out.println(busquedaBinariaRecursiva(serie,buscado,serie.length,0));
        
        
    }

public static int busquedaBinaria(int[] numeros, int numAbuscar){
    int piso = 0;
    int techo = numeros.length-1;
    
    while(piso <= techo){
        
        int posMedia = (piso+techo)/2;
        int numMedio = numeros[posMedia];
        
        if(numMedio==numAbuscar){
           return posMedia;
        }else if(numAbuscar<numMedio){
            techo = posMedia-1;
        }else{
            piso = posMedia+1;
        } 
    }
      return -1;
}

public static int busquedaBinariaRecursiva(int[] vector, int numBuscado, int techo, int piso){
    
    if(techo >= piso && piso <= vector.length-1){
        int posMedia = piso + (techo-piso)/2;
        int numMedio = vector[posMedia];
        
        if(numMedio==numBuscado){
            return posMedia;
        }
        if(numBuscado<numMedio){
            return busquedaBinariaRecursiva(vector,numBuscado,(posMedia-1),piso);
        }else{
            return busquedaBinariaRecursiva(vector,numBuscado,techo,(posMedia+1));
        }
        
    }
    return -1;
    
    
}

}
