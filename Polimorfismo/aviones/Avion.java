/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aviones;

/**
 *
 * @author Jose Manuel Henrnandez Montealegre
 */
class Avion {
    private String nombre;
    private String matricula;
    private int autonomiaVuelo;

    public Avion(String nombre, String matricula, int autonomiaVuelo) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.autonomiaVuelo = autonomiaVuelo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getAutonomiaVuelo() {
        return autonomiaVuelo;
    }
    public String obtenerInformacionAvion() {
    String informacion = "Nombre: " + nombre + "\n";
    informacion += "Matrícula: " + matricula + "\n";
    informacion += "Autonomía de vuelo: " + autonomiaVuelo + " km\n";
    return informacion;
}

public String obtenerInformacionPasajeros() {
    return "";
}
}

