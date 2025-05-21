/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author josma
 */
public class test {
    public static void main(String[] args) {
        List<Estudiante> lista=new ArrayList<> ();
        lista.add(new Estudiante("Jose Manuel","Hernandez Montealegre",1075792008));
        lista.add(new Estudiante("Cain Judas","Hernandez Montealegre",1075792008));
        lista.add(new Estudiante("Abel Martin","Hernandez Montealegre",1075792008));
        
          for(Estudiante es:lista){
            
            System.out.println("estudiante: " +es.getNombres()+es.getApellidos()+es.getId());
            
          }
          
            for(int i=0;i<lista.size();i++){
        System.out.println("estudiantes :"+(i+1)+lista.get(i).informacion());
    }
            Iterator<Estudiante>mi_iterator=lista.iterator();
            String str = "";
      while (mi_iterator.hasNext()) {
         str = (String) mi_iterator.next();
         if (str.equals("Orange")) {
            mi_iterator.remove();
            System.out.println("The element Orange is removed");
            break;
         }
    }
            }
}
    
  


