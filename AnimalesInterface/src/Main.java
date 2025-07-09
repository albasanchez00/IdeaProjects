import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Perro lorenzo=new Perro(12.0,800,7,"Chiguaua");
        System.out.println(lorenzo);
        lorenzo.voz();
        System.out.println("Version sonido: "+Sonido.version);
        //También se puede → System.out.println("Version sonido: "+Perro.version);
        //Sonido.version=5; -> ERROR porque es un atributo final -> Constante (const)
        Sonido.bostezo(); //los métodos estáticos dentro de una interface solo pueden ser llamados desde su misma interface



        Caracol marcela=new Caracol(0.5,15.0,1,"Islas Canarias");
        System.out.println(marcela);
        marcela.mostrarUbicacion();


        /* Actividad Herencia. Implementa la clase abstracta Polígono, con los atributos base y altura, de tipo double y
        el método abstracto double area().

        *****

        * Heredando de Polígono, implementa la clase abstracta Triangulo y Rectangulo
        */



        /* Actividad Interfaz. Diseñar la clase Futbolista con los atributos dni, nombre, edad y numeroGoles.
        * Implementar:
            * Constructor y los métodos toString() y equals basado en DNI
            * Diseña las clases Entrenador(), con los atributos nombre, edad, dni e idFederacion
            * Diseña la clase Masajista(), con los atributos nombre, edad, dni, codColegiado, anioExperiencia

        * Implementa la interfaz aumemnto de sueldo, la cual solo se aplica al futbolista y entrenador.
        * Que se le anuncie: "Tienes un aumendo de sueldo"
        */

        EquipoFubol jugador1=new Futbolista("Pedro","06331960Z", 24, 3);
    }
}