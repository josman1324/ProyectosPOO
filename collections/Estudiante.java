/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collections;

/**
 *
 * @author josma
 */
public class Estudiante {
private String nombres;
private String apellidos;
private double id;

    public Estudiante(String nombres, String apellidos, double id) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.id = id;
        
     
    }
       public String informacion(){
    return "nombres= "+nombres+","+"apellidos= "+apellidos+","+"id= "+id;
}

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public double getId() {
        return id;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setId(double id) {
        this.id = id;
    }
    

    
}
