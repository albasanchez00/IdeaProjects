import modelos.Alumno;
import modelos.Persona;
import modelos.Profesor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Creamos e insertamos los datos
        Persona persona = new Persona("María","Perez",45, Persona.Sexo.FEMININO);
        Alumno alumno = new Alumno("José","Jimenez",25, Persona.Sexo.MASCULINO, 5, "Francés","3B", "Manuel Huertas");
        Profesor profesor = new Profesor("Manuel","Martinez",52, Persona.Sexo.MASCULINO,"3B",1800,"Historia");


        //Mostramos los datos.
        System.out.println("\n****\n"+persona);
        System.out.println("\n****\n"+alumno);
        System.out.println("\n****\n"+profesor);


        //Overriding
        System.out.println("\n****");
        System.out.println(profesor.getNombre());
        System.out.println("\n****");
        System.out.println(alumno.getNombre());

        //Polimorfismo
        Persona[] grupoPerosnas=new Persona[4];
        grupoPerosnas[0]=persona;
        grupoPerosnas[1]=alumno;
        grupoPerosnas[2]=profesor;
        grupoPerosnas[3]=new Persona("Luisa", "Martín", 22, Persona.Sexo.FEMININO);

        for(Persona p:grupoPerosnas){
            System.out.println("\n"+p);
        }

    }
}