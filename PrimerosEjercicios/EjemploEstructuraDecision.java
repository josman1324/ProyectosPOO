/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo;

import javax.swing.JOptionPane;

/**
 *
 * @author josma
 */


public class EjemploEstructuraDecision {

        public static void main(String args[]) {

            char x;

            x = JOptionPane.showInputDialog("Digite algunos de los siguientes números romanos [I,V,X,L,C,D,M]: ").charAt(0);
            //Al final se le pone .charAt(0) para tomar el primer valor que digite el usuario en teclado.
if x<=90
        x -= 32; //Esto convierte la letra en mayuscula (por si el usuario lo escribe en minuscula...). De mayuscula a minuscula se suma 32.

            } //Esto convierte la letra en mayuscula (por si el usuario lo escribe en minuscula...). De mayuscula a minuscula se suma 32.

            switch (x) {
                case 'I' -> JOptionPane.showMessageDialog(null, "La letra " + x + " corresponde al número 1");
                case 'V' -> JOptionPane.showMessageDialog(null, "La letra " + x + " corresponde al número 5");
                case 'X' -> JOptionPane.showMessageDialog(null, "La letra " + x + " corresponde al número 10");
                case 'L' -> JOptionPane.showMessageDialog(null, "La letra " + x + " corresponde al número 50");
                case 'C' -> JOptionPane.showMessageDialog(null, "La letra " + x + " corresponde al número 50");
                case 'D' -> JOptionPane.showMessageDialog(null, "La letra " + x + " corresponde al número 500");
                case 'M' -> JOptionPane.showMessageDialog(null, "La letra " + x + " corresponde al número 1000");

                default -> JOptionPane.showMessageDialog(null, "Error: Digite I,V,X,L,C,D,M ");
            }
            }
        }
