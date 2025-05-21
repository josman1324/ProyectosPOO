/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package garagevehiculos;

/**
 *
 * @author josma
 */
public class Camion extends Vehiculo{
private String tipo; // Puede ser "Sencillo" o "Doble"
    private int capacidad;

    public Camion(String tipo, int capacidad, String marca, double precio, int cilindrada, String matricula) {
        super(marca, precio, cilindrada, matricula);
        this.tipo = tipo;
        this.capacidad = capacidad;
        calcularImpuestoCirculacion();
    }


    

    public String getTipo() {
        return tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    @Override
    public void calcularImpuestoCirculacion() {
        double impuesto = 0.07 * getPrecio();
        setImpuestoCirculacion(impuesto);
    }

    @Override
    public double getCuotaMesGarage() {
        if (tipo.equals("Sencillo")) {
            return super.getCuotaMesGarage() * 1.8; // Aumenta cuota un 80%
        } else if (tipo.equals("Doble")) {
            return super.getCuotaMesGarage() * 2.2; // Aumenta cuota un 120%
        }
        return super.getCuotaMesGarage();
    }
}


