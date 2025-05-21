/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1;

import java.util.Scanner;

/**
 *
  /* @author Jose Manuel Hernandez Montealegre*/
public class Ejercicio9 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
int numero=0;
        do{
            System.out.println("ingrese un numero positivo y entero mayor que 1");
        numero=sc.nextInt();}

 while(numero<=1);
        System.out.print("Serie de Conjetura de Ullman para " + numero + ": ");
        while (numero != 1){
          System.out.print(numero + ", ");
          
            if(numero%2==0){
                numero/=2;
                }
            else{ numero=((numero*3)+1);
        }
          
        }
      System.out.println(1);
    }
}


  
       



                

