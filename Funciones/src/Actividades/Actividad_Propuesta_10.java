package Actividades;

/* Actividad 4. Sabemos que las personas americanas se pesan en libras.
* Indica el peso en libras y pasalo a KG.
*/

import java.util.Scanner;

public class Actividad_Propuesta_10 {
    public static void main(String[] args) {
        convertirGrados(solicitarDato());
    }

    static double solicitarDato(){
        double libras =0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Indique su peso (Libras) → ");
        libras=sc.nextDouble();
        return libras;
    }

    static double convertirGrados(double libras){
        Scanner sc=new Scanner(System.in);
        double kiloGramos=0.453592;
        double lirbasKilos=0;
        lirbasKilos=libras*kiloGramos;;
        System.out.print("La conversion de Libras a Kilos es = " + lirbasKilos);
        return lirbasKilos;
    }
}
