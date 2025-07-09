import javax.swing.*;
import java.util.Scanner;

public class EdadMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Solicita al usuario la edad de dos personas e indica cual es mayor y cual menor */
        int edad1=0,edad2=0;
        String mensaje="";

        while(edad1!=-1 && edad2!=-1) {
            String edad1T= JOptionPane.showInputDialog("Ingrese la edad 1 → ");
            String edad2T= JOptionPane.showInputDialog("Ingrese la edad 2 → ");
            try {  //Intento pasar el dato de texto a numérico.
                edad1=Integer.parseInt(edad1T);
                edad2=Integer.parseInt(edad2T);

                if (edad1!=-1 && edad2!=-1) {
                    //Entra en este bloque aunque sea -1
                    int edadMayor=Math.max(edad1,edad2);
                    int edadMenor=Math.min(edad1,edad2);
                    mensaje="La edad Mayor es "+edadMayor+" y la edad Menor es "+edadMenor;
                }else {
                    mensaje="Adios";
                }
            }catch (NumberFormatException e) { // Si el usuario ingresa un dato no numérico, captura el error indicando un mensaje
                mensaje="Existe un error en la edad ingresada, ingrese solo números";
            }
            //Mostramos el mensaje.
            JOptionPane.showMessageDialog(null, mensaje);
        }



    }
}
