import javax.swing.*;
import java.util.Scanner;

/* Actividad. Vamos a implementar una aplicación para calcular datos estadisticos de un centro educativo.
* Se introducirán datos hasta que uno de ellos sea negativo.
* Como resultado mostraremos:
    *  La suma de todas las edades.
    *  La media de todas las edades.
    *  El número de alumnos.
    *  Cuantos son mayorse de edad.
* Contadores:
    * Contador Edades → suma de las edades.
    * Contador Media → Calcula la media de todas las edades.
    * Contador Alumnos → Calcula el número total de alumnos.
    * Contador Mayores Edad → Calcula los alumnos que son mayores de edad.
* OJO → Los datos se mostrarán una vez se salga del bucle.
*/

public class CentroEducativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaramos contadores
        int edad=0,edades=0,alumnos=0, mayoresEdad=0;
        double media=0;

        //Solicitar la primera edad
        String edadT= JOptionPane.showInputDialog("Ingrese la edad del alumno → ");
        try {
            edad = Integer.parseInt(edadT);
        }catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese una edad valida");
            edad=-1;
        }

        while(edad>=0) {
            edades+=edad;
            alumnos++;
            if(edad>=18) {
                mayoresEdad++;
            }

            edadT= JOptionPane.showInputDialog("Ingrese la edad del alumno → ");
            try {
                edad = Integer.parseInt(edadT);
            }catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese una edad valida");
                edad=-1;
            }
        }

        media=edades/alumnos;
        JOptionPane.showMessageDialog(null, "La media es → "+media+" \nla suma de todas las edades es → "+edades+ " \nLos mayores de edad son → "+mayoresEdad+" \nEl número total de alumnos son → "+alumnos);
    }
}