/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package garagevehiculos;

/**
 *
 * @author Jose Manuel Henrnandez Montealegre
 */
public class Auto extends Vehiculo{
 
   private boolean tieneRadio;
    private boolean tieneNavegador;

    public Auto(String marca, double precio, int cilindrada, boolean tieneRadio, boolean tieneNavegador,String matricula) {
        super(marca, precio, cilindrada,matricula);
        this.tieneRadio = tieneRadio;
        this.tieneNavegador = tieneNavegador;
        if (cilindrada > 2999) {
            setCuotaMesGarage(getCuotaMesGarage() * 1.2);
            calcularImpuestoCirculacion();
        }
        if (tieneRadio) {
            setCuotaMesGarage(getCuotaMesGarage() * 1.01);
            calcularImpuestoCirculacion();
        }
        if (tieneNavegador) {
             setCuotaMesGarage(getCuotaMesGarage() * 1.02);
            calcularImpuestoCirculacion();
        }
    }

  
    
}
