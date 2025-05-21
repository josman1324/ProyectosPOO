/*->bloque de comentarios
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
//importacion de librerias

import java.util.Scanner;

/**
 *
 * @author Jose Manuel Hernandez Montealegre 20231212952
 */
public class HolaMundo { //comentario en linea
    //implantacion de todo codigo fuente
    public static void main (String args[]){//solo un metodo main para cada clase este es para ejecutarla
        Scanner input = new Scanner(System.in);// capturar datos mediante la digitacion por teclado, la variable se llama input de tipo scanner
        System.out.println("Hola como te llamas?"); //escribir en pseudocodigo 
        String nombre= input.nextLine();// capturo con cadena de caracteres en nombre
        //salida por consola
        System.out.println("Hola " + nombre); 
        // declarar las variables que solo vaya a utilizar el resto que no se utiliza es basura, por eso es bueno crear las variables cuando se vayan usar
}
   // Identificador de variables: secuencia de caracteres,camel case inicia con letra minuscula, solo letras y numeros ejemplo totalCase
}// Case sensitive diferencia de mayusculas y  minusculas
//existen 8 tipos primitivos de variables en java
// boolean etc