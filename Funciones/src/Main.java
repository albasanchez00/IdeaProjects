import javax.swing.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        saludo();

        //Paso de parámetros → Se inlcuye un valor mediante una variable y se le pasa a la función en la invocaión
        otroSaludo("Alba Sánchez"); //Usando directamente el valor.
        String nombre = JOptionPane.showInputDialog("Indica tu nombre: ");
        otroSaludo(nombre); //Usando la variable.

        // Solicitamos la edad
        String edadText = JOptionPane.showInputDialog("Indica tu edad: ");
        byte edad= Byte.parseByte(edadText);
        // OJO → Los parámetro tiene que en el orden que indica la función.
        saludoConEdad(nombre, edad);
        edadProxima(edad);
    }


    // Declaramos la función saludo() ↓
    static void saludo(){ //saludo es el identificador o nombre de la función
        JOptionPane.showMessageDialog(null,"Hola, ¿qué tal?");
    }


    //Esta función va a recibir una valor tipo String, con el nombre.
    static void otroSaludo(String nombre){
        JOptionPane.showMessageDialog(null,"Hola, ¿qué tal " + nombre +"?");
    }


    // En esta función va a recibir dos parámetros, el nombre y la edad.
    static void saludoConEdad(String nombre, byte edad){
        JOptionPane.showMessageDialog(null,"Hola ¿que tal "+nombre+"?"+"\nTienes "+edad+" años de edad");
    }

    /* Crea una función que incremente en 1 la edad que ha insertado el usuario.
     * Indica que edad tendrá en su próximo cumpleaños.
    */
    static void edadProxima(byte edad){
        byte incrementoEdad = 0;
        incrementoEdad++;
        edad+=incrementoEdad;
        JOptionPane.showMessageDialog(null,"El siguiente año cumplirás "+edad+" años");
        // if  --  if-else  --  while  --  while-for   --  do-while..
    }
}