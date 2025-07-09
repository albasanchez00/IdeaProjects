import javax.swing.*;
import java.util.Scanner;

/* La clausula return dentro de una función devuelve un valor que declarado en el prototipo de la función.
* Ejemplo:
    static Int pedirEdad(){
        boolean correcto=false;
        int edad;

        do{
            System.out.println("Indica la edad →");
            int edad= sc.nectInt();
            if(edad>=0 && edad<=120){
                correcto=true
            }
        } while(!correcto);
        return edad;
    }
*/

public class ReturnFunciones {
    static boolean correcto; // → Declaramos correcto como una variable Global.

    public static void main(String[] args) {
        // mostrarEdad() → Necesita un valor int que devolverá la función pedirEdad().
        mostrarEdad(pedirEdad());
        mostrarNombre(pedirNombre());
    }


    // Crear la función pedirEdad() y luego crea la funcion mostrarEdad().
    static int pedirEdad(){
        correcto=false;
        int edad;
        // Solicitamos la edad →
        do{
            System.out.print("Ingresa tu edad → ");;
            edad=new Scanner(System.in).nextInt();
            if(edad>=0 && edad<=120){
                correcto=true;
            }
        } while(!correcto);
        return edad; //Enviámos la edad leída en un formato correcto.
    }

    static void mostrarEdad(int edad){
        System.out.println("Tienes "+edad+" años");
    }


    //Crear la función pedirNombre() y luego crea la funcion mostrarNombre().
    static String pedirNombre(){
        String nombre;
        correcto=false; //viene en valor true de la función anterior.
        // Solicitamos el nombre →
        do{
            System.out.print("Ingresa tu nombre → ");;
            nombre=new Scanner(System.in).nextLine();
            if(!nombre.equals("")){ // → Si tiene algún carácter y no está vacío.
                correcto=true;
            }
        } while(!correcto);
        return nombre; //Enviámos la edad leída en un formato correcto.
    }

    static void mostrarNombre(String nombre){
        System.out.println("Tu nombre es "+nombre);
    }
}

