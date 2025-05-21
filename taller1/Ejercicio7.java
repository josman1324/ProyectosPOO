/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1;

import java.util.Scanner;

/**
 *
  /* @author Jose Manuel Hernandez Montealegre*/
public class Ejercicio7 {
    public static void main(String[] args) {
        int color,numero;
        Scanner sc=new Scanner (System.in);
        System.out.println("Que color sacó de la bolsa");
        System.out.println("1.Amarillo 2.Azul 3.Rojo");
        color=sc.nextInt();
        System.out.println("numero del 1 al 5 que saco de la bolsa");
        numero=sc.nextInt();
        switch(color){
            case 1:
                switch(numero){
                    case 1: System.out.println("Te ganaste 10% de descuento en tu compra");
                    break;
                    case 2: System.out.println("Te ganaste una gasesosa");
                 break;
                    case 3:   System.out.println(" te ganaste un deosdorante");
                        break;
                    case 4:System.out.println("te ganaste unas salchichas");
                    break;
                    case 5:System.out.println("Te ganaste una camistea");
                            break;
                    default: System.out.println("No escogiste un opcion dentro del rango definido");
                }
                break;
            case 2:
                switch(numero){
                    case 1: System.out.println("Te ganaste 10% de descuento en tu compra");
                    break;
                    case 2: System.out.println("Te ganaste una cerveza");
                 break;
                    case 3: System.out.println(" te ganaste una crema dental");
                        break;
                    case 4:System.out.println("te ganaste un jamon");
                    break;
                    case 5:System.out.println("Te ganaste unas pantalonetas");
                            break;
                    default: System.out.println("No escogiste un opcion dentro del rango definido");
                   
                }
                break;
            case 3:
                switch(numero){
                    case 1: System.out.println("Te ganaste 10% de descuento en tu compra");
                    break;
                    case 2: System.out.println("Te ganaste una bebida hidratante");
                 break;
                    case 3: System.out.println(" te ganaste una crema facial");
                        break;
                    case 4:System.out.println("te ganaste una mortadela");
                    break;
                    case 5:System.out.println("Te ganaste una gorra");
                            break;
                    default: System.out.println("No escogiste un opcion dentro del rango definido");
                }
                
        }
    }
    

}
