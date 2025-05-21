/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package garagevehiculos;


/**
 *
 * @author Jose Manuel Henrnandez Montealegre
 */
public class Moto extends Vehiculo {
  private final boolean tieneSidecar;

    public Moto(String marca, double precio, int cilindrada, boolean tieneSidecar,String matricula) {
        super(marca, precio, cilindrada,matricula);
        this.tieneSidecar = tieneSidecar;
        if (tieneSidecar) {
            setCuotaMesGarage(getCuotaMesGarage() * 1.5);
          setImpuestoCirculacion(getImpuestoCirculacion() * 1.1);
        }
    }

    
}
