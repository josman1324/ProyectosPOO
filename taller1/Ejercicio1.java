/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller1;

import java.util.Scanner;

/**
 *
 * @author Jose Manuel Hernandez Montealegre
 */
public class Ejercicio1 {

    
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int valoruni,valorunidesc,valortotal = 0;
        float cant;
           System.out.print("Cantidad de llantas: ");
        cant=sc.nextFloat();
        valoruni=100;
     
        
        if(cant<5){
            valoruni=(int) (valoruni*1);  
            valortotal=(int) (valoruni*cant);
            valorunidesc=(int)( valortotal/cant);
             System.out.println("Precio por unidad:     "+valorunidesc);
                  System.out.println("Valor total:     "+valortotal);
             
        }
        
        else if(cant>=5 && cant<=10){
             valoruni=(int) (valoruni*0.75);  
            valortotal=(int) (valoruni*cant);
            valorunidesc=(int)( valortotal/cant);
             System.out.println("Precio por unidad:     "+valorunidesc);
                  System.out.println("Valor total:     "+valortotal);
             
            
        }
            else{
                    valoruni=(int) (valoruni*0.50);
                            valortotal=(int)(valoruni*cant);
                            valorunidesc=(int) (valortotal/cant);
                             System.out.println("Precio por unidad:     "+valorunidesc);
                  System.out.println("Valor total:     "+valortotal);
             
                
            }
   
            
        }
 
}
