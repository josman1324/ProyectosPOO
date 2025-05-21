/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alfombra;

/**
 *
 * @author Jose Manuel Henrnandez Montealegre
 */
class Mansion {
    private Habitacion[] arrayHabitaciones;

    public Mansion() {
        this.arrayHabitaciones = new Habitacion[0];
    }

    public boolean agregarHabitacion(Habitacion habitacion) {
        int length = arrayHabitaciones.length;
        Habitacion[] newArrayHabitaciones = new Habitacion[length + 1];
        for (int i = 0; i < length; i++) {
            newArrayHabitaciones[i] = arrayHabitaciones[i];
        }
        newArrayHabitaciones[length] = habitacion;
        arrayHabitaciones = newArrayHabitaciones;
        return true;
    }

    public double calcularPrecioTotal() {
        double precioTotal = 0;
        for (Habitacion habitacion : arrayHabitaciones) {
            precioTotal += habitacion.calcularPrecioTotal();
        }
        return precioTotal;
    }

    public double calcularPrecioCuadradas() {
        double precioTotalCuadradas = 0;
        for (Habitacion habitacion : arrayHabitaciones) {
            precioTotalCuadradas += habitacion.calcularPrecioCuadradas();
        }
        return precioTotalCuadradas;
    }
}
