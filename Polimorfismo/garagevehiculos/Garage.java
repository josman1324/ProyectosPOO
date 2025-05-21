/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package garagevehiculos;

/**
 *
 * @author Jose Manuel Henrnandez Montealegre
 */
class Garage implements IGarage {
  private Vehiculo[] espacios;

    private static final int MAX_CAMIONES = 7; // Máxima cantidad de espacios para camiones
    private static final int MAX_CAMIONES_DOBLES = 3; // Máximo de camiones dobles permitidos
      private int camionesEnGaraje = 0;
    private int camionesDoblesEnGaraje = 0;
    private static final int NUM_ESPACIOS = 10;
    private int ocupados;

    public Garage() {
        espacios = new Vehiculo[NUM_ESPACIOS];
        ocupados = 0;
    }
    
public boolean alquilarEspacio(Vehiculo vehiculo) {
    if (espacios.length < NUM_ESPACIOS) {
        if (vehiculo.getMatricula() != null) {
            if (vehiculo instanceof Camion) {
                Camion camion = (Camion) vehiculo; // Realizar una conversión segura
                if (camionesEnGaraje < MAX_CAMIONES) {
                    if (camion.getTipo().equals("Doble") &&
                        camionesDoblesEnGaraje >= MAX_CAMIONES_DOBLES) {
                        return false; // No se pueden alquilar más camiones dobles
                    }
                    for (int i = 0; i < espacios.length; i++) {
                        if (espacios[i] == null) {
                            espacios[i] = camion;
                            if (camion.getTipo().equals("Doble")) {
                                camionesDoblesEnGaraje++;
                            }
                            camionesEnGaraje++;
                            return true;
                        }
                    }
                }
            } else if (vehiculo instanceof Moto || vehiculo instanceof Auto) {
                for (int i = 0; i < espacios.length; i++) {
                    if (espacios[i] == null) {
                        espacios[i] = vehiculo;
                        return true;
                    }
                }
            }
        }
    }
    return false;
}
   

    

   public boolean retirarAlquiler(String matricula) {
    for (int i = 0; i < espacios.length; i++) {
        if (espacios[i] != null && espacios[i].getMatricula() != null && espacios[i].getMatricula().equals(matricula)) {
            if (espacios[i] instanceof Camion) {
                Camion camion = (Camion) espacios[i];
                espacios[i] = null;
                if (camion.getTipo().equals("Doble")) {
                    camionesDoblesEnGaraje--;
                }
                camionesEnGaraje--;
                return true;
            } else if (espacios[i] instanceof Moto || espacios[i] instanceof Auto) {
                espacios[i] = null;
                return true;
            }
        }
    }
    return false;
}
public void mostrarInformacionCamiones() {
        int camionesDisponibles = MAX_CAMIONES - camionesEnGaraje;
        int camionesDoblesDisponibles = MAX_CAMIONES_DOBLES - camionesDoblesEnGaraje;
        System.out.println("Camiones en el garaje: " + camionesEnGaraje);
        System.out.println("Espacios disponibles para camiones: " + camionesDisponibles);
        System.out.println("Camiones Dobles en el garaje: " + camionesDoblesEnGaraje);
        System.out.println("Espacios disponibles para camiones dobles: " + camionesDoblesDisponibles);
    }


    public double calcularIngresos() {
        double ingresos = 0;
        for (int i = 0; i < ocupados; i++) {
            ingresos += espacios[i].getCuotaMesGarage();
        }
        return ingresos;
    }

    public int calcularOcupacionPorTipoVehiculo(Vehiculo vehiculo) {
        int count = 0;
        for (int i = 0; i < ocupados; i++) {
            if (espacios[i].getClass() == vehiculo.getClass()) {
                count++;
            }
        }
        return count;
    }

    public int getNumEspacios() {
        return NUM_ESPACIOS;
    }

    public Vehiculo getEspacio(int i) {
        if (i >= 0 && i < ocupados) {
            return espacios[i];
        }
        return null;
    }
}
    

