/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1;

import java.util.Scanner;

/**
 *
 * @author Jose Manuel Hernandez Montealegre
 */
public class Examen1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int Max_Vehiculos = 100;
        double[][] datosVehiculos = new double[Max_Vehiculos][6];
        int contadorVehiculos = 0;

        while (true) {
            System.out.println("Ingreso de datos para un vehículo:");
            System.out.print("Tipo de servicio (1. Cargue, 2. Descargue): ");
            double tipoServicio = scanner.nextInt();
            System.out.print("Tipo de producto (1. Perecedero, 2. No perecedero): ");
            double tipoProducto = scanner.nextInt();
            System.out.print("Peso transportado (en toneladas): ");
            double pesoTransportado = scanner.nextDouble();
            System.out.print("Tiempo de permanencia (en horas): ");
            double tiempoPermanencia = scanner.nextDouble();
            System.out.print("Largo del camión (en metros): ");
            double largoCamion = scanner.nextDouble();

            double costoParqueadero = 0;

            if (tipoServicio == 2) {  // Costo Para los vehículos que entran a descargar
                if (tipoProducto == 1 && pesoTransportado < 8) {
                    costoParqueadero = pesoTransportado * 15000; //costo de los productos perecederos que es el tipo de producto==1
                } else if (tipoProducto == 1 && pesoTransportado >= 8) {
                    costoParqueadero = pesoTransportado * 9000;
                } else if (tipoProducto == 2 && pesoTransportado <= 10) {
                    costoParqueadero = 60000;
                } else if (tipoProducto == 2 && pesoTransportado > 10) {
                    costoParqueadero = 60000 + (pesoTransportado - 10) * 7000;
                }
            } else if (tipoServicio == 1 && tiempoPermanencia > 2) {  // Costo Para lo vehculos que entran a cargar
                costoParqueadero =(tiempoPermanencia - 2) * 4000;
                if (largoCamion > 4) {
                    costoParqueadero *= 1.25;
                }
            }

            datosVehiculos[contadorVehiculos][0] = tipoServicio;
            datosVehiculos[contadorVehiculos][1] = tipoProducto;
            datosVehiculos[contadorVehiculos][2] = pesoTransportado;
            datosVehiculos[contadorVehiculos][3] = tiempoPermanencia;
            datosVehiculos[contadorVehiculos][4] = largoCamion;
            datosVehiculos[contadorVehiculos][5] = costoParqueadero;

            contadorVehiculos++;  //contador del numero de vehiculos

            System.out.print("¿Desea ingresar otro vehículo? (s/n): ");
            String respuesta = scanner.next();
          if (!respuesta.equals("s")) {
    break;
}
        }

        double totalCostoCargue = 0;
        double totalCostoDescargue = 0;
        int countMenosDeDosHoras = 0;
        int countProductosPerecederos = 0;

        for (int i = 0; i < contadorVehiculos; i++) {
            if (datosVehiculos[i][0] == 1) {  // Estos son los vehículos que entraron a cargar
                totalCostoCargue += datosVehiculos[i][5];
            } else if (datosVehiculos[i][0] == 2) {  // Estos son los vehículos que entraron a descargar
                totalCostoDescargue += datosVehiculos[i][5];

                if (datosVehiculos[i][1] == 1) {  // Producto perecedero
                    countProductosPerecederos++;
                }
            }

            if (datosVehiculos[i][3] < 2) {  // Para los vehículos que duraron menos de dos horas
                countMenosDeDosHoras++;
            }
        }

        double promedioCostoCargue = totalCostoCargue / (contadorVehiculos - countProductosPerecederos);
        double promedioCostoDescargue = totalCostoDescargue / countProductosPerecederos;

        System.out.println("\nInforme:");
        System.out.println("a. Valor promedio del costo del parqueadero para cargue: " + promedioCostoCargue);
        System.out.println("   Valor promedio del costo del parqueadero para descargue: " + promedioCostoDescargue);
        System.out.println("b. Cantidad de vehículos y valor del costo de parqueadero por cada tipo de servicio:");
        System.out.println("   - Cargue: " + (contadorVehiculos - countProductosPerecederos) + " vehículos, costo total: " + totalCostoCargue);
        System.out.println("   - Descargue: " + countProductosPerecederos + " vehículos, costo total: " + totalCostoDescargue);
        System.out.println("c. Cantidad de vehículos que duraron menos de dos horas de permanencia: " + countMenosDeDosHoras);
        System.out.println("d. Valor del costo del parqueadero para los vehículos que descargaron productos perecederos: " + totalCostoDescargue);
    }
}




