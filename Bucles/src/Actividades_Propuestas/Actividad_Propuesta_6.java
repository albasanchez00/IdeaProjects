package Actividades_Propuestas;

import javax.swing.*;
import java.util.Scanner;

public class Actividad_Propuesta_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int calificaciones=0, alumnos=0, suspensos=0, aprobados=0;
        String edadT="";

        do {
            alumnos++;
            edadT= JOptionPane.showInputDialog("Ingrese la nota del alumno → ");
            try {
                calificaciones = Integer.parseInt(edadT);
            }catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese una edad valida");
            }

            if (calificaciones<5) {
                suspensos++;
            }else{
                aprobados++;
            }
        }while (alumnos!=5);
        JOptionPane.showMessageDialog(null, "Alumnos Suspensos → "+suspensos+" \nAlumnos Aprovados → "+aprobados);
    }
}