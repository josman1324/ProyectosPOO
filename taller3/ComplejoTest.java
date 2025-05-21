package taller3;

import java.util.Scanner;

/**
 *
 * @author Jose Manuel Hernandez Montealegre
 */
public class ComplejoTest {
      public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //Creamos el objeto numComple1 en el que los sumaImag atributos se inicializan a 0
        Complejo numComple1 = new Complejo();

        //Creamos el objeto numComple2 en el que los sumaImag atributos se inicializan a los párametros dados: 6 y 8.
        Complejo numComple2 = new Complejo(6,8);

        System.out.print("Introduzca el número la parte real del número: ");
        double realComple1 = teclado.nextDouble();
        numComple1.cambia_Real(realComple1);

        System.out.print("Introduzca la parte imaginario del número: ");
        double realComple2 = teclado.nextDouble();
        numComple1.cambia_Imag(realComple2); //

        System.out.println("\nLa parte real introducida es: " + numComple1.consulta_Real()); //Llamada al metodo para mostrar
        System.out.println("La parte imaginaria introducida es: " + numComple1.consulta_Imag());//Llamada al metodo para mostrar

        System.out.println("\nEl numero complejo introducido por teclado es: " + numComple1.toString());//Llamada al metodo toString
        System.out.println("El número complejo por parametros es: " + numComple2.toString()+"\n"); //Llamada al metodo toString

        numComple1.sumar(numComple2); //Llamada al metodo sumar
  numComple1.restar(numComple2);
  numComple1.multiplicar(numComple2);
  numComple1.dividir(numComple2);
    }
}
