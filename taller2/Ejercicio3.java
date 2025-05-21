/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2;


import java.util.Scanner;


/**
 *
 * @author Jose Manuel Hernandez Montealegre
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
          int i=0;
        System.out.println("cuantas notas quiere ingresar?");
        int numn=sc.nextInt();
            float nota[]=new float[numn];
        for(i=0;i<nota.length;i++){
        System.out.println("Introduzca la nota N."+(i+1));
        nota[i]=sc.nextFloat();
        
    }
        System.out.println("una opcion entre 0 y 5 incluidos");
        int opcion=sc.nextInt();
        if(opcion==1){
            
        int cantidad1=1;
      
           float nuevoarray[]=new float[cantidad1];
        
           System.out.println("digite una nueva nota");
            nuevoarray[i]=sc.nextFloat();
        }
        else if(opcion==2){
         
          float media=1;
float acum1=0;
            for(i=0;i<numn;i++){
                acum1+=nota[i];
               
            }
            media=((float)(acum1/numn));
            System.out.println(media);
        }
        else if(opcion==3){
            float notamayor=nota[0];
            float notamenor=nota[0];
            
            for(i=0;i<numn;i++){
               if (nota[i]>notamayor)
                   notamayor=nota[i];
               
               if(nota[i]<notamenor)
                   notamenor=nota[i];
                       
                
            }
            System.out.println("la nota mayor es :"+ notamayor);
                System.out.println("la nota menor es:"+ notamenor);
        }
        else if(opcion==4){
            
            for(i=0;i<numn;i++){
                System.out.println("la nota "+(i+1)+":");
                System.out.println(nota[i]);
                
            }
            
        }
        else if(opcion==5){
            int borrarindice=0;
            System.out.println("digite un numero entero de 0 al numero de notas ingresadas");
      borrarindice=sc.nextInt();
      for(i=borrarindice;i<numn-1;i++){
          nota[i]=nota[i+1];
      }
      
            System.out.println("la tabla queda"+"");   
            for(i=0;i<numn-1;i++){
                System.out.println("elemento "+(i+1)+"="+nota[i]);
                
            }
            if(opcion==0){
                
            }
        }
    }
}