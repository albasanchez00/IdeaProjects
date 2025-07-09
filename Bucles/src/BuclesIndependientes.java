import java.util.Scanner;

public class BuclesIndependientes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* La anidación de bucles es muy frecuente y se trata de tener un bucle dentro de otro */
        for (int i=1; i<5; i++){
            for (int j=1; j<8; j++) { //Bucle anidado denrto de otro bucle.
                System.out.println("El valor de i es "+i+" y el valor de j es "+j);
            }
        }
        sc.close();
    }
}



