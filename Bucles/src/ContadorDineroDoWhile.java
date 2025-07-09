import javax.swing.*;
import java.util.Scanner;

/* Solicita al usuario las siguientes cantidades de dinero
* Ejemplo -> Cantidad de dinero que tiene actualmente.
* Al final mostrará la suma total del dinero que dispone.
* Para salir el usuario puede incarlo con -1.
* Realiza las validaciones que veas necesarias.
*/

public class ContadorDineroDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dinero=0;
        double total=0;
        do {
            String bolsa= JOptionPane.showInputDialog("Ingrese la cantidad de su dinero actual → ");
            try {
                dinero=Double.parseDouble(bolsa);

                //Con esta condicion evitamos que al ser -1 le reste 1 al total.
                if (dinero!=-1) {
                    total+=dinero;
                }
            }catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "La cantidad ingresada no es válida.");
            }
        }while (dinero!=-1);
        JOptionPane.showMessageDialog(null, "La cantidad ingresada es: " + total+"€");
        sc.close();
    }
}
