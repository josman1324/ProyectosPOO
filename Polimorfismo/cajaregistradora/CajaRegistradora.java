/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajaregistradora;

/**
 *
  @author Jose Manuel Henrnandez Montealegre*/

public class CajaRegistradora implements ICajaRegistradora {
    private final String nombre;
    private double[] tiposMonedas;
    private int[] cantidadesMonedas;

    public CajaRegistradora(String nombre) {
        this.nombre = nombre;
        this.tiposMonedas = new double[0];
        this.cantidadesMonedas = new int[0];
    }

    @Override
    public String getNombre() {
        return nombre;
    }
 @Override
    public int getNumTipoMonedas() {
        return tiposMonedas.length;
    }
   

    @Override
    public int getUnidadesTipoMoneda(double tipo) {
        for (int i = 0; i < tiposMonedas.length; i++) {
            if (tiposMonedas[i] == tipo) {
                return cantidadesMonedas[i];
            }
        }
        return -1;
    }

    @Override
    public boolean meterMonedas(double tipo, int unidades) {
        if (tipo <= 0 || unidades <= 0) {
            return false;
        }

        for (int i = 0; i < tiposMonedas.length; i++) {
            if (tiposMonedas[i] == tipo) {
                cantidadesMonedas[i] += unidades;
                return true;
            }
        }

        // Tipo de moneda no existía, agregamos uno nuevo.
        double[] newTiposMonedas = new double[tiposMonedas.length + 1];
        int[] newCantidadesMonedas = new int[cantidadesMonedas.length + 1];

        System.arraycopy(tiposMonedas, 0, newTiposMonedas, 0, tiposMonedas.length);
        System.arraycopy(cantidadesMonedas, 0, newCantidadesMonedas, 0, cantidadesMonedas.length);

        newTiposMonedas[tiposMonedas.length] = tipo;
        newCantidadesMonedas[cantidadesMonedas.length] = unidades;

        tiposMonedas = newTiposMonedas;
        cantidadesMonedas = newCantidadesMonedas;

        return true;
    }

    @Override
    public boolean monedaValida(double tipo) {
        return tipo > 0;
    }

    @Override
    public boolean sacarMonedas(float tipo, int unidades) {
        if (tipo <= 0 || unidades <= 0) {
            return false;
        }

        for (int i = 0; i < tiposMonedas.length; i++) {
            if (tiposMonedas[i] == tipo) {
                if (cantidadesMonedas[i] >= unidades) {
                    cantidadesMonedas[i] -= unidades;
                    if (cantidadesMonedas[i] == 0) {
                        eliminarTipoMoneda(i);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private void eliminarTipoMoneda(int index) {
        double[] newTiposMonedas = new double[tiposMonedas.length - 1];
        int[] newCantidadesMonedas = new int[cantidadesMonedas.length - 1];

        for (int i = 0, j = 0; i < tiposMonedas.length; i++) {
            if (i != index) {
                newTiposMonedas[j] = tiposMonedas[i];
                newCantidadesMonedas[j] = cantidadesMonedas[i];
                j++;
            }
        }

        tiposMonedas = newTiposMonedas;
        cantidadesMonedas = newCantidadesMonedas;
    }

    @Override
    public void vaciarCajaRegistradora() {
        tiposMonedas = new double[0];
        cantidadesMonedas = new int[0];
    }

    @Override
    public double[] getTiposDeMonedas() {
        return tiposMonedas;
    }

    @Override
    public double getSaldo() {
        double saldo = 0;
        for (int i = 0; i < tiposMonedas.length; i++) {
            saldo += tiposMonedas[i] * cantidadesMonedas[i];
        }
        return saldo;
    }
}

