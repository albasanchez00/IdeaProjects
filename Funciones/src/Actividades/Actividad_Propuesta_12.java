package Actividades;
import java.util.Scanner;

/* Actividad 6. Indica los segundos y conviertelos en días, horas, minutos y segundos */


public class Actividad_Propuesta_12 {
    public static void main(String[] args) {
        conversionDato(tipoConversion());
    }

    static String tipoConversion(){
        String conversion = "";
        Scanner sc=new Scanner(System.in);
        System.out.print("Indique el tipo de conversion (dias/horas/minutos/segundos):  → ");
        conversion=sc.nextLine();
        return conversion;
    }

    static double conversionDato(String conversion){
        Scanner sc=new Scanner(System.in);
        double conversionDato=0;
        System.out.println("Introduzca los segundos a convertir -> ");
        double segundos =sc.nextDouble();
        switch(conversion){
            case "segundos","Segundos"->{
                if(segundos !=0){
                    System.out.println("El tiempo por carretera nacional será: "+segundos+" hora");
                }else {
                    System.out.println("El valor no puede ser cero o negativo");
                }
            }
            case "minutos","Minutos"->{
                if(segundos !=0){
                    conversionDato= segundos / 60;;
                    System.out.println("El tiempo por carretera nacional será: "+conversionDato+" hora");
                }else {
                    System.out.println("El valor no puede ser cero o negativo");
                }
            }
            case "horas","Horas"->{
                if(segundos!=0){
                    conversionDato= segundos / 3600;;
                    System.out.println("El tiempo por carretera nacional será: "+conversionDato+" hora");
                }else {
                    System.out.println("El valor no puede ser cero o negativo");
                }
            }
            case "dias","Dias"->{
                if(segundos !=0){
                    conversionDato= segundos / 86400;;
                    System.out.println("La conversion de segundos a"+conversion+" es = "+conversionDato+"días");
                }else {
                    System.out.println("El valor no puede ser cero o negativo");
                }
            }
            default->{
                System.out.println("Indique el tipo de vía correcto");
            }
        }
        return conversionDato;
    }
}
