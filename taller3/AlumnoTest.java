/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3;

import java.util.Arrays;

/**
 *
 * @author Jose Manuel Hernandez Montealegre
 */
public class AlumnoTest {
    public static void main(String[] args) {
        // Crear un alumno
        Alumno alumno = new Alumno("John Doe");

        // Poner notas
        alumno.ponerNota(1, 8.5);
        alumno.ponerNota(2, 7.0);
        alumno.ponerNota(3, 9.2);

        // Mostrar información
        System.out.println("Nombre del alumno: " + alumno.getNombre());
        System.out.println("Notas del alumno: " + Arrays.toString(alumno.getNotas()));
        System.out.println("Número de notas: " + alumno.numeroNotas());
        System.out.println("Nota máxima: " + alumno.notaMaxima());
        System.out.println("¿Tiene nota para la evaluación 2? " + alumno.tieneNota(2));
        System.out.println("Nota de la evaluación 2: " + alumno.getNota(2));

        // Borrar nota de la evaluación 1
        alumno.borrarNota(1);
        System.out.println("Después de borrar la nota de la evaluación 1: " + Arrays.toString(alumno.getNotas()));
    }
 
}
