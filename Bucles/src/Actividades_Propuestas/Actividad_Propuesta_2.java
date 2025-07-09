package Actividades_Propuestas;

import javax.swing.*;
import java.util.Scanner;

/* Actividad Propuesta 2 . Solicitar la edad a 10 personas.
* Cuenta cuáles son mayores de 18 años y cuáles menores de 18 años.
* Al final mostrar los mayores y menores
*/


public class Actividad_Propuesta_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int personas = 0, edad = 0 , menoresEdad = 0 , mayoresEdad = 0;
        String mensaje = "";
        String edeadT = "";

        do {
            personas++;
            String edadT= JOptionPane.showInputDialog("Ingrese la edad del alumno → ");
            try {
                edad = Integer.parseInt(edadT);
            }catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese una edad valida");
            }

            if (edad<18) {
                menoresEdad++;
            }else{
                mayoresEdad++;
            }
        } while (personas <= 10);
        JOptionPane.showMessageDialog(null, "Alumnos mayores de edad: " + (mayoresEdad-1) + " \nAlumnos menores de edad: " + (menoresEdad-1));
    }
}
