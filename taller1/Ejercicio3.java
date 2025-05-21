/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1;
   import java.util.Scanner;
/**
 *
  /* @author Jose Manuel Hernandez Montealegre*/
 
public class Ejercicio3 {
    public static void main(String[] args) {
      int años,añosempleo;
      Scanner sc=new Scanner(System.in);
        System.out.println("Digite su edad");
        años=sc.nextInt();
          System.out.println("Digite sus años de empleo");
        añosempleo=sc.nextInt();
        if (años>=60 && añosempleo<=20){
            System.out.println("Usted tiene derecho a una Jubilacion por edad");
            
        }
        else if (años<60 && añosempleo>=25){
            System.out.println("Usted tiene derecho a una Jubilacion por antiguedad joven");
            
        }
        else if (años>=60 && añosempleo>=25){
            System.out.println("Usted tiene derecho a una Jubilacion por antiguedad adulta");
            
        }
        else
            System.out.println("Usted no es apto para recibir jubilacion");
            
    }
    
        
    }
    
