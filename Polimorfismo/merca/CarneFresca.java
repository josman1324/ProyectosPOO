/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package merca;

/**
 *
 * @author Jose Manuel Henrnandez Montealegre
 */
public class CarneFresca extends ProductoBase{
      private int diasCaducidad;

    public CarneFresca(String nombre, double peso, double precioKilo, int diasCaducidad) {
        super(nombre, peso, precioKilo);
        this.diasCaducidad = diasCaducidad;
    }

    public int getDiasCaducidad() {
        return diasCaducidad;
    }
}
