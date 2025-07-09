import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variables.... peuden cambiar el valor durante la ejecución del programa. Por ejemplo: int precioCarne = 10;
        // Constantes.... son identificadores que guardan valores que no se cambiaran durante la ejecución. Por ejemplo: final byte MAYOREDAD=18;
        final byte MAYOREDAD=18;
        final byte IVAGENERAL=21;
        //MAYOREDAD=16 -> Devuelve un error ya que al ser constante no puede modificar su declaracion.
        byte edad=25;
        edad=30;
        System.out.printf("Su edad es de: %d años", edad);


        /* Operadores Relacionales:
         * == -> Igual que
         * != -> Distinto que
         * < -> Menor que
         * > -> Mayor que
         */


        /* Podemos crear una ventana -> Aplicaciones de escritorio
        JFrame jf = new JFrame("Aviso");
        ventana.setSize(600,600);
        JOptionPane.showMessageDialog(null, "Su edad es: "+edad);
        */

        int longitud;
        longitud= (int) (2*Math.PI);

    }
}