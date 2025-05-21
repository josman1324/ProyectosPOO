/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3;

/**
 *
 * @author Jose Manuel Hernandez Montealegre
 */
public class TestCafetera {
    
    public static void main(String[] args) {
     Cafetera miCafetera = new Cafetera(100,20);
        System.out.println(miCafetera.toString());
       
         System.out.println(miCafetera.getCapacidadMaxima());
          System.out.println(miCafetera.getCantidadActual());
 miCafetera.agregarCafe(70);
 System.out.println(miCafetera.toString());
          miCafetera.servirCafe(40);
          System.out.println(miCafetera.toString());
          miCafetera.vaciarCafetera();
           System.out.println(miCafetera.toString());
           
       
    }
}