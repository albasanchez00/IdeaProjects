import java.util.Arrays;
import java.util.Scanner;

/* Para una tabla ordenada veremos
* Arrays.copyOf(nombreTabla, nombreTabla.length+1)
*/

public class InsertarTabla_No_Ordenada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = {5,6,7,8,9,10,11,12,13,14,15};
        System.out.println("Introduce un nuevo valor en la tabla: ");
        int numero = sc.nextInt(); //Lee un número
        //Copia la tabla agregando una posición más al final.
        numeros= Arrays.copyOf(numeros, numeros.length+1);
        //En último indice se agrega el número leído
        numeros[numeros.length-1] = numero;
        System.out.println(Arrays.toString(numeros));

        //Inserta el número 10 en la primera posición del Array y 45 en la última posición del Array
        System.out.println("\nInsertar [0]→10 [11]→45");
        numeros[0] = 10;
        numeros[numeros.length-1] = 45;
        System.out.println(Arrays.toString(numeros));
    }
}
