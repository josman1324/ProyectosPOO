/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alfombra;

/**
 *
 * @author Jose Manuel Henrnandez Montealegre
 */
public class Alfombras implements IAlfombras {
    private String color;
    private int precioMetro;

    public Alfombras(String color, int precioMetro) {
        this.color = color;
        this.precioMetro = precioMetro;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecioMetro() {
        return precioMetro;
    }

    public void setPrecioMetro(int precioMetro) {
        this.precioMetro = precioMetro;
    }

    @Override
    public double calcularSuperficie() {
        return 0; // Debe ser implementado en las clases hijas
    }

    @Override
    public double calcularPrecio() {
        return calcularSuperficie() * precioMetro;
    }
}

