package Actvidades_Propuestas;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

/* Actividad 5. Estadistica_Ayuntamiento
El ayuntamiento de tu localidad te ha encargado una aplicación que ayude a realizar encuestas
estadísticas para conocer el nivel adquisitivo de los habitantes del municipio. Para ello, tendrás
que preguntar el sueldo a cada persona encuestada. A priori, no conoces el número de encuestados.
Para finalizar la entrada de datos, introduce un sueldo con valor −1. Una vez terminada la entrada
de datos, muestra la siguiente información: Todos los sueldos introducidos ordenados de forma
decreciente. El sueldo máximo y mínimo. La media de los sueldos.
*/

public class Actividad_Propuesta_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        double[] sueldos=new double[0];
        double sueldoHabitante=0;
        double aux=0;
        double round=Math.round((aux*100)/100);

        do{
            System.out.print("[-1] Exit\nIndique su salario (€) → ");
            sueldoHabitante=entrada.nextDouble();
            if(sueldoHabitante>0){
                sueldos= Arrays.copyOf(sueldos,sueldos.length+1);
                sueldos[sueldos.length-1]=sueldoHabitante;
            }
        }while (sueldoHabitante!=-1);
        //Comprobar como funciona la estadistica
        System.out.println("\nSueldos Sin Ordenar: " + Arrays.toString(sueldos));

        //Ordenamos la tabla
        Arrays.sort(sueldos);
        System.out.println("\nSueldos Ordenados: ");
        for(int i=sueldos.length-1; i>=0; i--){
            System.out.println(sueldos[i]+"€");
        }

        //Sueldo Máximo Ingresado en la Tabla
        System.out.println("\nSueldos Dentro de la Tabla → ");
        System.out.println("Sueldo Máximo Ingresado: " + df.format(sueldos[sueldos.length-1])+"€");
        //Sueldo Mínimo Ingresado en la Tabla
        System.out.println("Sueldo Mínimo Ingresado: " + df.format(sueldos[0])+"€");

        //Sumar todos lo sueldos
        for(double sueldo: sueldos){
            aux+=sueldo;
        }
        System.out.println("\nLa suma de todos los sueldos es = "+df.format(aux)+"€");

        //Media de los sueldos
        aux/=sueldos.length;
        System.out.println("La media (3d) de los sueldos es = " + String.format("%.3f",aux)+"€");
        System.out.println("La media (2d) de los sueldos es = " + df.format(round) +"€");
    }
}
