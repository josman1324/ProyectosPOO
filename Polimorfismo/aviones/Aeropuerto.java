/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aviones;

/**
 *
 * @author Jose Manuel Henrnandez Montealegre
 */
class Aeropuerto {
    private String nombre;
    private String ciudad;
    private Avion[] aviones;
    private int numAviones;

    public Aeropuerto(String nombre, String ciudad, int capacidadAviones) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        aviones = new Avion[capacidadAviones];
        numAviones = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void agregarAvion(Avion avion) {
        if (numAviones < aviones.length) {
            aviones[numAviones] = avion;
            numAviones++;
        } else {
            System.out.println("El aeropuerto está lleno, no se puede agregar más aviones.");
        }
    }

    public void listarAviones() {
        System.out.println("Aviones en el aeropuerto " + nombre + ":");
        for (int i = 0; i < numAviones; i++) {
            System.out.println("Nombre: " + aviones[i].getNombre());
            System.out.println("Matrícula: " + aviones[i].getMatricula());
            System.out.println("Autonomía de vuelo: " + aviones[i].getAutonomiaVuelo() + " km");
            if (aviones[i] instanceof AvionPasajeros) {
                AvionPasajeros avionPasajeros = (AvionPasajeros) aviones[i];
                System.out.println("Número de pasajeros: " + avionPasajeros.getNumPasajeros());
            } else if (aviones[i] instanceof AvionCarga) {
                AvionCarga avionCarga = (AvionCarga) aviones[i];
                System.out.println("Carga máxima: " + avionCarga.getCargaMaximaKg() + " kg");
            }
            System.out.println();
        }
    }
    public String consultarInformacionPasajero(String nombrePasajero) {
    for (int i = 0; i < numAviones; i++) {
        if (aviones[i] instanceof AvionPasajeros) {
            AvionPasajeros avionPasajeros = (AvionPasajeros) aviones[i];
            Pasajero[] pasajeros = avionPasajeros.getPasajeros();
            for (int j = 0; j < avionPasajeros.getNumPasajeros(); j++) {
                if (pasajeros[j] != null && pasajeros[j].getNombre().equals(nombrePasajero)) {
                    String informacionAvion = avionPasajeros.obtenerInformacionAvion();
                    String informacionPasajeros = avionPasajeros.obtenerInformacionPasajeros();
                    return "El pasajero " + nombrePasajero + " está asignado al avión:\n" + informacionAvion + informacionPasajeros + "Aeropuerto: " + nombre + " en la ciudad de " + ciudad;
                }
            }
        }
    }
    return "El pasajero " + nombrePasajero + " no está asignado a ningún avión en este aeropuerto.";
}
}

