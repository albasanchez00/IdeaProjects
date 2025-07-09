package Repaso_Clase;
import javax.swing.*;
import java.util.Scanner;

/* Las Tablas comienzan con un índice = 0.
   * Según el tipo declarado, cuando se crea.
   * Se inicializa a 0 si es numérico, null si es String o chat y false si es booleano
   * Sintaxis con Ejemplo:
       tipo[] nombreId = new tipo[Longitud];
       String[] nombreAlumnos = new String[10];

   * Para conocer la longitud, utilizamos el metodo nombreTabla.length
*/

public class Repaso_Tablas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ejemplo: Solicitar 10 nombre e ingresarlo en la tabla.
        //mostrarNombres(solicitarNombres());
        /*
         * 1. Ir al metodo solicitarNombres() →
               * Al terminar devuelve un array que se envía al metodo → mostrarNombres().
         * 2. Mostrar los nombres.
         * Otra forma de realizar este ejercicio sería →

        */
        String[] arrayNombres=new String[10];
        arrayNombres=solicitarNombres();
        mostrarNombres(arrayNombres);
        //mostrarToString(arrayNombres); //Invocamos la funcion ToString pasando el resultado del Array creado.
        // Si necesitas utilizar el array más de una vez si es necesario almacenarlo en una variable... ocupando más memoria.
    }


    //Las funciones nos permiten crear código para ser reutilizado las veces que sea necesario.
    static String[] solicitarNombres() {
        String[] nombreSolicitado=new String[10];
        for (int i = 0; i < nombreSolicitado.length; i++) {
            nombreSolicitado[i]=JOptionPane.showInputDialog("Ingrese su nombre → " + (i+1));
        }
        return nombreSolicitado;
    }


    static void mostrarNombres(String[] nombres) {
        for (int i = 0; i < nombres.length; i++) {
            JOptionPane.showMessageDialog(null, nombres[i]);
        }

        /* Otra forma de recorrer un Array → foreach... por cada
         * Loa bucles son iguales, ambos realizan la misma función
         * Sintaxis →
             for (tipo variable : tabla) {}
         */
        for (String item : nombres){
            JOptionPane.showMessageDialog(null, item);
        }
    }


    /* Existe ujna funcion que para el programador es comodo, porque muestra todos los elementos del array
        static void mostrarToString(String[] nombres) {
            JOptionPane.showMessageDialog(null, Arrays.toString(nombres));
        }
    */
}