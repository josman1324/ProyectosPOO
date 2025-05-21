/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajaregistradora;

import java.util.Scanner;

/**
 *
 * @author Jose Manuel Henrnandez Montealegre
 */
public class TestCaja {  

public static void main(String[] args) {
        CajaRegistradora caja = new CajaRegistradora("MiCaja");

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Ingresar monedas");
            System.out.println("2. Listar Contenido");
            System.out.println("3. Mostrar saldo");
            System.out.println("4. Extraer monedas");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Tipo de moneda: ");
                    double tipo = scanner.nextDouble();
                    System.out.print("Número de unidades: ");
                    int unidades = scanner.nextInt();
                    if (caja.meterMonedas(tipo, unidades)) {
                        System.out.println("Monedas ingresadas con éxito.");
                    } else {
                        System.out.println("Ingreso de monedas fallido.");
                    }
                    break;
                case 2:
                    System.out.println("Contenido de la caja:");
                    for (double t : caja.getTiposDeMonedas()) {
                        System.out.println("Tipo de moneda: " + t + ", Unidades: " + caja.getUnidadesTipoMoneda(t));
                    }
                    break;
                case 3:
                    System.out.println("Saldo actual: " + caja.getSaldo());
                    break;
                case 4:
                    System.out.print("Tipo de moneda: ");
                    double tipoExtraer = scanner.nextDouble();
                    System.out.print("Número de unidades a extraer: ");
                    int unidadesExtraer = scanner.nextInt();
                    if (caja.sacarMonedas((float) tipoExtraer, unidadesExtraer)) {
                        System.out.println("Monedas extraídas con éxito.");
                    } else {
                        System.out.println("Extracción de monedas fallida.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}