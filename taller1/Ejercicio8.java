/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1;

import java.util.Scanner;

/**
 *
 /* @author Jose Manuel Hernandez Montealegre*/
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int NumNotas,i,superigual=0;
        double Notamin = 0, notas;
   
        System.out.println("Digite la cantidad de notas a ingresar");
        NumNotas=sc.nextInt();
  System.out.print("Ingrese la nota mínima a superar: ");
        Notamin= sc.nextDouble();
            for (i=1;i<=NumNotas;i++){
             System.out.println("Digite la nota "+i);
            notas=sc.nextDouble();
      if (notas>=Notamin){
               superigual++;
      
      }
            }
 System.out.println("El numero notas que superaron o igualaron nota la minima fueron "+superigual);
    
        
            
    }
}
 



