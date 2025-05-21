/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3;

import java.util.Scanner;



/**
 *
 * @author Jose Manuel Hernandez Montealegre
 */
public class HoraTest {
    public static void main(String[] args) {
        // Ejemplo de uso
        Scanner scanner = new Scanner(System.in);

        // Constructor predeterminado
        Hora hora1 = new Hora();
        System.out.print("Hora predeterminada: ");
        hora1.print();

        // Constructor parametrizado
        Hora hora2 = new Hora(7, 3, 21);
        System.out.print("Hora parametrizada: ");
        hora2.print();

        // Leer hora
        Hora hora3 = new Hora();
        System.out.println("Introduce una hora(hora3):");
        hora3.leer();
        System.out.print("Hora ingresada: ");
        hora3.print();

         System.out.println("Segundos desde medianoche para la hora2: " + hora2.aSegundos());

        // Calcular segundos entre dos horas
        System.out.println("Segundos entre hora1 y hora2: " + hora1.segundosDesde(hora2));

        // Avanzar a la siguiente segundo
        System.out.print("Siguiente segundo para la hora2: ");
        hora2.siguiente();
        hora2.print();

        // Retroceder al segundo anterior
        System.out.print("Segundo anterior para la hora2: ");
        hora2.anterior();
        hora2.print();

        // Crear un clon de la hora
        Hora hora4 = hora2.copia();
        System.out.print("Clon de la hora2(hora4): ");
        hora4.print();

        // Verificar si dos horas son iguales
        System.out.println("¿La hora2 es igual que la hora3? " + hora2.igualQue(hora3));

        // Verificar si una hora es menor que otra
        System.out.println("¿La hora1 es menor que la hora2? " + hora1.menorQue(hora2));

        // Verificar si una hora es mayor que otra
        System.out.println("¿La hora1 es mayor que la hora2? " + hora1.mayorQue(hora2));
      
    }
}

 