/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo;

/**
 *
 * @author josma
 */

public class y{

    public static void main(String[] args) {
        int i,j;
        for (i = 1, j = i + 10; i <= 9; i++, j = 2 * i) {
            System.out.println("i= " + i + " j= " + j);
        }
        System.out.println("iout= " + i + " jout= " + j);

    }
}