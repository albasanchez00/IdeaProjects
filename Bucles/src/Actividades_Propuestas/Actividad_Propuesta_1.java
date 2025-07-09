package Actividades_Propuestas;

import java.util.Scanner;

/* Actividad Propuesta 1. Generar un bucle que muestres el incremento de la edad mediante un bucle.
* Declaramos edad=18
* Incremnetamos la edad hasta que llegue a 40 años
* Muestramos através de un sout
*/
public class Actividad_Propuesta_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int edad=18;
        do {
            edad++;
            System.out.printf("%d\n",edad);
        }while (edad<=80);
    }
}
