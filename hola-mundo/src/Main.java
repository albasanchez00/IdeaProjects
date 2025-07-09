public class Main {
    public static void main(String[] args) {
        // Comentario de línea.

        /* -> abre
            Comentario para múltiples líneas
            ...
            ...
        cierra -> */

        //Para una salida en consola (mostrar en pantalla) -> Utilizamos System Out.
        //Para ostrar una linea (sin salto de línea) -> 'print'
        System.out.print("¡Hola mundo!");

        //Mostrar una linea (con salto de línea) -> 'println'
        System.out.println("¡Hola mundo!");
        System.out.println("Soy Alba Sánchez");

        //Se puede abreviar con códigos rápidos -> 'sout'.
        System.out.println("Se escribe rapidamente con sout");

        /*  Combinaciones de teclas para codificar ->
             - CONTROL + D -> Duplicar línea.
             - MAYUS ↑ + ALT -> Mover línea.
             - MAYUS ↑ + ALT + CLICK -> Seleccionamos varias líneas/elementos.
             - CONTROL + / -> Comenta una línea.
             - CONTROL + MAYUS ↑ + /-> Comentarios en bloque.
        */

        // Ejemplos de Comentarios
        /*  Ejemplo Duplicar y Comentar en bloque ->
                System.out.println("Ejemplo de duplicar lineas y comentario en bloque");
                System.out.println("Ejemplo de duplicar lineas y comentario en bloque");
                System.out.println("Ejemplo de duplicar lineas y comentario en bloque");
                System.out.println("Ejemplo de duplicar lineas y comentario en bloque");
                System.out.println("Ejemplo de duplicar lineas y comentario en bloque");
         */
        // Ejemplo Comentar en línea -> Hola mundo, como estamos.


        /* Cadena de caracteres */
            // Mostrar el valor de la variable -> sout("Texto" + variable);
            int variable = 2500;
            System.out.println("Texto de ejemplo " + variable);

            // para introducir una comilla doble dentro del texto -> \" TEXTO \"
            System.out.println("Texto de ejemplo: \"Bienvenido al curso de programacion\" ");
            // para introducir una comilla simple dentro del texto -> "Saludo 'Hola' "
            System.out.println("Texto de ejemplo: 'Bienvenido al curso de programacion' ");

            // Caracteres o Comando de escape ->
            System.out.println("Texto de ejemplo: \tBienvenido al curso de programacion ");

            /* Comando con caracteres de escape ->
            * \n -> Salto de línea.
            * \t -> Tabulador.
            * \f -> Salto de página.
            * \" -> Mostrar comillas dobles dentro del texto.
            * \\ -> Mostrar la barra invertida.
            *
            */


        /* Ejemplos de usos de la clase Scanner ->
         * Enteros (int) -> sc.nextInt();
         * Dobles (double) -> sc.nextDouble();
         * Byte (byte) -> sc.netxByte();
         * ....
         * Textos () -> sc.netxLine(); -> Cuando solicitamos solo texto.
         * String -> sc.next(); -> Cuando utilizamos textos y numeros, si existe algun espacio, interrupe el scanner y no lee el resto.
         */


        /*Para hacer más fácil la salida de las variables dentro de un texto, utilizamos:
        %d: Imprime un número entero en notación decimal (base 10).
        %x: Imprime un número entero en notación hexadecimal (base hexadecimal).
        %o: Representar un número entero en su formato octal.
        %f: Imprime un número en punto flotante.
        %s: Imprime una cadena de texto (string).
        %c: Imprime un solo carácter.
            - Ejemplo -> System.out.printf("Tu nombre es %s y tienes actualmente %d años\n", nombre, edad);
        */
    }
}