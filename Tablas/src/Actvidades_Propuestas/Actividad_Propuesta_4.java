package Actvidades_Propuestas;
import javax.swing.*;
import java.util.Arrays;

/* Acividad 4. Define una función que tome como parametros dos tablas
* La primera con 6 números de la apuesta primitiva
* La segunda (ordenada) con lo 6 números de la combinación ganadora
* Devolverá el número de aciertos.
* Primitica: numeros del 0 la 49
*/

public class Actividad_Propuesta_4 {
    public static void main(String[] args) {
        int[] tablaApuesta=apuesta();
        int[] combiGanadora = combiGanadora();
        System.out.println(Arrays.toString(combiGanadora));
        JOptionPane.showMessageDialog(null,"Tu apuesta es -> "+ Arrays.toString(tablaApuesta));
        JOptionPane.showMessageDialog(null,"La combinación ganadora es "+Arrays.toString(combiGanadora)+"\nHas acertado "+ aciertos(combiGanadora,tablaApuesta)+" números");
    }

    static int[] combiGanadora() {
        int[] numeros = new int[6];
        for (int i = 0; i < numeros.length; i++) {
            int numTemporal;
            boolean esDuplicado;
            do {
                esDuplicado = false;
                numTemporal = (int) (Math.random() * 49) + 1; // Generamos números del 1 al 49
                // Verificamos si ya existe en las posiciones llenas
                for (int j = 0; j < i; j++) {
                    if (numeros[j] == numTemporal) {
                        esDuplicado = true;
                        break;
                    }
                }
            } while (esDuplicado);
            numeros[i] = numTemporal;
        }
        // Ordenamos el array
        Arrays.sort(numeros);
        return numeros;
    }

    static int[] apuesta(){
        int[] numero = new int[6];
        int i=0;
        do{
            numero[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de su apuesta → "));
            if (numero[i]>0 && numero[i]<50) {
                i++;
            }else {
                JOptionPane.showMessageDialog(null, "El numero debe estar entre 0 y 49");
            }
        }while(i!=6);
        return numero;
    }

    static int aciertos(int[] combiGanadora, int[] tablaApuesta) {
        int aciertos = 0;
        //doble recorrido de Array
        for(int apostado:tablaApuesta){
            if(Arrays.binarySearch(combiGanadora,apostado)>=0){
                aciertos++;
            }
        }
        return aciertos;
    }
}
