/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package merca;

import java.util.Scanner;

/**
 *
 * @author Jose Manuel Henrnandez Montealegre
 */
public class TestMerca {
    public static void main(String[] args) {
        Almacen almacen = new Almacen(100);
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Añadir producto");
            System.out.println("2. Listar productos");
            System.out.println("3. Productos en peligro");
            System.out.println("4. Cálculo precio medio");
            System.out.println("5. Eliminar bandejas");
            System.out.println("6. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Elija el tipo de producto (CarneFresca o CarneCongelada):");
                    String tipo = scanner.nextLine();
                    if (tipo.equalsIgnoreCase("CarneFresca")) {
                        System.out.print("Nombre: ");
                        String nombreCarne = scanner.nextLine();
                        System.out.print("Peso: ");
                        double pesoCarne = scanner.nextDouble();
                        System.out.print("Precio por kilo: ");
                        double precioKiloCarne = scanner.nextDouble();
                        System.out.print("Días de caducidad: ");
                        int diasCaducidad = scanner.nextInt();
                        almacen.agregarProducto(new CarneFresca(nombreCarne, pesoCarne, precioKiloCarne, diasCaducidad));
                    } else if (tipo.equalsIgnoreCase("CarneCongelada")) {
                        System.out.print("Nombre: ");
                        String nombreCarne = scanner.nextLine();
                        System.out.print("Peso: ");
                        double pesoCarne = scanner.nextDouble();
                        System.out.print("Precio por kilo: ");
                        double precioKiloCarne = scanner.nextDouble();
                        System.out.print("Distribuidora: ");
                        String distribuidora = scanner.nextLine();
                        System.out.print("¿Viene en bandeja? (true/false): ");
                        boolean bandeja = scanner.nextBoolean();
                        almacen.agregarProducto(new CarneCongelada(nombreCarne, pesoCarne, precioKiloCarne, distribuidora, bandeja));
                    }
                    break;
                case 2:
                    System.out.println("Productos en el almacén:");
                    almacen.listarProductos();
                    break;
                case 3:
                    System.out.println("Carnes frescas en peligro:");
                    almacen.listarCarnesFrescasEnPeligro();
                    break;
                case 4:
                    double precioMedio = almacen.calcularPrecioMedio();
                    System.out.println("Precio medio de los productos: " + precioMedio);
                    break;
                case 5:
                    almacen.eliminarCarnesCongeladasEnBandeja();
                    System.out.println("Carnes congeladas en bandeja eliminadas.");
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}
