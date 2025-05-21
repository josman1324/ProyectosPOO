/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1;

import java.util.Scanner;



/**
 *
  /* @author Jose Manuel Hernandez Montealegre*/
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el tipo de carro:");
        System.out.println("1. Auto");
        System.out.println("2. SUV");
        System.out.println("3. Camioneta");
        int tipoCarro = scanner.nextInt();

        System.out.println("Seleccione el color:");
        System.out.println("1. Negro");
        System.out.println("2. Blanco");
        System.out.println("3. Rojo");
        int color = scanner.nextInt();

        switch (tipoCarro) {
            case 1:
                switch (color) {
                    case 1:
                        System.out.println("Ha seleccionado un Auto Negro.");
                        break;
                    case 2:
                        System.out.println("Ha seleccionado un Auto Blanco.");
                        break;
                    case 3:
                        System.out.println("Ha seleccionado un Auto Rojo.");
                        break;
                    default:
                        System.out.println("Selección de color no válida.");
                        break;
                }
                break;
            case 2:
                switch (color) {
                    case 1:
                        System.out.println("Ha seleccionado un SUV Negro.");
                        break;
                    case 2:
                        System.out.println("Ha seleccionado un SUV Blanco.");
                        break;
                    case 3:
                        System.out.println("Ha seleccionado un SUV Rojo.");
                        break;
                    default:
                        System.out.println("Selección de color no válida.");
                        break;
                }
                break;
            case 3:
                switch (color) {
                    case 1:
                        System.out.println("Ha seleccionado una Camioneta Negro.");
                        break;
                    case 2:
                        System.out.println("Ha seleccionado una Camioneta Blanco.");
                        break;
                    case 3:
                        System.out.println("Ha seleccionado una Camioneta Rojo.");
                        break;
                    default:
                        System.out.println("Selección de color no válida.");
                        break;
                }
                break;
            default:
                System.out.println("Selección de tipo de carro no válida.");
                break;
        }
    }
    }