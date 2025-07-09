package Actividades_Propuestas;

import java.util.Scanner;

/* Actividad Propuesta 5. Pedir un número y calcular su factorial.
* Por ejemplo, el factorial de 5 se denota 5! y es igual a 5 × 4 × 3 × 2 × 1 = 120
*/

public class Actividad_Propuesta_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n;
        double fac=1;

        System.out.println("Introduce un número -> ");
        n= sc.nextInt();

        for (int i=n; i>0; i--){
            fac*=i;
        }
        System.out.println("El fatorial de " + n + " es: " + fac);
    }
}
