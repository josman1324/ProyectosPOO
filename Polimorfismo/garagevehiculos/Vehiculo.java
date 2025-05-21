/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package garagevehiculos;

/**
 * 240+
 * @author Jose Manuel Henrnandez Montealegre
 */
public class Vehiculo {

     private String matricula;
    private String marca;
    private double precio;
    private int cilindrada;
    private double impuestoCirculacion;
    private double cuotaMesGarage;
    private static final double CUOTA_MES = 100;

    public Vehiculo(String marca, double precio, int cilindrada,String matricula) {
        this.matricula = matricula;
        this.marca = marca;
        this.precio = precio;
        this.cilindrada = cilindrada;
   this.cuotaMesGarage=CUOTA_MES;
        calcularImpuestoCirculacion();
    }

    public void calcularImpuestoCirculacion() {
        impuestoCirculacion = 0.02 * precio;
    }

    public boolean matricular(String matricula) {
        if (matricula != null && matricula.length() == 7) {
            this.matricula = matricula;
            return true;
        }
        return false;
    }

    // Getters y setters
    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public double getImpuestoCirculacion() {
        return impuestoCirculacion;
    }

    public double getCuotaMesGarage() {
        return cuotaMesGarage;
    }

    public void setCuotaMesGarage(double cuotaMesGarage) {
        if (cuotaMesGarage >= 0) {
            this.cuotaMesGarage = cuotaMesGarage;
        }
    }

    public void setImpuestoCirculacion(double impuestoCirculacion) {
        this.impuestoCirculacion = impuestoCirculacion;
    }
    
    }
    
    


