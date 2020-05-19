
package ejemplotipolist;

import java.util.ArrayList;
import java.util.List;


public class EjemploTipoList {
public EjemploTipoList(){
principal();

}
public void principal(){

    List <Datos> lista = new ArrayList<>();
    Datos datos = new Datos ();
    datos.setNombre("Leo");
    datos.setEdad(21);
    lista.add(datos);
    
    datos = new Datos();
    datos.setNombre("Fernando");
    datos.setEdad(24);
    lista.add(datos);
    datos = new Datos();
    datos.setNombre("Javier");
    datos.setEdad(30);
    lista.add(datos);

    lista.forEach(elemento ->{
        System.out.println("nombre " + elemento.getNombre());
        System.out.println("Edad " + elemento.getEdad());
    });
    System.out.println("\n \n Otra forma de recorrer los datos ");
    for(Datos contenido : lista ){
    
    System.out.println("nombre " + contenido.getNombre());
        System.out.println("Edad " + contenido.getEdad());
    }
    datos = new Datos();
    datos.setNombre("Gustavo");
    datos.setEdad(19);
    lista.add(datos);
    
     System.out.println("\n \n Otra forma de recorrer los datos ");
    lista.stream().forEach((valores) ->{
    System.out.println("nombre " + valores.getNombre());
        System.out.println("Edad " + valores.getEdad());
    
        if (valores.getNombre().equals("Fernando")){
            System.out.println("Se encontro el dato ");
        }
    });
    
    
}
   
    public static void main(String[] args) {
         new EjemploTipoList();
    }
    
}
