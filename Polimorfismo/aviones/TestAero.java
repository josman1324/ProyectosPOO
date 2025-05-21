/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aviones;

/**
 *
 * @author Jose Manuel Henrnandez Montealegre
 */
public class TestAero {
    public static void main(String[] args) {
        Aeropuerto aeropuertoMilitar = new Aeropuerto("Aeropuerto Militar", "Ciudad Militar", 5);
        Aeropuerto aeropuertoComercial1 = new Aeropuerto("Aeropuerto Comercial 1", "Ciudad Comercial 1", 10);
        Aeropuerto aeropuertoComercial2 = new Aeropuerto("Aeropuerto Comercial 2", "Ciudad Comercial 2", 10);

        AvionPasajeros avionPasajeros1 = new AvionPasajeros("Avion Pasajeros 1", "ABC123", 2000, 150);
        AvionCarga avionCarga1 = new AvionCarga("Avión de Carga 1", "XYZ789", 1500, 5000);
        Avioneta avioneta1 = new Avioneta("Avioneta 1", "123XYZ", 500);

        aeropuertoMilitar.agregarAvion(avionPasajeros1);
        aeropuertoComercial1.agregarAvion(avionCarga1);
        aeropuertoComercial2.agregarAvion(avioneta1);

Pasajero pasajero1 = new Pasajero("Jose", 1, 30);
Pasajero pasajero2 = new Pasajero("Pasajero2", 2, 25);
Pasajero pasajero3 = new Pasajero("Pasajero3", 3, 40);

 avionPasajeros1.getPasajeros()[0] = pasajero1;
    avionPasajeros1.getPasajeros()[1] = pasajero2;
    avionPasajeros1.getPasajeros()[2] = pasajero3;

    aeropuertoMilitar.agregarAvion(avionPasajeros1);
 
        System.out.println("Información de los aeropuertos:");
    aeropuertoMilitar.listarAviones();
    aeropuertoComercial1.listarAviones();
    aeropuertoComercial2.listarAviones();

    String nombrePasajeroBuscado = "Jose"; //nombre del pasajero que desees buscar.
    String InformacionPasajero = aeropuertoMilitar.consultarInformacionPasajero(nombrePasajeroBuscado);
    System.out.println(InformacionPasajero);
    }



}
