package Actividades_Propuestas;
/* Actividad Propuesta 7. Dadas 6 notas, muestra lo siguiente:
    *Escribir la cantidad de alumnos aprobados, condicionados (nota igual a cuatro) y suspensos
*/

import javax.swing.*;
import java.util.Scanner;

public class Actividad_Propuesta_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int calificaciones=0, alumnos=0, suspensos=0, aprobados=0, condicionados=0;
        String calificacionesT="";

        do {
            alumnos++;
            calificacionesT= JOptionPane.showInputDialog("Ingrese la nota del alumno → ");
            try {
                calificaciones = Integer.parseInt(calificacionesT);
            }catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un dato valido");
            }

            if (calificaciones<4) {
                suspensos++;
            }else if (calificaciones==4) {
                condicionados++;
            }else{
                aprobados++;
            }
        }while (alumnos!=6);
        JOptionPane.showMessageDialog(null, "Alumnos Suspensos → "+suspensos+" \nAlumnos Condicionados → "+condicionados+" \nAlumnos Aprovados → "+aprobados);
    }
}
