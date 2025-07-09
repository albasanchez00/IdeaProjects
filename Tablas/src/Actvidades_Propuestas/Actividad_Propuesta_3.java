package Actvidades_Propuestas;
import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

/* Escribir una aplicación que solicite al usuario cuantos números quiere introducir
* A continuación introducir por teclado la cantidad de números
* Por último, mostrarlo en orden inverso
* Paso x paso →
   1. Solicitar cuantos números quiero introducir... int que se retorna
   2. Solicitar por teclado los números las veces que han dicho
   3. Mostrar el array de forma inversa →
      - Terminarás con el primero... if (int i=tabla.length;i>=0;i--)
    */

public class Actividad_Propuesta_3 {
    public static void main(String[] args) {
        mostrarNumeros(longitudTablas());
        ordenarTabla(longitudTablas());
    }


    /*
      1. Solicitar cuantos números quiero introducir... int que se retorna
      2. Solicitar por teclado los números las veces que han dicho
    */
    static int[] longitudTablas() {
        Scanner sc = new Scanner(System.in);
        int[] longitud;
        int cantidad=Integer.parseInt(JOptionPane.showInputDialog(null,"Indique la cantidad de números a introducir → "));
        longitud = new int[cantidad];
        for (int i = 0; i < longitud.length; i++) {
            longitud[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número → "));
        }
        return longitud;
    }


    /*
      3. Mostrar el array de forma inversa →
       - Terminarás con el primero... if (int i=tabla.length;i>=0;i--)
    */
    static void mostrarNumeros(int[] cantidadIndicada) {
        for(int i=cantidadIndicada.length-1;i>=0;i--){
            JOptionPane.showMessageDialog(null,cantidadIndicada[i]);
        }
    }


    static void ordenarTabla(int[] tabla) {
        //Array.sort(nombreTabla)
        Arrays.sort(tabla); //Modifica la tabla
        for (int n: tabla) {//bucle foreach en Java
            JOptionPane.showMessageDialog(null,n);
        }
        // System.out.println(Arrays.toString(tabla));
    }
}
