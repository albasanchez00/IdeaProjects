package Actividades;

/*Actividad 2. Implementa una función convertirGradosCelsius()
* Recibira grados en ºF y los convierta a ºC
*/

import java.util.Scanner;

public class Actividad_Propuesta_8 {
    public static void main(String[] args) {
        convertirGrados(solicitarDato());
    }

    static double solicitarDato(){
        double farenheit =0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Indique los grados Farenheit que desea convertir a Celsius → ");
        farenheit=sc.nextDouble();
        return farenheit;
    }

    static double convertirGrados(double farenheit){
        Scanner sc=new Scanner(System.in);
        double gradosCelsius;
        gradosCelsius=(farenheit - 32) * 5/9;
        System.out.print("La conversion de ºF a ºC es: " + gradosCelsius);
        return gradosCelsius;
    }
}
