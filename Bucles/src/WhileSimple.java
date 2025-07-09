import java.util.Scanner;

public class WhileSimple {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int i=1;
        while(i<=3) {
            System.out.println("El valor de i es = " + i+"\n");
            i++;
        }


        // Cuenta atras
        int cuentaAtras=10;
        while(cuentaAtras>=0) {
            System.out.println("El valor de i es = " + cuentaAtras);
            cuentaAtras--;
        }

    }
}
