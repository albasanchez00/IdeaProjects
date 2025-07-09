import java.util.Scanner;

public class ExplicacionBucles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=5,y=9,contador=0;
        boolean resultado=false;
        do { //Se ejecuta al menos una vez
            System.out.println("El valor de i es" +i);
            contador++;
            if (contador==10) {
                resultado=true;
            }
        }while (!resultado); //false
    }
}
