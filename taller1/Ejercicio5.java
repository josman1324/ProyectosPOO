/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1;

import java.util.Scanner;

/**
 *
  /* @author Jose Manuel Hernandez Montealegre*/
public class Ejercicio5 {
    public static void main(String[] args) {
        long Presupuesto,retiro;
        Scanner sc=new Scanner( System.in);
        System.out.println("Que cantidad de dinero hay disponible en el cajero");
        Presupuesto=sc.nextLong();
        
        System.out.println("Cuanto es el monto que desea retirar");
        retiro=sc.nextLong();
        
         if (retiro<= 0) {
            System.out.println("No es cantidad correcta");
        } else if (retiro % 10 != 0) {
            System.out.println("No es cantidad correcta");
        } else if (retiro > Presupuesto) {
            System.out.println("No hay dinero suficiente");
        } else {
            Presupuesto -= retiro;
            System.out.println("Extracción exitosa. Cantidad restante en el cajero: " + Presupuesto);
        }
    }
}
    
    

       
