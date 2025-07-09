import javax.swing.*;
import java.util.Scanner;

/* Ejemplo Bucle 2. Solicita 10 números enteros por pantalla y calcula la media
    * Declarar las variables que sumará esos números.
    * Pista → Utilizar opera y asigna (+=).
    * Finalmente muestra la media de los números.
*/

public class EjemploFor_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = 0;
        String mensaje = "";

        for (int i=1;i<=10;i++) {
            System.out.print("Ingrese un numero entero → ");
            numero += sc.nextInt();
        }
        System.out.println("La media es: " + ((double)numero/10));
    }
}
