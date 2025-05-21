/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aviones;

/**
 *
 * @author Jose Manuel Henrnandez Montealegre
 */
class AvionCarga extends Avion {
    private int cargaMaximaKg;

    public AvionCarga(String nombre, String matricula, int autonomiaVuelo, int cargaMaximaKg) {
        super(nombre, matricula, autonomiaVuelo);
        this.cargaMaximaKg = cargaMaximaKg;
    }

    public int getCargaMaximaKg() {
        return cargaMaximaKg;
    }
}
