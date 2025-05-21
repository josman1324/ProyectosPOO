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
public class Ejercicio2 {
    public static void main(String[] args) {
Random aleatorio=new Random();
Scanner sc=new Scanner(System.in);
int i;
 int contadorVocales = 0;
char numbers[]= new char[50];
for(i=0;i<50;i++){
int n=aleatorio.nextInt(97,123);
        System.out.println("numero alatorio es "+n);
        char letra=(char) n;
       numbers[i]=letra;
        
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contadorVocales++;
            }
        }

        // Mostrar las letras generadas y el número de vocales
        System.out.print("Letras generadas: ");
        for (char letra : numbers) {
            System.out.print(letra + " ");
        }
        System.out.println(); // Cambio de línea

        System.out.println("Número de vocales generadas: " + contadorVocales);
    }







}
    

