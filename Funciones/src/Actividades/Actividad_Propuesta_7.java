package Actividades;
import java.util.Scanner;

/*
* /* Actividad 1. Implementa una funcion convertirMoneda().
* Recibirá una cantidad en dolares Canadienses o Americanos y la convierta a euros.
*/


public class Actividad_Propuesta_7 {
    public static void main(String[] args) {
        convertirMoneda(tipoMoneda());
    }

    static String tipoMoneda(){
        String moneda = "";
        Scanner sc=new Scanner(System.in);
        System.out.print("Indique el tipo de dolar (Americano o Canadiense) a convertir en euros (€) → ");
        moneda=sc.nextLine();
        return moneda;
    }

    static double convertirMoneda(String moneda){
        Scanner sc=new Scanner(System.in);
        double dolarCanadiendse=0.6654;
        double dolarAmericano=0.9540;
        double euros=0;
        System.out.println("Introduce la cantidad a convertir -> ");
        double valor=sc.nextDouble();
        switch(moneda){
            case "Canadiense"->{
                if(valor!=0){
                    euros=valor*dolarCanadiendse;
                    System.out.println("El valor de "+moneda+" es: "+euros);
                }else {
                    System.out.println("El valor no puede ser cero o negativo");
                }
            }
            case "Americano"->{
                if(valor!=0){
                    euros=valor*dolarAmericano;
                    System.out.println("El valor de "+moneda+" es: "+euros);
                }else {
                    System.out.println("El valor no puede ser cero o negativo");
                }
            }
            default->{
                System.out.println("Indique el tipo de moneda correcto");
            }
        }
        return euros;
    }
}
