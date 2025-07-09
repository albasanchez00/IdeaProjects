import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Math → Solicitamos 2 números
        String num1T= JOptionPane.showInputDialog("Ingrese el 1º número → ");
        String num2T=JOptionPane.showInputDialog("Ingrese el 2º número → ");
        int num1=0, num2=0;
        String mensaje="";
        try {  //Intento pasar el dato de texto a numérico.
            num1=Integer.parseInt(num1T);
            num2=Integer.parseInt(num2T);
        }catch (Exception e) { // Si el usuario ingresa un dato no numérico, captura el error indicando un mensaje
            mensaje="Existe un error en el dato ingresado, ingrese solo números";
        }

        if (mensaje.equals("")) {
            String opcion=JOptionPane.showInputDialog("""
                    Indique una opcion: \
      
                    [1]→ Math.max()\
                    
                    [2]→ Math.min()\
                    
                    [3]→ Math.sqrt()\
                    
                    [4]→ Math.pow()\
                    
                    [5]→ Math.abs()\
                    
                    [6]→ Math.random()""");

            //Con Switch-Case → Realizamos la operación seleccionada
            switch (opcion) {
                case "1"-> mensaje="Math.max("+num1T+","+num2T+")= "+Math.max(num1,num2);
                case "2"-> mensaje="Math.min("+num1T+","+num2T+")= "+Math.min(num1,num2);
                case "3"-> mensaje="Math.sqrt("+num1+")= "+ Math.sqrt(num1)+"\nMath.sqrt("+num2+")= "+Math.sqrt(num2);
                case "4"-> mensaje="Math.pow("+num1+","+num2+")= "+Math.pow(num1,num2);
                case "5"-> mensaje="Math.abs("+num1+")= "+ Math.abs(num1)+"\nMath.abs("+num2+")= "+Math.abs(num2);
                case "6"-> mensaje="Math.random()= "+(int)(Math.random()*101); // → Mostramos un número aleatorio entre 0 y 100 (incluido el 100 (+1)
                default-> mensaje="La opción seleccionada no es válida";
            }
        }

        JOptionPane.showMessageDialog(null, mensaje);
        sc.close();
        }
}