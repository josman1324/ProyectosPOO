/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alfombra;

/**
 *
 * @author Jose Manuel Henrnandez Montealegre
 */
public class TestAlfombra {
    public static void main(String[] args) {
        // Crear alfombras
        AlfombraCuadrada alfombra1 = new AlfombraCuadrada("Roja", 20, 4);
        AlfombraRedonda alfombra2 = new AlfombraRedonda("Verde", 30, 3);
        AlfombraCuadrada alfombra3 = new AlfombraCuadrada("Azul", 15, 5);

        // Crear habitaciones
        Habitacion habitacion1 = new Habitacion("Sala");
        Habitacion habitacion2 = new Habitacion("Dormitorio");

        // Agregar alfombras a las habitaciones
        habitacion1.agregarAlfombra(alfombra1);
        habitacion1.agregarAlfombra(alfombra2);
        habitacion2.agregarAlfombra(alfombra3);

        // Crear mansión y agregar habitaciones
        Mansion mansion = new Mansion();
        mansion.agregarHabitacion(habitacion1);
        mansion.agregarHabitacion(habitacion2);

        // Calcular el precio total de la mansión y de las alfombras cuadradas
        double precioTotalMansion = mansion.calcularPrecioTotal();
        double precioCuadradasMansion = mansion.calcularPrecioCuadradas();

        System.out.println("Precio total de la mansión: $" + precioTotalMansion);
        System.out.println("Precio de las alfombras cuadradas en la mansión: $" + precioCuadradasMansion);
    }
}