package Actividades;

/* Actividad 5. Indica el tiempo que falta para llegar a tu destino.
* Teniendo en cuenta lo siguiente:
 1. El tipo de vía transitada (autovía/carretraNacional),
 2. Los KM desde el origen hasta el destino.
*/

import java.util.Scanner;

public class Actividad_Propuesta_11 {
    public static void main(String[] args) {
        calcularDato(tipoVia());
    }

    static String tipoVia(){
        String via = "";
        Scanner sc=new Scanner(System.in);
        System.out.print("Indique el tipo de vía que transita (Autovía o Carretera nacional) → ");
        via=sc.nextLine();
        return via;
    }

    static double calcularDato(String via){
        Scanner sc=new Scanner(System.in);
        double tiempo=0;
        System.out.println("Introduzca los kilometros (origen-destino) -> ");
        double distancia =sc.nextDouble();
        System.out.print("Indique la velocidad a la que viaja → ");
        int velocidad =sc.nextInt();
        switch(via){
            case "autovia","Autovia"->{
                if(distancia !=0 && velocidad!=0){
                    tiempo= distancia / velocidad;
                    System.out.println("El tiempo por carretera nacional será: "+tiempo+" hora");
                }else {
                    System.out.println("El valor no puede ser cero o negativo");
                }
            }
            case "Carretera nacional","carretera nacional"->{
                if(distancia !=0 && velocidad!=0){
                    tiempo= distancia / velocidad;;
                    System.out.println("El tiempo por carretera nacional será: "+tiempo+" hora");
                }else {
                    System.out.println("El valor no puede ser cero o negativo");
                }
            }
            default->{
                System.out.println("Indique el tipo de vía correcto");
            }
        }
        return tiempo;
    }

}
