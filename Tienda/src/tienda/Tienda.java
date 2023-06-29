
package tienda;

import java.util.Scanner;
import tienda.servicios.fabricanteServicio;
import tienda.servicios.productoServicio;

public class Tienda {

    public static void main(String[] args)throws Exception {
        // HACER UN MENU
        /*
        a) PRODUCTOS -> NOMBRE DE TODOS LOS PRODUCTOS
        b) PRODUCTOS -> NOMBRES Y PRECIOS
        c) PRODUCTOS -> OFERTAS (precios entre 120 y 202 incluídos)
        d) PRODUCTOS -> PORTATILES 
        e) PRODUCTOS -> EL MÁS BARATO
        f) INGRESAR PRODUCTO
        g) INGRESAR FABRICANTE
        h) CAMBIAR PRECIO PRODUCTO
        */
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String confirmacionSalida = "no";
        productoServicio cajero = new productoServicio();
        fabricanteServicio jefesin = new fabricanteServicio();
        
        do{
            System.out.println("------- Bienvenido al mundo de Wally -------");
            System.out.println("------------------------ ¿Qué desea? -------");
            System.out.println("----- (1) --------------- CONSULTAR  -------");
            System.out.println("----- (2) --------------- MODIFICAR  -------");
            System.out.println("----- (3) ------------------- SALIR  -------");
            try{
                int num = sc.nextInt();
                switch(num){
                    case 1:
                    System.out.println("(1) NOMBRE DE TODOS LOS PRODUCTOS ---");
                    System.out.println("(2) ----------  NOMBRES Y PRECIOS ---");
                    System.out.println("(3) --- OFERTAS (entre 120 y 202) ---");
                    System.out.println("(4) -----------------  PORTATILES ---");
                    System.out.println("(5) -----------------    + BARATO ---");
                    int num2 = sc.nextInt();
                    switch(num2){
                        case 1:
                            System.out.println(cajero.listarProductosPorNombre());
                            break;
                        case 2:
                            System.out.println(cajero.listarProductosPorNombreYprecio());
                            break;
                        case 3:
                            System.out.println(cajero.productosOfertas());
                            break;
                        case 4:
                            System.out.println(cajero.productosPortatiles());
                            break;
                        case 5:
                            System.out.println(cajero.productoMasBarato());
                            break;
                    }
                    case 2:
                    System.out.println("(1) ----------- INGRESAR PRODUCTO ---");
                    System.out.println("(2) --------- INGRESAR FABRICANTE ---");
                    System.out.println("(3) ----- CAMBIAR PRECIO PRODUCTO ---");
                    int num3 = sc.nextInt();
                    switch(num3){
                        case 1:
                            // int codigo, String nombre, double precio, int codigoFabricante
                            System.out.println("Ingrese un nombre de producto");
                            String nombreProducto = sc.next();
                            System.out.println("Ingrese un precio");
                            double precio = sc.nextDouble();
                            System.out.println("Ingrese un código de fabricante");
                            int codigoFabricante = sc.nextInt();
                            cajero.insertarProducto(nombreProducto, precio, codigoFabricante);
                            break;
                        case 2: 
                            System.out.println("Ingrese nombre del fabricante");
                            String nombreFabricante = sc.next();
                            jefesin.insertarFabricante(nombreFabricante);
                            break;
                        case 3:
                            System.out.println("Ingrese el código del producto que desea modificar");
                            int codigoProducto = sc.nextInt();
                            System.out.println("Ingrese el nuevo precio");
                            double nuevoPrecio = sc.nextDouble();
                            cajero.modificarProductoPrecio(codigoProducto, nuevoPrecio);
                            break;
                    }
                    case 3: 
                        System.out.println("¿Está seguro de que desea salir?");
                        confirmacionSalida = sc.next();
                        break;
                }
            }catch(Exception e){
                throw e;
            }
        }while(confirmacionSalida.equals("no"));
    }
    
}
