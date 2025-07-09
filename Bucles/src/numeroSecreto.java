import javax.swing.*;
import java.util.Scanner;

public class numeroSecreto {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String mensaje="";
        int numSecreto=(int)Math.floor(Math.random()*100+1);
        int numeroUser;

        String numero=JOptionPane.showInputDialog("Ingrese un número entre 1 y 100 →");
        try {
            numeroUser=Integer.parseInt(numero);
        }catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El número no es válido.");
            numeroUser=-1;
        }
        int intentos=0;
        while (numSecreto!=numeroUser && numeroUser!=-1){
            if (numSecreto>numeroUser){
                JOptionPane.showMessageDialog(null, "El número secreto es mayor al introducido");
            } else {
                JOptionPane.showMessageDialog(null, "El número secreto es menor al introducido");
            }

            intentos++;
            numero=JOptionPane.showInputDialog("Intentos ["+intentos+"] Ingrese otro número");
            try {
                numeroUser=Integer.parseInt(numero);
            }catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El número no es válido.");
                numeroUser=-1;
            }
        }

        if (numeroUser==numSecreto){
            JOptionPane.showMessageDialog(null,"Enhorabuena... Has ganado.");
        }else {
            JOptionPane.showMessageDialog(null, "Te has rendido... Has perdido.");
        }
    }
}