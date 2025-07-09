package Actividades;

/* Actividad. Crea una calculadora + - *
 donde la funcion operacion reciba los numeros y la operacion a realizar
 Crea otra función para el menú...
*  */

import java.util.Scanner;

public class Avtividad_Propuesta_6 {
    public static void main(String[] args) {
        mostrarMenu(operaciones(simpboloOperacion(), valorDatoA(), valorDatoB()));
    }


    static int mostrarMenu(double operaciones){
        Scanner sc=new Scanner(System.in);
        System.out.print("[1].Sumar\n[2].Restar\n[3].Multiplicar\n[4].Dividir");
        simpboloOperacion();
        return sc.nextInt();
    }

    static double valorDatoA(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el valor para a → ");
        double a=sc.nextDouble();
        return a;
    }
    static double valorDatoB(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el valor para a → ");
        double b=sc.nextDouble();
        return b;
    }

    static int simpboloOperacion(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Indique una operación → ");
        int operacion=sc.nextInt();
        return operacion;
    }


    static double operaciones(int operacion, double a, double b){
        double resultado=0;
        switch(operacion){
            case 1->{
                resultado=a+b;
                System.out.println("La suma de "+a+"+"+b+" = "+resultado);
            }
            case 2->{
                resultado=a-b;
                System.out.println("La resta de "+a+" - "+b+" = "+resultado);
            }
            case 3->{
                resultado=a*b;
                System.out.println("La multiplicación de "+a+" * "+b+" = "+resultado);
            }
            case 4->{
                resultado=a/b;
                System.out.println("La división de "+a+" / "+b+" = "+resultado);
            }
        }
        return resultado;
    }

    static double mostrarResultado(double resultado){
        System.out.println("La el resultado = "+resultado);
        return resultado;
    }

}
