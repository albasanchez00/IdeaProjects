package Actividades;

import java.util.Scanner;

/* Actividad 3. Implementa una función pasarMilimetros(),
* Recibira los datos en metro o centrimetro y lo convertirá a milimetros
 */
public class Actividad_Propuesta_9 {
    public static void main(String[] args) {
        convertirDato(tipoDato());
    }

    static String tipoDato(){
        String dato = "";
        Scanner sc=new Scanner(System.in);
        System.out.print("Indique el tipo de dato a convertir (Metros o Centimetros) → ");
        dato=sc.nextLine();
        return dato;
    }

    static double convertirDato(String dato){
        Scanner sc=new Scanner(System.in);
        double milimetros=0;
        System.out.println("Introduce la cantidad a convertir -> ");
        double valor=sc.nextDouble();
        switch(dato){
            case "Centimetros","centimetros"->{
                if(valor!=0){
                    milimetros=valor*10;
                    System.out.println("El valor de "+dato+" en Milimetros es: "+milimetros);
                }else {
                    System.out.println("El valor no puede ser cero o negativo");
                }
            }
            case "Metros","metros"->{
                if(valor!=0){
                    milimetros=valor*1000;;
                    System.out.println("El valor de "+dato+" en Milimetros es: "+milimetros);
                }else {
                    System.out.println("El valor no puede ser cero o negativo");
                }
            }
            default->{
                System.out.println("Indique el tipo de moneda correcto");
            }
        }
        return milimetros;
    }


}
