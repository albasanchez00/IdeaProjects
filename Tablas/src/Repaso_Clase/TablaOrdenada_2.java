package Repaso_Clase;

import java.util.Arrays;
import java.util.Scanner;

public class TablaOrdenada_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = {1,2,3,4,6,7,8,9};
        Arrays.sort(numeros);
        System.out.print("Inserte un nuevo valor en la tabla → ");
        int numInsertado = sc.nextInt();
        int indice=Arrays.binarySearch(numeros, numInsertado);
        if (indice<0) {
            indice = -Arrays.binarySearch(numeros,numInsertado)-1;
        }
        System.out.println("Indice donde se insertará en la tabla → "+indice);
        int[] numeroT = new int[numeros.length+1];
        System.out.println("\nTabla Temporal creada → \n" + Arrays.toString(numeroT));
        System.arraycopy(numeros,0,numeroT,0,indice);
        System.out.println("Nueva Tabla \n"+Arrays.toString(numeroT));
        numeroT[indice]=numInsertado;
        System.arraycopy(numeros,indice,numeroT,indice+1,numeros.length-indice);
        numeros = numeroT;
        System.out.println("Tabla Final → \n" + Arrays.toString(numeros));
    }
}