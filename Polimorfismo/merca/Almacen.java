/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package merca;

/**
 * @author Jose Manuel Henrnandez Montealegre
 */

public class Almacen {
    
   private Producto[] productos;
    private int cantidadProductos;

    public Almacen(int capacidad) {
        productos = new Producto[capacidad];
        cantidadProductos = 0;
    }

    public void agregarProducto(Producto producto) {
        if (cantidadProductos < productos.length) {
            productos[cantidadProductos] = producto;
            cantidadProductos++;
        } else {
            System.out.println("El almacén está lleno, no se pueden agregar más productos.");
        }
    }

    public void listarProductos() {
        for (int i = 0; i < cantidadProductos; i++) {
            System.out.println("Nombre: " + productos[i].getClass().getSimpleName() + ", Precio: " + productos[i].calcularPrecio());
        }
    }

    public void listarCarnesFrescasEnPeligro() {
        for (int i = 0; i < cantidadProductos; i++) {
            if (productos[i] instanceof CarneFresca) {
                CarneFresca carneFresca = (CarneFresca) productos[i];
                if (carneFresca.getDiasCaducidad() < 10) {
                    System.out.println("Nombre: " + carneFresca.getClass().getSimpleName() + ", Días de caducidad: " + carneFresca.getDiasCaducidad());
                }
            }
        }
    }

    public double calcularPrecioMedio() {
        double totalPrecio = 0;
        for (int i = 0; i < cantidadProductos; i++) {
            totalPrecio += productos[i].calcularPrecio();
        }
        return totalPrecio / cantidadProductos;
    }

    public void eliminarCarnesCongeladasEnBandeja() {
        for (int i = 0; i < cantidadProductos; i++) {
            if (productos[i] instanceof CarneCongelada && ((CarneCongelada) productos[i]).isEnBandeja()) {
                for (int j = i; j < cantidadProductos - 1; j++) {
                    productos[j] = productos[j + 1];
                }
                cantidadProductos--;
                i--;
            }
        }
    }
}
