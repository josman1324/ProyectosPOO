/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package garagevehiculos;

import java.util.Scanner;

/**
 *
 * @author Jose Manuel Henrnandez Montealegre
 */
public class main {
    public static void main(String[] args) {
        Garage garaje = new Garage();
        Scanner scanner = new Scanner(System.in);

        // Alquilamos algunos espacios en el garaje con vehículos de ejemplo
      //  garaje.alquilarEspacio(new Moto("Honda", 1500, 600, false,"SZK899"));
      //  garaje.alquilarEspacio(new Auto("Toyota", 12000, 2000, true, false,"BWE890"));
       // garaje.alquilarEspacio(new Auto("Ford", 18000, 3500, false, true,"WDS8J3"));
       // garaje.alquilarEspacio(new Moto("Suzuki", 1200, 400, true,"RZQ67J"));

         int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Alquilar un espacio");
            System.out.println("2. Retiro de alquiler");
            System.out.println("3. Consulta de ingresos mensuales");
            System.out.println("4. Consulta proporción autos / motos");
            System.out.println("5. Listado de matrículas, cuota mensual y tipo vehículo");
            System.out.println("6. Información de camiones y disponibilidad");
            System.out.println("7. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Elija el tipo de vehículo (Moto, Auto, o Camión):");
                    String tipo = scanner.nextLine();
                    System.out.print("Marca: ");
                    String marca = scanner.nextLine();
                    System.out.print("Precio: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Cilindrada (o capacidad para Camiones): ");
                    int cilindradaCapacidad = scanner.nextInt();
                    System.out.print("Matricula: ");
                    String matricula = scanner.nextLine();
                    scanner.nextLine(); // Consumir la línea en blanco

                    if (tipo.equalsIgnoreCase("Moto")) {
                        System.out.print("¿Tiene sidecar? (true/false): ");
                        boolean tieneSidecar = scanner.nextBoolean();
                        garaje.alquilarEspacio(new Moto(marca, precio, cilindradaCapacidad, tieneSidecar, matricula));
                    } else if (tipo.equalsIgnoreCase("Auto")) {
                        System.out.print("¿Tiene radio? (true/false): ");
                        boolean tieneRadio = scanner.nextBoolean();
                        System.out.print("¿Tiene navegador? (true/false): ");
                        boolean tieneNavegador = scanner.nextBoolean();
                        garaje.alquilarEspacio(new Auto(marca, precio, cilindradaCapacidad, tieneRadio, tieneNavegador, matricula));
                    } else if (tipo.equalsIgnoreCase("Camión")) {
                        System.out.print("Tipo de Camión (Sencillo o Doble): ");
                        String tipoCamion = scanner.nextLine();
                        garaje.alquilarEspacio(new Camion("",capacidad,"", precio,cilindradaCapacidad ,""));
                    } else {
                        System.out.println("Tipo de vehículo no válido.");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese la matrícula del vehículo a retirar: ");
                    matricula = scanner.nextLine();
                    if (garaje.retirarAlquiler(matricula)) {
                        System.out.println("Vehículo retirado con éxito.");
                    } else {
                        System.out.println("No se pudo retirar el vehículo.");
                    }
                    break;
                case 3:
                    System.out.println("Ingresos mensuales: " + garaje.calcularIngresos() + " euros.");
                    break;
                case 4:
                    int numAutos = garaje.calcularOcupacionPorTipoVehiculo(new Auto("", 0, 0, false, false, ""));
                    int numMotos = garaje.calcularOcupacionPorTipoVehiculo(new Moto("", 0, 0, false, ""));
                    double prop = numAutos / (double) numMotos;
                    System.out.println("Proporción autos/motos: " + prop);
                    break;
                case 5:
                    System.out.println("Listado de matrículas, cuota mensual y tipo de vehículo:");
                    for (int i = 0; i < garaje.getNumEspacios(); i++) {
                        Vehiculo vehiculo = garaje.getEspacio(i);
                        if (vehiculo != null) {
                            System.out.println("Matrícula: " + vehiculo.getMatricula() + ", Cuota mensual: " + vehiculo.getCuotaMesGarage() + ", Tipo: " + vehiculo.getClass().getSimpleName());
                        }
                    }
                    break;
                case 6:
                    // Mostrar información de camiones y disponibilidad de espacios
                    garaje.mostrarInformacionCamiones();
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 7);

        scanner.close();
    }
}
