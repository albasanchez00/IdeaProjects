import java.util.Arrays;
import java.util.Scanner;


public class Ordenar_Tablas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] palabras= {"Maniquí","Pájaro","Sol","Aula","Estrella","Montaña","Baile","Juego","Disfraz",
                "Rojo","Colores","Fiesta","Música","Confeti","Máscara","Carroza","Carpa","Gafas","Peluca","Carnaval"};
        int[] numero = {34,1,56,2,44,76,21,35,90,200,54,22,15,14};
        System.out.println("Tabla de Texto Ordenada →");
        ordenarTexto(palabras);
        System.out.println("\nTabla de Números Ordenada →");
        ordenarNumero(numero);
    }

    /* Ordenar una tabla de Texto → */
    static void ordenarTexto(String[] texto){
        System.out.println(Arrays.toString(texto));
        Arrays.sort(texto);
        System.out.println(Arrays.toString(texto));
    }

    /* Ordenar una tabla de Números → */
    static void ordenarNumero(int[] numero){
        System.out.println(Arrays.toString(numero));
        Arrays.sort(numero);
        System.out.println(Arrays.toString(numero));
    }
}
