import java.util.Scanner;

/* Sintaxis Bucle For
* for (int i=0; i<=10; i++){
    Bloque de instruccioes
}
*/

public class BucleFor  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Ejemplo 1. Mostramos 10 veces la palabra "ECO" */
        for (int i=1;i<=10;i++) {
            //Pueden ser muchas líneas de código
            System.out.println("ECO");
        }

        /* Ejemplo 2. Muestra todos los años de manera decreciente.
        * La fecha sera desde 2025 hasta los 2000 */
        for (int i=2025;i>=2000;i--) {
            System.out.println("Año → "+i);
        }
    }
}
