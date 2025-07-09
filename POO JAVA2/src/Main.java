import Cosas.Aula;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Creamos nuestro primer objeto... instanciamos la clase Persona...
        //Objeto → Es una instancia de una clase.
//        Persona p1=new Persona("Mery", (byte)45,1.69);
//        //Valores de tipo Objeto... Referencia un espacio en memoria
//        System.out.println(p1); //id=1
//
//        Persona p2=p1;
//        System.out.println(p2); //id=1
//
//        Persona p3=new Persona();
//        System.out.println(p3);
//        p3=null; //Este objeto se queda sin referencia en memoria y el recolector de basura lo elimina...
//        System.out.println(p3); //id=2
//
//        Persona p4; //new → es quien crea el objeto ... y su referencia en memoria.
//        //Otra forma que actual el recolector de basura
//        p4=new Persona(); //id=3 pero se anula y crea el id=4.
//        p4=new Persona();//anula la referencia de la línea anterior
//
//
//        //Llamada al método Getter.. solicitar información o mostrar.
//        System.out.println("Nombre: "+p1.getNombre()); //Mary
//        System.out.println("Edad: "+p1.getEdad());
//        System.out.println("Estatura: "+p1.getEstatura());
//
//        Persona p5=new Persona("Juan", (byte)22,1.80);
//        System.out.println("Nombre: "+p5.getNombre());
//        System.out.println("Edad: "+p5.getEdad());
//        System.out.println("Estatura: "+p5.getEstatura());
//
//        p4.setNombre("Alba");
//        p4.setEdad((byte)23);
//        p4.setEstatura(1.60);
//        /* Llamada a un Atributo Static */
//        System.out.println("Nombre de la empresa: "+Persona.empresa);
//        System.out.println("\nNombre: "+p2.nombre+"\nEmpresa: "+Persona.empresa);
//
//        //Cambiar el valor de un atributo Static
//        Persona.empresa="\nLos cinco hermanos, S.L.";
//        System.out.println("Nuevo nombre de la empresa: "+Persona.empresa);


        /* Paquetes y Clases */
        Aula aula = new Aula(); // ← No sé puede al ser externa la clase, por lo que debemos agregar en Aula (public class)
        //Para acceder a sus valores debemos hacerlo mediante los métodos getter y setter.
        aula.setId("AT01"); //Encapsula su valor...


    }
}