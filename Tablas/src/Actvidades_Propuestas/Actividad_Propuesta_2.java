package Actvidades_Propuestas;
import javax.swing.*;
import java.util.Scanner;

/* Actividad 2. Creamos una tabla (20 palabras aleatorias) de palabras que me invente */

public class Actividad_Propuesta_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        juegoPalabras(palabrasCreadas());
    }


    static String[] palabrasCreadas(){
        String[] palabras= {"Maniquí","Pájaro","Sol","Aula","Estrella","Montaña","Baile","Juego","Disfraz",
                "Rojo","Colores","Fiesta","Música","Confeti","Máscara","Carroza","Carpa","Gafas","Peluca","Carnaval"};
        return palabras;
    }


    /* Vamos a crear un juego, en el cual el programa seleccionará una de las palabras aleatoriamente.
     * Despues te preguntara cual es tu palabra y tendrás 3 oportunidad.
     * Si fallas (3 intentos) se saldrá del juego.
    */
    static void juegoPalabras(String[] palabras){
        int indice = (int)(Math.random()*palabras.length);
        String palabra = palabras[indice];
        System.out.println(palabra);
        String respuesta = "";
        int contador = 0;

        //Preguntar 3 veces la palabra
        do{
            respuesta = JOptionPane.showInputDialog("Ingrese la palabra → ");
            contador++;
            if(respuesta.equals(palabra)){
                JOptionPane.showMessageDialog(null, "La palabra es correcta.");
                JOptionPane.showMessageDialog(null, "¡Has ganado!");
            } else if (contador == 1) {
                JOptionPane.showMessageDialog(null, "Has fallado...\nTe quedan 2 intentos");
            }else if(contador == 2){
                JOptionPane.showMessageDialog(null, "Has fallado...\nTe queda 1 intento");
            }else{
                JOptionPane.showMessageDialog(null, "Has perdido...");
            }
        }while (!respuesta.equals(palabra) && contador!=3);
    }
}
