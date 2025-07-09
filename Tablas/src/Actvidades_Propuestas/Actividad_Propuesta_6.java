package Actvidades_Propuestas;

import java.util.Arrays;
import java.util.Scanner;

/* Actividad.6 Eliminar daots dentro de una Tabla No Ordenada
* Crea una tabla con valores aleatorios entre 0 y 100
* Luego solicita un número al usuario y
* Eliminamos el elemento indicado por el usuario
*/
public class Actividad_Propuesta_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1. Crear una tabla con 10 elementos aleatorio del 0 al 100
        int[] numeros = new int[10];
        int ultimaPos=numeros[numeros.length-1]; //Último elemento del Array.
        int indiceT=-1;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random()*101);
        }
        System.out.println(Arrays.toString(numeros));
        //2. Solicita al usuario un número
        System.out.println("Indica un numero del 0 al 100 → ");
        int menorQ=sc.nextInt();

        //3. Eliminamos y devolvemos la tabla modificada
        eliminarMenores(numeros, menorQ);
    }

    static void eliminarMenores(int[] numeros, int menorQ){
        int[] nueva=new int[numeros.length]; //Donde voy a copiar los elementos menores que
        nueva=Arrays.copyOf(numeros,numeros.length);
        int i=0;
        while (i<nueva.length){
            if(nueva[i]<menorQ){ //Verificamos que el valor del índice i sea menor que el valor indicado por el usuario.
                //Si es menor, hay que eliminar el valor dentro de la tabla.
                nueva[i]=nueva[nueva.length-1]; //Copiamos el último en la nueva Tabla.
                //Decrementamos la longitud de la nueva Tabla en -1. Eliminando el último
                nueva=Arrays.copyOf(nueva,nueva.length-1);
                //Se tiene que volver a verificar la tabla nueva[i]
            }else {
                i++; //nueva[i] se queda en la tabla
            }
        }
        System.out.println("Tabla Modificada \n"+Arrays.toString(nueva));
    }
}
