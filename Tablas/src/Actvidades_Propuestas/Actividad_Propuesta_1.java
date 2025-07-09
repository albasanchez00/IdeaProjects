package Actvidades_Propuestas;

/* Actividad 1. Crea una tabla de 10 posiciobes y almacena en cada posucion un numero alatorio del 1 al 100
* Luego suma todos los valores y muestra el resultado por pantalla
*
(int) Math.random()*101
* */

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Actividad_Propuesta_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int suma=0;
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 101);
            suma+=num[i];
        }
        JOptionPane.showMessageDialog(null, "Suma de los numeros: "+ Arrays.toString(num) +" es = " + suma);
    }
}
