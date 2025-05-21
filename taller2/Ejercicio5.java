/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2;

import java.util.Random;

/**
 *
 * @author Jose Manuel Hernandez Montealegre
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        int fila = 4;
        int columna = 4;
        int arreglo[][] = new int[fila][columna];

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                arreglo[i][j] = aleatorio.nextInt(100); 
                System.out.println("el arreglo[" + i + "][" + j + "] es = " + arreglo[i][j]);
            }
        }
         boolean tieneRepetidos = false;

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                int elementoActual = arreglo[i][j];
                for (int x = 0; x < arreglo.length; x++) {
                    for (int y = 0; y < arreglo[x].length; y++) {
                        if (x != i || y != j) {
                            if (arreglo[x][y] == elementoActual) {
                                tieneRepetidos = true;
                                break;
                            }
                        }
                    }
                  if (tieneRepetidos) {
                        break;
                    }
                }
                if (tieneRepetidos) {
                    break;
                }
            }
            if (tieneRepetidos) {
                break;
            }  
        }

        if (tieneRepetidos) {
            System.out.println("El arreglo tiene números repetidos.");
        } else {
            System.out.println("El arreglo no tiene números repetidos.");
        }
    }
        }
    
    





                    
    


                
    
    
    

    

