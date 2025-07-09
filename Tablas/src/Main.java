import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad[]=new int[5];
        edad[0]=18;
        edad[1]=19;
        edad[2]=20;
        edad[3]=21;
        edad[4]=22;

        // Ya tengo la tabla completa
        // Fuera de Índice → La tabla solo tiene 5 posiciones no podemos insertar una 6º posición
        // edad[5]=23; // → ¡Fuera de Rango!

        for (int i = 0; i < edad.length; i++) { // nombreTabla.lengt → Me deuele el tamaño de la tabla
            System.out.println(edad[i]);
        }
        System.out.println("Longitud de la Tabla Edad: " + edad.length);
        System.out.println();

        //Delarar la ariable de array darle los alores diretamente
//



        System.out.println("Tabla Edades Insertadas → ");
        System.out.println(Arrays.toString(edad));
        System.out.println();

        //Inicialización de un Array
        int [] numeros= new int [10]; // → Se reserva el espacio de memoria para ese Array.
        System.out.println("Tabla Vacia → ");
        System.out.println(Arrays.toString(numeros)); //Muestra todos los elementos del Array (Tabla)
        System.out.println();

        String apellidos[]=new String[8];
//        apellidos[3]="Díaz";
        System.out.println(Arrays.toString(apellidos));
        System.out.println();

        boolean decision[]=new boolean[6];
//        decision[5]=true;
        System.out.println(Arrays.toString(decision));
        System.out.println();
        System.out.println();


        // Lee desde consola, los 10 números del Array numeros[]
        for (int i = 0; i < numeros.length; i++) {
            String numT = JOptionPane.showInputDialog("Ingrese un numero → ");
            numeros[i] = Integer.parseInt(numT); // → Sustituyo por la lectura
        }
        System.out.println(Arrays.toString(numeros)); //Muestra todos los elementos del Array (Tabla)
        System.out.println();

        // Lee desde consola, los 8 apellidos del Array apellidos[]
        for (int i = 0; i < apellidos.length; i++) {
            String apellidoT = JOptionPane.showInputDialog("Ingrese un apellido → ");
            apellidos[i] = apellidoT;
        }
        System.out.println(Arrays.toString(apellidos));
        System.out.println();

        // Lee desde consola, los 8 booleanos del Array boolean[]
        for (int i = 0; i < decision.length; i++) {
            String decisionT = JOptionPane.showInputDialog("Ingrese true o false → ");
            decision[i] = Boolean.parseBoolean(decisionT);
        }
        System.out.println(Arrays.toString(decision));
        System.out.println();
    }
}