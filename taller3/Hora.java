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
public class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    // Constructor predeterminado
    public Hora() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    // Constructor parametrizado
    public Hora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        valida();
    }

    // Método auxiliar para validar la hora
    private void valida() {
        if (horas < 0 || horas >= 24)
            horas = 0;
        if (minutos < 0 || minutos >= 60)
            minutos = 0;
        if (segundos < 0 || segundos >= 60)
            segundos = 0;
    }

   // Getters y Setters
    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
        valida();
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
        valida();
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
        valida();
    }

    // Método para imprimir la hora en formato HH:MM:SS
    public void print() {
        System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
    }

    // Método para convertir la hora a segundos
    public int aSegundos() {
        return horas * 3600 + minutos * 60 + segundos;
    }

    // Método para ajustar la hora en base a los segundos desde medianoche
    public void deSegundos(int segundosDesdeMedianoche) {
        horas = segundosDesdeMedianoche / 3600;
        int segundosRestantes = segundosDesdeMedianoche % 3600;
        minutos = segundosRestantes / 60;
        segundos = segundosRestantes % 60;
        valida();
    }

    // Método para calcular los segundos entre dos horas
    public int segundosDesde(Hora otraHora) {
        return Math.abs(this.aSegundos() - otraHora.aSegundos());
    }

    // Método para avanzar a la siguiente segundo
    public void siguiente() {
        segundos++;
        if (segundos == 60) {
            segundos = 0;
            minutos++;
            if (minutos == 60) {
                minutos = 0;
                horas++;
                if (horas == 24) {
                    horas = 0;
                }
            }
        }
    }

    // Método para retroceder al segundo anterior
    public void anterior() {
        segundos--;
        if (segundos < 0) {
            segundos = 59;
            minutos--;
            if (minutos < 0) {
                minutos = 59;
                horas--;
                if (horas < 0) {
                    horas = 23;
                }
            }
        }
    }

    // Método para crear un clon de la hora
    public Hora copia() {
        return new Hora(this.horas, this.minutos, this.segundos);
    }

    // Método para verificar si dos horas son iguales
    public boolean igualQue(Hora otraHora) {
        return this.horas == otraHora.horas && this.minutos == otraHora.minutos && this.segundos == otraHora.segundos;
    }

    // Método para verificar si esta hora es menor que otra hora
    public boolean menorQue(Hora otraHora) {
        if (this.horas < otraHora.horas)
            return true;
        else if (this.horas == otraHora.horas && this.minutos < otraHora.minutos)
            return true;
        else if (this.horas == otraHora.horas && this.minutos == otraHora.minutos && this.segundos < otraHora.segundos)
            return true;
        else
            return false;
    }

    // Método para verificar si esta hora es mayor que otra hora
    public boolean mayorQue(Hora otraHora) {
        if (this.horas > otraHora.horas)
            return true;
        else if (this.horas == otraHora.horas && this.minutos > otraHora.minutos)
            return true;
        else if (this.horas == otraHora.horas && this.minutos == otraHora.minutos && this.segundos > otraHora.segundos)
            return true;
        else
            return false;
    }

    // Método para leer la hora desde el usuario
    public void leer() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce las horas: ");
        horas = scanner.nextInt();
        System.out.print("Introduce los minutos: ");
        minutos = scanner.nextInt();
        System.out.print("Introduce los segundos: ");
        segundos = scanner.nextInt();

        valida();
    }
}
