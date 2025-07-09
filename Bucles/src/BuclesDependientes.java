import java.util.Scanner;

/* El bucle generalmente depende del valor del externo */

public class BuclesDependientes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ejemplo de Bucle Dependiente → Socilitar un númeor y vamos a dibujar un triangulo de n lados utilizando **

        System.out.print("Ingrese el nº de * para el triángulo → ");
        int n = sc.nextInt();
        System.out.println("Piramide Descendiente");
        for (int fila=1; fila<=n; fila++){
            for (int columna=fila; columna<=n; columna++){
                System.out.print("*");
            }
            System.out.println(); // → Salto de línea al final de cada fila.
        }

        System.out.println();
        System.out.println("Piramide Ascendiente");
        for (int fila=n; fila>=1; fila--){
            for (int columna=fila; columna<=n; columna++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close(); // → Finalizamos la espera de datos.
    }
}
