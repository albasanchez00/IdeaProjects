import java.util.Arrays;
import java.util.Scanner;

public class InsertarTabla_Ordenada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = {5,6,7,8,9,10,11,12,13,14,15};
        Arrays.sort(numeros);
        System.out.println("Indica un nuevo valor: ");
        int numeroInsertar = sc.nextInt();
        //Buscamos ese número insertado con binarysearch().
        int indice = Arrays.binarySearch(numeros, numeroInsertar);
        if (indice<0) { //No existe.... calcúla donde debe estar.
            indice = -Arrays.binarySearch(numeros,numeroInsertar)-1; //Genéro en positivo la posición donde va
        }
        System.out.println("Indice → "+indice);
        //Crea el Array con una
        int[] numeroT = new int[numeros.length+1]; //La tabla temporal se crea con la longitud de la tabla original +1
        System.out.println("Tabla Temporal creada → " + Arrays.toString(numeroT));
        System.arraycopy(numeros, 0, numeroT, 0, indice);
        System.out.println("Tabla Copiando el 1º tramo → " + Arrays.toString(numeroT));
        //Insertamos el nuevo número en el espacio creado.
        numeroT[indice] = numeroInsertar;
        System.out.println("Tabla Insertando el nuevo número → " + Arrays.toString(numeroT));
        //Copiamos los elementos desplazados tras el espacio copiado anterior.
        System.arraycopy(numeros, indice, numeroT,indice+1, numeros.length-indice);
        numeros = numeroT;
        System.out.println("Tabla Final con 2º tramo → " + Arrays.toString(numeros));
    }

}
