import javax.swing.*;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op=0; //Inicializamos opcion en cada iteración
        String mensaje="";
        String opcion;
        do{
            opcion=JOptionPane.showInputDialog("""
                    Indique una opcion: \
      
                    [1]→ Sumar (a+b)\
                    
                    [2]→ Restar (a-b)\
                    
                    [3]→ Multiplicar (a*b)\
                    
                    [4]→ Dividir (a/b)\
                    
                    [5]→ Módulo (a%b)\
                    
                    [6]→ Exponente (a,b)\
                    
                    [7]→ Salir""");

            try {
                op=Integer.parseInt(opcion); //Convertimos el valor de String a Numérico
            }catch (Exception e) {
                JOptionPane.showMessageDialog(null, "La opción seleccionada no existe"); //Validamos si s numérico
            }

            if (op>=1 && op<=6) { //Solo entrará a pedir los números si las opciones son correctas.
                int a=0, b=0;
                String num1T= JOptionPane.showInputDialog("Indique el 1º número → ");
                String num2T=JOptionPane.showInputDialog("Indique el 2º número → ");

                try {  //Intento pasar el dato de texto a numérico.
                    a = Integer.parseInt(num1T);
                    b = Integer.parseInt(num2T);
                }catch (Exception e) { // Si el usuario ingresa un dato no numérico, captura el error indicando un mensaje
                    mensaje="Existe un error en el dato ingresado, ingrese solo números";
                }

                //Tendremos que validar que a y b no sean iguales a 0
                if (a!=0 && b!=0) {
                    switch (op) {
                        case 1->mensaje="La suma de "+a+" + "+b+" = "+(a+b);
                        case 2->mensaje="La resta de "+a+" - "+b+" = "+(a-b);
                        case 3->mensaje="La multiplicación de "+a+" * "+b+" = "+(a*b);
                        case 4->mensaje="La división de "+a+" / "+b+" = "+(a/b);
                        case 5->mensaje="El módulo de "+a+" % "+b+" = "+(a%b);
                        case 6->mensaje="El exponente de "+a+" y "+b+" = "+Math.pow(a,b);
                        default->mensaje=("Ha ocurrido un error");
                    }
                }
                JOptionPane.showMessageDialog(null, mensaje);
            }
        }while(!opcion.equals("7")); //Repite la interacción mientras "opción" sea distinto a "7"
    }
}
