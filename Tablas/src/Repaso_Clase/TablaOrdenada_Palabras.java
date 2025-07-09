package Repaso_Clase;
import java.util.Arrays;
import java.util.Scanner;

public class TablaOrdenada_Palabras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] palabras = {"Maniquí","Pájaro","Sol","Aula","Estrella","Montaña","Baile","Juego","Disfraz",
                "Rojo","Colores","Fiesta","Música","Confeti","Máscara","Carroza","Carpa","Gafas","Peluca","Carnaval"};
        Arrays.sort(palabras);
        System.out.print("Introduce una palabra para insertar en la tabla → ");
        String nuevaPalabra = sc.nextLine();
        int indice = Arrays.binarySearch(palabras,nuevaPalabra);
        if(indice < 0){
            indice = -Arrays.binarySearch(palabras,nuevaPalabra)-1;
        }
        System.out.println("Indice → " + indice);
        //Crear el aaray con una
        String[] palabrasT = new String[palabras.length+1]; //se crea la tabla temporal
        System.out.println("\nTabla Temporal\n" + Arrays.toString(palabrasT));
        System.arraycopy(palabras,0,palabrasT,0,indice);
        System.out.println("Tabla Copian el 1º tramo\n" + Arrays.toString(palabrasT));
        //insertamos el nuevo valor en el hueco
        palabrasT[indice] = nuevaPalabra;
        System.out.println("Tabla Insertando el Nuevo tramo\n" + Arrays.toString(palabrasT));
        //copiamos los elementos
        System.arraycopy(palabras,indice,palabrasT,indice+1,palabras.length-indice);
        //Copiamos a la tabla original
        palabras=palabrasT;
        System.out.println("Tabla Final\n" + Arrays.toString(palabras));
    }
}
