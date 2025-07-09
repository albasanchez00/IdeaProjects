import javax.swing.*;
import java.util.Scanner;


/* Solicita al usuario las siguientes cantidades de dinero
* Ejemplo -> Cantidad de dinero que tiene en el banco, hucha, bolsillos y cajón.
* Al final mostrará la suma total del dinero que dispone.
* Para salir el usuario puede incarlo con -1.
*/

public class ContadorDinero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dinero=0,banco=0, hucha=0, bolsillos=0, cajon=0;
        String bancoT= JOptionPane.showInputDialog("Ingrese el dinero actual en su banco → ");
        String huchaT= JOptionPane.showInputDialog("Ingrese el dinero actual en su hucha → ");
        String bolsilloT= JOptionPane.showInputDialog("Ingrese el dinero actual en sus bolsillos → ");
        String cajonT= JOptionPane.showInputDialog("Ingrese el dinero actual en su cajón → ");
        try {
            banco=Double.parseDouble(bancoT);
            hucha=Double.parseDouble(huchaT);
            bolsillos=Double.parseDouble(bolsilloT);
            cajon=Double.parseDouble(cajonT);
        }catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "La cantidad ingresada no es válida.");
            banco=-1;
        }

        while (banco!=-1 && hucha!=-1 && bolsillos!=-1 && cajon!=-1) {
            dinero=banco+hucha+bolsillos+cajon;
            bancoT= JOptionPane.showInputDialog("Ingrese el dinero actual en su banco → ");
            huchaT= JOptionPane.showInputDialog("Ingrese el dinero actual en su hucha → ");
            bolsilloT= JOptionPane.showInputDialog("Ingrese el dinero actual en sus bolsillos → ");
            cajonT= JOptionPane.showInputDialog("Ingrese el dinero actual en su cajón → ");
            try{
                banco=Double.parseDouble(bancoT);
                hucha=Double.parseDouble(huchaT);
                bolsillos=Double.parseDouble(bolsilloT);
                cajon=Double.parseDouble(cajonT);
            }catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "La cantidad ingresada no es válida.");
                banco=-1;
            }
        }
        JOptionPane.showMessageDialog(null, "La suma total es = "+dinero+"€");






    }
}
