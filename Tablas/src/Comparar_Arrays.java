import java.util.Arrays;
import java.util.Scanner;

/*  */

public class Comparar_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numero = new int[10];
        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int)(Math.random()*101);
        }

        int[] numero2 = new int[10];
        for (int i = 0; i < numero2.length; i++) {
            numero[i] = (int)(Math.random()*101);
        }
        boolean sonIguales = Arrays.equals(numero, numero2);
        System.out.print("¿Son iguales Numero y Numero 2?\n"+sonIguales);
        System.out.println();
        int comparador = Arrays.compare(numero, numero2); //devuelve 0 si son iguales y -1 si son diferentes
        System.out.print("\n¿Son iguales Numero y Numero 2?\n"+comparador);
    }
}
