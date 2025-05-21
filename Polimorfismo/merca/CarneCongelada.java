/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package merca;

/**
 *
 * @author Jose Manuel Henrnandez Montealegre
 */
public class CarneCongelada extends ProductoBase{
     private String distribuidora;
    private boolean enBandeja;

    public CarneCongelada(String distribuidora, double peso, double precioKilo, String nombre, boolean enBandeja) {
        super(nombre, peso, precioKilo);
        this.distribuidora = distribuidora;
        this.enBandeja = enBandeja;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public boolean isEnBandeja() {
        return enBandeja;
    }
   
}
