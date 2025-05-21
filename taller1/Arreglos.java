/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1;

import java.util.Scanner;

/**
 *
 * @author josma
 */
public class Arreglos {
     public static void main(String[] args) {
        int nalumnos=0;
        double notas[];
        double alta,baja,media,aprobado=0,suspenso=0,acum=0;
        Scanner sc= new Scanner(System.in);
         System.out.println("cantidad de alumnos");
         nalumnos=sc.nextInt();
         if(nalumnos<=30){
             notas=new double[nalumnos];
             //capturando los datos
             for(int i=0;i<notas.length;i++){
                 System.out.println("Nota alumno no. "+(i+1));
             }
     }else
             System.out.println("Cantidad excedida");
   
         
    }
        
    
}
