
package taller3;

/**
 *
 * @author Jose Manuel Hernandez Montealegre
 */
public class Complejo {

   //Clase Complejo

    //Declaro las variables que serán tipo double tal y como podemos ver en los métodos constructores
   private double real;
    private double imag;

    //Constructor que inicializa sus atributos a 0
    public Complejo() {
        real = 0;
        imag = 0;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getReal() {
        return real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }
     public double getImag() {
        return imag;
    }

    //Constructor que inicializa los atributos a los valores indicados por los parámetros.
    public Complejo(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    //Devuelve la parte real del objeto.
    public double consulta_Real() {
        return real;
    }

    //Devuelve la parte imaginaria del objeto.
    public double consulta_Imag() {
        return imag;
    }

    //Asigna a la parte real del objeto el valor indicado en el parámetro real
    public void cambia_Real(double real) {
        this.real = real;
    }

    //Asigna a la parte imaginaria del objeto el valor indicado en el parámetro imag.
    public void cambia_Imag(double imag) {
        this.imag = imag;
    }

    /*Convierte a String el número complejo, mediante la concatenación de sus atributos y devuelve 
     como resultado la cadena de texto 3 + 4i, si 3 es la parte real y 4 la parte imaginaria.*/
    @Override
    public String toString() { //Método predefinido por Java
        return String.format("%.0f + %.0fi", real, imag);
    }
     public void sumar(Complejo b) {
        double sumaReal;
        double sumaImag;
        sumaReal = b.real + this.real; //Uno es igual al valor de real del objeto pasado como parámetro + el valor de real en la clase(el introducido por teclado)
        sumaImag = b.imag + this.imag; //Dos es igual al valor de imaginario pasado como parámetro + el valor de real en la clase (el introducido por teclado)
        System.out.printf("La suma de la parte real(%.2f y %.2f) es igual a %.2f\n", this.real, b.real, sumaReal);
        System.out.printf("La la suma parte imaginaria (%.2f y %.2f) es igual a %.2f\n", this.imag, b.imag, sumaImag);
     }
     public void restar(Complejo b) {
        double restaReal;
        double restaImag;
        restaReal = b.real - this.real; //Uno es igual al valor de real del objeto pasado como parámetro - el valor de real en la clase(el introducido por teclado)
        restaImag = b.imag - this.imag; //Dos es igual al valor de imaginario pasado como parámetro - el valor de real en la clase (el introducido por teclado)
        System.out.printf("La la resta de la parte real (%.2f y %.2f) es igual a %.2f\n", this.real, b.real, restaReal);
        System.out.printf("La resta de la parte imaginaria (%.2f y %.2f) es igual a %.2f\n", this.imag, b.imag, restaImag);
    }
      public void multiplicar(Complejo b) {
        double multiplicaReal;
        double multiplicaImag;
        multiplicaReal = b.real * this.real; //Uno es igual al valor de real del objeto pasado como parámetro * el valor de real en la clase(el introducido por teclado)
        multiplicaImag = b.imag * this.imag; //Dos es igual al valor de imaginario pasado como parámetro * el valor de real en la clase (el introducido por teclado)
        System.out.printf("La  multiplicacion de la parte real (%.2f y %.2f) es igual a %.2f\n", this.real, b.real, multiplicaReal);
        System.out.printf("La multiplicacion de la parte imaginaria (%.2f y %.2f) es igual a %.2f\n", this.imag, b.imag, multiplicaImag);
    }
       public void dividir(Complejo b) {
        double dividaReal;
        double dividaImag;
        dividaReal = b.real / this.real; //Uno es igual al valor de real del objeto pasado como parámetro / el valor de real en la clase(el introducido por teclado)
        dividaImag = b.imag / this.imag; //Dos es igual al valor de imaginario pasado como parámetro / el valor de real en la clase (el introducido por teclado)
        System.out.printf("La division de la parte real (%.2f y %.2f) es igual a %.2f\n", this.real, b.real, dividaReal);
        System.out.printf("La division de la parte imaginaria (%.2f y %.2f) es igual a %.2f\n", this.imag, b.imag, dividaImag);
    }


}
