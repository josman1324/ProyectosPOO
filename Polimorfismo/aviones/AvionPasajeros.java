/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aviones;

/**
 *
 * @author Jose Manuel Henrnandez Montealegre
 */
class AvionPasajeros extends Avion {
    private int numPasajeros;
    private Pasajero[] pasajeros;

    public AvionPasajeros(String nombre, String matricula, int autonomiaVuelo, int numPasajeros) {
        super(nombre, matricula, autonomiaVuelo);
        this.numPasajeros = numPasajeros;
        pasajeros = new Pasajero[numPasajeros]; // Inicializa el arreglo de pasajeros con el tamaño adecuado
    }
    public int getNumPasajeros() {
        return numPasajeros;
    }

    public Pasajero[] getPasajeros() {
        return pasajeros;
    }
    @Override
    public String obtenerInformacionPasajeros() {
    String informacion = "Pasajeros a bordo:\n";
    for (int i = 0; i < numPasajeros; i++) {
        if (pasajeros[i] != null) {
            informacion += "Nombre: " + pasajeros[i].getNombre() + "\n";
            informacion += "ID: " + pasajeros[i].getId() + "\n";
            informacion += "Edad: " + pasajeros[i].getEdad() + "\n";
            informacion += "-----------\n";
        }
    }
    return informacion;
}
}