/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 203 e imprima
el número ingresado seguido de tantos asteriscos como indique su valor. Por
ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package Estructurasdecontrol;

import java.util.Scanner;

public class Ej0_DibujaConFor {

      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in).useDelimiter("\n");
          
          int[] nums = new int[4];
          String[] asteriscos = new String[4];
          String asterisco = "*";
          String asteriscoc = "";
          
          System.out.println("Escriba cuatro números entre 1 y 208");
          for (int i = 0; i < 4; i++) {
            nums[i] = sc.nextInt();
              for (int j = 0; j < nums[i]; j++) {
                  asteriscoc += asterisco;
            }
            asteriscos[i] = asteriscoc;
          }  
           
          for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]+asteriscos[i]);
             }
                                    
        }
    }
    

