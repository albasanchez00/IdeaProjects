import javax.swing.*;
import java.util.Scanner;

/* Desarrolla un juego que ayude a mejorar el cálculo mental de la suma.
    * El jugador tendrá que introducir la solución de la suma de dos números aleatorios, comprendidos entre 1 y 100.
    * Mientras la respuesta sea correcta el juego continuara e irá contando el número de respuestas correctas que lleva el jugador.
    * Al escribir una erronea, se saldrá del juego y mostrara el numero de aciertos que ha tenido.

* PISTAS....
        * Número aleatorios num1=(int)(Math.random()*101)
        * Si la suma num1+num2==respuestaUsuarios
           Incrementamos el contador++;
        * El bucle do{} se repetirá mientras num1+num2==respuestaUsuarios
*/


public class CalculoMental {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int respuesta=0, respuestaCorrecta=0;
       int num1, num2, opRandom, aciertos=0;
       String mensaje="";
        do {
            num1=(int)(Math.random()*101);
            num2=(int)(Math.random()*101);
            opRandom=(int)(Math.random()*2);
            System.out.println(opRandom);
            switch (opRandom){
                case 0: {
                    mensaje="Indique la suma de "+num1+" + "+num2+" = ";
                    respuestaCorrecta=num1+num2;
                }
                case 1: {
                    mensaje="Indique la resta de "+num1+" - "+num2+" = ";
                    respuestaCorrecta=num1-num2;
                }
                case 2: {
                    mensaje="Indique la multiplicación de "+num1+" * "+num2+" = ";
                    respuestaCorrecta=num1*num2;
                }
            }

            String pregunta=JOptionPane.showInputDialog(mensaje);
            try {
                respuesta=Integer.parseInt(pregunta);
            }catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El valor no es válido");
            }
            aciertos++;
        }while (respuestaCorrecta==respuesta);
        JOptionPane.showMessageDialog(null, "Has acertado "+(aciertos-1));
    }
}
