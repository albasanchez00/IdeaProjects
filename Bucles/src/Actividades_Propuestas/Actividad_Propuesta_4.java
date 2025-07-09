package Actividades_Propuestas;

import javax.swing.*;
import java.time.LocalDate;
import java.util.Scanner;

/* Actividad Propuesta 4. Crear un menú que se repita hasta que el usuario elija la opción salir.
* Tendrá 3 opciones →
    1. Hola que tal (saludo)
    2. Fecha Actual
    3. Salir
*/

public class Actividad_Propuesta_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // El tipo fecha puede ser localDate o LocalDateTime
        LocalDate fecha=LocalDate.now();
        String saludo="Hola, ¿que tal?";
        String opcion = "";
        int op=0;

        do {
            opcion=JOptionPane.showInputDialog("""
                    Indique una opcion: \
      
                    [1]→ Saludo\
                    
                    [2]→ Fecha\
                    
                    [3]→ Salir""");

            try {
                op=Integer.parseInt(opcion); //Convertimos el valor de String a Numérico
            }catch (Exception e) {
                JOptionPane.showMessageDialog(null,"La opción indicada es invalida.");
            }

            switch (op) {
                case 1->{JOptionPane.showMessageDialog(null,saludo);}
                case 2->{ JOptionPane.showMessageDialog(null,fecha);}
                case 3->{JOptionPane.showMessageDialog(null,"Adios");}
                default -> {JOptionPane.showMessageDialog(null,"Opción incorrecta");}
            }
        }while (op!=3);
    }
}
