/*
Arrays.equals(arreglo1,
arreglo2Յ
Retorna true o false, si dos arreglos del
mismo tipo de dato son iguale

Arrays.fill(arreglo,
variable)
Arrays.fill(arreglo, int
desde, int hasta,
variable)
Este método lo que hace es inicializar todo
el arreglo con la variable o valor que
pasamos como argumento. Este método se
puede usar con cualquier tipo de dato y le
podemos decir desde y hasta que índice
queremos que llene con ese valor.


Arrays.sort(arreglo)
Arrays.sort(arreglo, int
desde, int hasta)
Este método sirve para ordenar un arreglo
de manera ascendente. A este método
también le podemos decir desde y hasta
que índice queremos que ordene.


Arrays.toString(arreglo) Este método imprime el arreglo como una
cadena, la cadena consiste en una lista de
los elementos del arreglo encerrados entre
corchetes ("[]"). Los elementos adyacentes
están separados por comas (",").


 */
package ejemplo.array;

import java.util.Arrays;

public class ejemplosArray {

    public static void main(String[] args) {
        int vector1[] = {1, 3, 2, 4, 12, 5, 6, 3};
        int vector2[] = {1, 3, 2, 4, 12, 5, 6, 3};
        Integer vector3[] = {1, 3, 2, 4, 12, 5, 7, 3};
     

        int vectorXaLlenar[] = new int[5];

        System.out.println("------------------------------------------------------");
        System.out.println("Equals: ");

        System.out.println("Los vectores son iguales: " + Arrays.equals(vector1, vector2));

        System.out.println("------------------------------------------------------");
        System.out.println("Fill: ");
        
        for (int i = 0; i < vectorXaLlenar.length; i++) {
            for (int j = 0; j < vectorXaLlenar.length; j++) {
                vectorXaLlenar[i]=8;
            }
        }
//        Arrays.fill(vectorXaLlenar, 6);

        System.out.println("El arreglo vacio es igual a: " + Arrays.toString(vectorXaLlenar));
        
        System.out.println(Arrays.toString(vectorXaLlenar));

        System.out.println("------------------------------------------------------");
        System.out.println("Sort: ");
        Arrays.sort(vector3,1,8);
        
        Integer[] numeros = {4, 2, 8, 1, 5};
        Arrays.sort(vector3, (a, b) -> b.compareTo(a));
        System.out.println(Arrays.toString(numeros)); // [8, 5, 4, 2, 1]
        
        System.out.println("El arreglo ordenado queda: " + Arrays.toString(vector3));

        System.out.println("------------------------------------------------------");
        System.out.println("BinarySearch: ");
        
        System.out.println("El numero 5 se encuentra en la posicion: " + Arrays.binarySearch(vector1, 12));
    }
    
}
