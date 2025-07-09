import javax.swing.*;
import java.util.Scanner;

/* Actividad. Diseña un programa que por cada número ingresado por el usuario:
* Indique si es → Par, positivo y su cuadrado.
* Para salir del programa el usuario debe ingresar 0.
*/

public class OtroWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mensaje="";
        String numT =JOptionPane.showInputDialog("Ingrese un número →");
        boolean par, positivo;
        double num = 0;
        try {
            num=Double.parseDouble(numT); //→ Pasamos el numero a double
        }catch (Exception e) {
            mensaje="Ingrese un número válido";
            JOptionPane.showMessageDialog(null, mensaje);
        }

        while (num!=0){
            par=num%2==0;
            positivo=num>=0;
            double cuadrado=Math.pow(num,2);

            //Mostramos el resulado
            mensaje="¿Es par? "+par+" ¿Es positivo? "+positivo+" Su cuadrado es → "+cuadrado;
            JOptionPane.showMessageDialog(null, mensaje);
            numT=JOptionPane.showInputDialog("Ingrese un número →");
            try {
                num=Double.parseDouble(numT); //→ Pasamos el numero a double
            }catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un número válido");
                JOptionPane.showMessageDialog(null, "Adios :)");
                num=0; //→ Obligo a que salga del bucle.
            }
        }
    }
}
