/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller2;

import java.util.Scanner;

/**
 *
 * @author Jose Manuel Hernandez Montealegre
 */
public class Ejercicio1 {

    public static void main(String[] args) {
    int i;
 String Temperatura;
    String dias[]=new String[30];
    Scanner sc =new Scanner(System.in);
    for (i=0;i<dias.length;i++){
        System.out.println("Digite el clima del dia "+(i+1));
        dias[i]=sc.nextLine();  
    }
    for (i=0;i<dias.length;i++){
        System.out.println(" el clima del dia "+(i+1)+" es "+ dias[i]);
    }
        System.out.println("Digite el clima a comparar y definir en que dias se dio este");
        Temperatura=sc.nextLine();
       
        System.out.print("La temperatura " + Temperatura + " se dio en los siguientes días: ");
        
        for (i = 0;i<30; i++) {
            if (dias[i].equals(Temperatura)) {
                System.out.print((i + 1) + " ");              
    }
        }
}
}
    
