/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1;
import java.util.Scanner;
/**
 *
 /* @author Jose Manuel Hernandez Montealegre*/
public class Ejercicio10 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario un número
        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();

        // Verificar si el número es primo
        boolean esPrimo = esPrimo(numero);

        // Mostrar el resultado
        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Función para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        
        int divisor = 2;
        
        while (divisor * divisor <= numero) {
            if (numero % divisor == 0) {
                return false;
            }
            divisor++;
        }
        
        return true;
    }
}

        


 



    
