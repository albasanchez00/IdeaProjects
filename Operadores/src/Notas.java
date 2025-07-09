import java.util.Scanner;

/* Solicita las notas (3) por pantalla y despues realizar la media */

public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nota 1 (decimales separados por coma) -> ");
        double nota1= sc.nextDouble();
        System.out.print("Nota 2 (decimales separados por coma) -> ");
        double nota2= sc.nextDouble();
        System.out.print("Nota 3 (decimales separados por coma) -> ");
        double nota3= sc.nextDouble();

        double media = (nota1+nota2+nota3)/3;
        System.out.println("La nota media es de -> "+media);


        /* Otra manera
            System.out.print("Nota 1 (decimales separados por coma) -> ");
            double notas= sc.nextDouble();
            System.out.print("Nota 2 (decimales separados por coma) -> ");
            notas += notas;
            System.out.print("Nota 3 (decimales separados por coma) -> ");
            notas += notas;
            notas /= 3;
            System.out.println("La nota media es de -> "+notas);
         */
    }
}
