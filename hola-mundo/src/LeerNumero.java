import java.util.Scanner;
/* Crea una clase llamada LeerNumero que solicite al usuario un número entero y luego se muestre en pantalla.
 Ejemplo -> "El número ingresado es: "*/

public class LeerNumero {
    // 1. Creamos el el metodo principal.
    public static void main(String[] args) {
        // 2. Declaramos el Scanner.
        Scanner sc = new Scanner(System.in);

        // 3. Solicitamos el numero al usuario.
        System.out.print("Ingrese un número -> ");

        // 4. Declaramos el entero y leemos el número.
        int numero=sc.nextInt();

        // 5. Mostramos el mensaje con el numero introducido.
        System.out.printf("El número introducido es -> %d", numero);

    }
}
