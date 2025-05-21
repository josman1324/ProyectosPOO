package taller1;
 /* @author Jose Manuel Hernandez Montealegre*/
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int creditos, matricula,descuentom,repro;
        String carrera;
        double prom,descuento;

        System.out.print("Tipo de carrera (Tecnologia/Profesional): ");
        carrera = sc.nextLine();

        System.out.print("Digite su promedio: ");
        prom = sc.nextDouble();
if (prom >9.5 && "Tecnologia".equals(carrera))
{
  creditos = 55;
            descuento = 0.25;
            descuentom = (int) (((creditos / 5) * 3000) * descuento);
            matricula = (int)(((creditos / 5)*3000)-descuentom);
            System.out.println("El valor de la matricula es: " + matricula);
}
        else if (prom >= 9.0 && prom < 9.5 && "Tecnologia".equals(carrera)) {
            creditos = 50;
            descuento = 0.10;
            descuentom = (int) (((creditos / 5) * 3000) * descuento);
            matricula = (int)(((creditos / 5)*3000)-descuentom);
            System.out.println("El valor de la matricula es: " + matricula);

        }
else if (prom >7.0 && prom<9.0 && "Tecnologia".equals(carrera)) {
            creditos = 50;
            descuento = 0;
            descuentom=0;
            matricula = (int)((creditos / 5)*3000);
            System.out.println("El valor de la matricula es: " + matricula+" sin descuento");
      
    }



else if (prom<=7.0 && "Tecnologia".equals(carrera)) {
      System.out.println("¿Cuantas materias reprobaste?"); 
      repro=sc.nextInt();
      creditos=45;
     if (repro >= 0 && repro <= 3) {
                creditos = 45;
            } else if (repro >= 4) {
                creditos = 40;
            }
            descuento = 0;
            matricula = (int) (((creditos / 5) * 3000));
            System.out.println("El valor de la matricula es: " + matricula + " sin descuento");
        }
else if (prom >=9.5 && "Profesional".equals(carrera)) {
            creditos = 55;
            descuento = 0.20;
            descuentom=(int) (((creditos / 5) * 1800) * descuento);
            matricula = (int)(((creditos / 5)*1800)- descuentom);
            System.out.println("El valor de la matricula es: " + matricula);
}
else if (prom <9.5 && "Profesional".equals(carrera)) {
            creditos = 55;
            descuento = 0;
            descuentom=0;
            matricula = (int)(((creditos / 5)*1800)- descuentom);
            System.out.println("El valor de la matricula es: " + matricula+" sin descuento");
}
  } 
}
