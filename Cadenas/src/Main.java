import java.util.Scanner;

/*
* Cadenas, son textos que su primer índice como en las tablas es 0... length
*
*
* Character .isLetter or .isDigit() -> Verifica alfanuméricos.
* Character.isLowerCase() → Verifica si es una letra además que está en minúscula.
* Character.isUpperCase() → Verifica si es una letra además que está en mayúscula.
* Character.isSpacerChar() → Verifica que el caracter es un espacio en blanco.
* Character.isWhiteSpace() → Verifica que el caracter sea un espacio en blanco, \n, \t, \r...
* Character.isLetter() → Verifica que el caracter sea una letra
* Character.isDigit() → Verifica que el caracter es un número.
*
* String.charAt(posición) → Nos devuelve un caracter de la cadena, que está en la posición indicada.
*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String miCadena="En un lugar de la Mancha, de la que no quiero acordarme";
        int longitudCadena=miCadena.length();
        System.out.println("La longitud del cadena es: "+longitudCadena);
        //Metodo para extraer una posición o caracter de una cadena chatAt(posición)
        char letra= miCadena.charAt(0);
        System.out.println("La letra es: "+letra);

        String palindromo="Amad a la dama";
        String comprobar="";
        for( int i=palindromo.length()-1; i>=0; i--) {
            comprobar += palindromo.charAt(i);
        }
        System.out.println(comprobar.toUpperCase());


        /* Toma 2 telefonos en String y comprueba que sean correctos.
         - Que comience el nº teléfono con 6, 7, 8 o 9.
         - Compruebe un nombre... no puede contener números.

        * NOTA. Más adelante veremos las expresiones regulares ExP.
        */
        String numero,nombre;

        System.out.print("Su nombre es → ");
        nombre=sc.nextLine();
        System.out.print("Su nº teléfono es → ");
        numero=sc.nextLine();

        boolean esValido=validarTexto(nombre); // Comprobamos el nombre insertado.
        System.out.println("\nEl nombre es → " + esValido);
        boolean esValido2=validarNumerico(numero); // Comprobamos el número insertado.
        System.out.println("El nº teléfono es → " + esValido2);
        boolean esValido3=validarTelefono(numero); // Comprobamos el número insertado.
        System.out.println("El número comienza por 6/7/8/9 y tiene 9 dígsitos → " + esValido3);

        System.out.println("\nIngrese su email: ");
        String email=sc.nextLine();
        boolean esValido4=validarEmail(email); // Comprobamos el número insertado.
        System.out.println("El email tiene el formato correcto (@ .) → " + esValido4);
    }

    /**
     * Función que valída que solo sean letras.
     * @param texto
     * @return resultado
     */
    static boolean validarTexto(String texto){
        boolean resultado=true;
        /* Según un método que es de tipo char... primitivo... Character... puede
          tener método en la API de Java. */
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (!Character.isLetter(letra) && !Character.isSpaceChar(letra)) { // → a-z
                resultado=false; // ha encontrado un número...
                break;
            }
        }
        return resultado; // Devolvemos el resultado de la validación.
    }


    /**
     * Función que valída que solo sean numéricos.
     * @param cadena
     * @return resultado
     */

    static boolean validarNumerico(String cadena){
        boolean resultado=true;
        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);
            if (!Character.isDigit(letra)) {
                resultado=false;
                break; // Se interrumpe la ejecución.
            }
        }
        return resultado; // Devuelve el resultado de la validación.
    }

    /**
     * Función que valída que el formato del teléfono introducido es correcto tiene 9 dígitos
       y comienza por [6/7/8/9].
     * @param cadena
     * @return
     */

    static boolean validarTelefono(String cadena){
        boolean resultado=true;
        char numero=cadena.charAt(0);
        if (numero!='6' && numero!='7' && numero!='8' && numero!='9' || cadena.length()!=9) {
            resultado=false;
        }
        return resultado;
        }

    /**
     * Validar un email → [@ u .]
     *
     */
    static boolean validarEmail (String texto){
        boolean resultado=true;
        int indiceArroba=-1;
        int indicePunto=-1;

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (letra=='@') {
                indiceArroba=i;
            }else if (letra!='.') {
                indicePunto=i;
            }
        }
        if (indiceArroba<indicePunto && indicePunto!=-1 && indiceArroba!=-1) {
            resultado=true;
        }else {
            resultado=false;
        }
        return resultado;
    }

}