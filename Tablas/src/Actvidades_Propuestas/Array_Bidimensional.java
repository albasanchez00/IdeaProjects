package Actvidades_Propuestas;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Bidimensional {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] miArray = new int[5][4];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                miArray[i][j]=(int)(Math.random()*100);
                System.out.print(miArray[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
