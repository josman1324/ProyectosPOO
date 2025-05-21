/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alfombra;

/**
 *
 * @author Jose Manuel Henrnandez Montealegre
 */
class Habitacion {
    private String nombre;
    private Alfombras[] alfombras;

    public Habitacion(String nombre) {
        this.nombre = nombre;
        this.alfombras = new Alfombras[0];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Alfombras[] getAlfombras() {
        return alfombras;
    }

    public void setAlfombras(Alfombras[] alfombras) {
        this.alfombras = alfombras;
    }

    public boolean agregarAlfombra(Alfombras alfombra) {
        int length = alfombras.length;
        Alfombras[] newAlfombras = new Alfombras[length + 1];
        for (int i = 0; i < length; i++) {
            newAlfombras[i] = alfombras[i];
        }
        newAlfombras[length] = alfombra;
        alfombras = newAlfombras;
        return true;
    }

 public double calcularPrecioTotal() {
        double precioTotal = 0;
        for (Alfombras alfombra : alfombras) {
            precioTotal += alfombra.calcularPrecio();
        }
        return precioTotal;
    }

    public double calcularPrecioCuadradas() {
        double precioTotalCuadradas = 0;
        for (Alfombras alfombra : alfombras) {
            if (alfombra instanceof AlfombraCuadrada) {
                precioTotalCuadradas += alfombra.calcularPrecio();
            }
        }
        return precioTotalCuadradas;
    }
}