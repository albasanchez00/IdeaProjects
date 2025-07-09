import Repaso_Clase.TablaOrdenada_Palabras;

import javax.naming.Binding;
import java.util.Arrays;
import java.util.Scanner;

public class Eliminar_en_Tabla_Ordenada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros= {3,34,45,67,567,2388,9876};
        System.out.println("Tabla Sin Modificar→\n"+Arrays.toString(numeros));
        System.out.print("\nIngrese el numero a eliminar → ");
        int eliminar= sc.nextInt();
        int indice=Arrays.binarySearch(numeros,eliminar); //buscara el numero y devuelve el índice
        if (indice>=0){
            System.out.println("\nIndice encontrado → "+indice);
            System.arraycopy(numeros,indice+1,numeros,indice,numeros.length-indice-1);
            numeros=Arrays.copyOf(numeros,numeros.length-1);
            System.out.println("\nTabla con dato eliminado →\n"+Arrays.toString(numeros));
        }else {
            System.out.println("ERROR. El número indicado no existe");
        }

        String[] palabras= {"Maniquí","Pájaro","Sol","Aula","Estrella","Montaña","Baile","Juego","Disfraz",
                "Rojo","Colores","Fiesta","Música","Confeti","Máscara","Carroza","Carpa","Gafas","Peluca","Carnaval"};
        Arrays.sort(palabras);
        String pEliminar="Maniqui";
        System.out.println("Tabla Sin Modificar→\n"+Arrays.toString(palabras));
        indice=Arrays.binarySearch(palabras,pEliminar);
        if (indice>=0){
            System.out.println("\nIndice encontrado → "+indice);
            System.arraycopy(palabras,indice+1,palabras,indice,palabras.length-indice-1);
            palabras=Arrays.copyOf(palabras, palabras.length-1);
        }else {
            System.out.println("ERROR. La palabra indicada no existe");
        }
    }



}
