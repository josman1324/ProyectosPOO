/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3;

/**
 *
 * @author Jose Manuel Hernandez Montealegre
 */
public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;
    //Constructores

    /**
     * Constructor que crea una Cafetera con capacidadMáxima=1000 y cantidadActual=0
     */

  	public Cafetera(){
      capacidadMaxima = 1000 ;
      cantidadActual = 0 ;
    }

    /**
     * Constructor que crea una Cafetera llena, dada una capacidad máxima
     * @param capacidadMaximaUsuario capacidad maxima de la Cafetera dada por el usuario
     */

    public Cafetera(int capacidadMaximaUsuario){
      capacidadMaxima = capacidadMaximaUsuario;
      cantidadActual = capacidadMaximaUsuario ;
    }

    /**
     * Constructor que crea una Cafetera con la cantidad actual y su capacidad maxima dadas por el usuario
     * @param capacidadMaximaUsuario capacidad maxima de la Cafetera dada por el usuario
     * @param cantidadActualUsuario cantidad actual de la Cafetera dada por el usuario
     */

    public Cafetera(int capacidadMaximaUsuario, int cantidadActualUsuario){
      if (capacidadMaximaUsuario<cantidadActualUsuario){
        capacidadMaxima = capacidadMaximaUsuario ;
        cantidadActual = capacidadMaximaUsuario ;
      } else {
        capacidadMaxima = capacidadMaximaUsuario ;
        cantidadActual = cantidadActualUsuario ;
      }

    }


  	//Métodos de la clase

    /**
     * Método que obtiene la capacidad maxima de tu Cafetera
     * @return int capacidad maxima de tu Cafetera
     */

  	public int getCapacidadMaxima()
  	{
        return capacidadMaxima ;
  	}


    /**
     * Método que obtiene la cantidad actual de tu Cafetera
     * @return int "cantidad actual de tu Cafetera"
     */

    public int getCantidadActual()
    {
        return cantidadActual ;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    

    /**
     * Método que asigna un entero a cantidad actual.
     * Si la cantidad es mayor a la capacidad, se asigna a la cantidad actual el valor de capacidad máxima
     * @param nuevaCantidadActual Entero a asignar a cantidadActual
     */

    public void asignarCantidadActual(int nuevaCantidadActual)
    {
        if (nuevaCantidadActual>=capacidadMaxima){
          cantidadActual = capacidadMaxima ;
        }
        else {
          cantidadActual = nuevaCantidadActual ;
        }
    }

    /**
     * Método que asigna un entero a capacidadMaxima.
     * Si la capacidad es menor a la cantidad actual, se asigna a la capacidad máxima el valor de cantidad actual
     * @param nuevaCapacidadMaxima Entero a asignar a capacidadMaxima
     */

    public void asignarCapacidadMaxima(int nuevaCapacidadMaxima)
    {
      if (nuevaCapacidadMaxima<=cantidadActual){
        capacidadMaxima = cantidadActual ;
      } else {
        capacidadMaxima = nuevaCapacidadMaxima ;
      }
    }

    /**
     * Método que iguala la cantidad actual de tu Cafetera con la capacidad máxima
     */

  	public void llenarCafetera()
  	{
  		cantidadActual = capacidadMaxima ;
  	}

    /**
     * Método que sirve café (vacía café de la Cafetera)
     * @param cantidadAServir Entero que se restará a la cantidad actual
     */

    public void servirCafe(int cantidadAServir)
    {
      int cantidadNueva ;

      cantidadNueva = cantidadActual - cantidadAServir ;

      if (cantidadNueva<0){
        cantidadActual = 0 ;
      }

      else if (cantidadNueva>capacidadMaxima){
        cantidadNueva = capacidadMaxima ;
        cantidadActual = cantidadNueva ;
      }

      else {
        cantidadActual = cantidadNueva ;
      }
    }

    /**
     * Método que vacía la Cafetera
     */

    public void vaciarCafetera()
    {
       cantidadActual = 0 ;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "Capacidad Maxima=" + capacidadMaxima  + ", Cantidad Actual=" + cantidadActual +'}';
    }

 

    /**
     * Método que agrega café a tu Cafetera
     * @param cantidadAgregada Entero que se sumará a la cantidad actual
     */

    public void agregarCafe(int cantidadAgregada)
    {
      int cantidadNueva ;

      cantidadNueva = cantidadActual + cantidadAgregada ;

      if (cantidadNueva<0){
        cantidadActual = 0 ;
      }
      else if (cantidadNueva>capacidadMaxima){
        cantidadNueva = capacidadMaxima ;
        cantidadActual = cantidadNueva ;
      }

      else {
        cantidadActual = cantidadNueva ;
      }
    }
}
 
