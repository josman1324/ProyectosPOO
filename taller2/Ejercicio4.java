/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2;

import java.util.Random;
import java.util.Scanner;

/**
 *
* @author Jose Manuel Hernandez Montealegre
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();
        int fila,columna, opciones;
        int arreglo[][] = new int[3][4];
        arreglo[0][0] = 1;
        arreglo[1][1] = 1;
        arreglo[2][3] = 1;
        arreglo[1][0] = 0;
        arreglo[2][0] = 0;
        arreglo[0][1] = 0;
        arreglo[2][1] = 0;
        arreglo[0][2] = 0;
        arreglo[1][2] = 0;
        arreglo[2][2] = 0;
        arreglo[0][3] = 0;
        arreglo[1][3] = 0;

                System.out.println("Digite que opcion desea tomar entre las siguientes:");
                System.out.println("1. Añadir un auto aleatoriamente ");
                System.out.println("2.Añadir un auto tecleando la fila y columna donde desea almacenarlo");
                System.out.println("3. Listar todos los espacios que estén ocupados");
                System.out.println("4. Indicar si el parking está lleno.");
                
        opciones = sc.nextInt();
        
       if (opciones == 1) {
    boolean hayEspacio = false;
fila = aleatorio.nextInt(3);
            columna = aleatorio.nextInt(4);
    // Intentar encontrar un espacio libre
    for (fila =0; fila < arreglo.length; fila++) {
        for ( columna = 0; columna< arreglo[fila].length; columna++) {
            if (arreglo[fila][columna] == 0) {
                hayEspacio = true;
                arreglo[fila][columna] = 1;
                System.out.println("El puesto ocupado fue aleatoriamente escogido en la fila " + fila + " y columna " + columna);
                break;  // Salir del bucle si encontramos un espacio
            }
        }
        if (hayEspacio) {
            break;  // Salir del bucle externo si encontramos un espacio
        }
    }

    if (!hayEspacio) {
        System.out.println("El parking está lleno, no hay espacios disponibles.");
    }
            

    if (!hayEspacio) {
        System.out.println("El parking está lleno, no hay espacios disponibles.");
    }
    }

        

        if (opciones == 2) {
            System.out.println("Indica en que fila del 0 al 2 desea poner su auto");
            fila = sc.nextInt();
            System.out.println("Indica en que columna del 0 al 3 desea estacionar su auto");
            columna = sc.nextInt();
            if (arreglo[fila][columna] == 0) {

                System.out.println("Tu carro se estaciono correctamente en las indicaciones dadas");
            }
            if (arreglo[fila][columna] == 1) {
            }

        }
        if (opciones == 3) {

            for (fila = 0; fila < arreglo.length; fila++) {
                for ( columna= 0; columna < arreglo[fila].length; columna++) {
                    if (arreglo[fila][columna] == 1) {

                        System.out.println("la fila ocupada es " + fila+ " y la columna ocupada es : " + columna);
                    } else {

                    }
                }
            }
        }
        if (opciones == 4) {
            boolean estaLleno = true;
            for (fila = 0; fila < arreglo.length; fila++) {
                for (columna = 0; columna < arreglo[fila].length; columna++) {
                    if (arreglo[fila][columna] == 0) {
                        estaLleno = false;
                    }
                }
            }

            if (estaLleno) {
                System.out.println("El parking esta ocupado");
            } else {
                System.out.println("El parking no esta ocupado");
            }
        }
    }

}
