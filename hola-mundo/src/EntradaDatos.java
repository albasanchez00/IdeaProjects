import java.util.Scanner;

public class EntradaDatos {
        // Entrada de datos.
    public static void main(String[] args) {
        //Tenemos que utilizar la clase Scanner ->
        Scanner sc = new Scanner(System.in);
        byte edad;
        System.out.println("Ingrese su edad actual: ");
        edad = sc.nextByte();
        System.out.println("Su edad en un año será: " + (edad + 1));

        /* Ejemplos de usos de la clase Scanner ->
            * Enteros (int) -> sc.nextInt();
            * Dobles (double) -> sc.nextDouble();
            * Byte (byte) -> sc.netxByte();
            * ....
            * Textos () -> sc.netxLine(); -> Cuando solicitamos solo texto.
            * String -> sc.next(); -> Cuando utilizamos textos y numeros, si existe algun espacio, interrupe el scanner y no lee el resto.
        */
        System.out.println("Introduce tu nombre: ");
        String nombre = sc.next(); // String -> Guarda una cadena de caracteres.
        System.out.println("Tu nombre es " + nombre + " y tienes actualmente " + edad + " años");

        /*Para hacer más fácil la salida de las variables dentro de un texto, utilizamos:
        %d: Imprime un número entero en notación decimal (base 10).
        %x: Imprime un número entero en notación hexadecimal (base hexadecimal).
        %o: Representar un número entero en su formato octal.
        %f: Imprime un número en punto flotante.
        %s: Imprime una cadena de texto (string).
        %c: Imprime un solo carácter.
        */
        System.out.printf("Tu nombre es %s y tienes actualmente %d años\n", nombre, edad);

        //Bloque de texto con varias líneas ->
        String textBlock1= """
                - Hola,
                esta es una cadena
                de varias lineas""";
        System.out.println(textBlock1);


    }
}
