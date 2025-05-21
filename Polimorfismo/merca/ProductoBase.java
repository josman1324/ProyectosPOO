/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package merca;

/**
 *
 * @author Jose Manuel Henrnandez Montealegre
 */
public class ProductoBase implements Producto {
    
    private String nombre;
    private double peso;
    private double precioKilo;

    public ProductoBase(String nombre, double peso, double precioKilo) {
        this.nombre = nombre;
        this.peso = peso;
        this.precioKilo = precioKilo;
        
           
    }
     @Override
    public double calcularPrecio() {
    return peso* precioKilo;
    
    }

  public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }
}
