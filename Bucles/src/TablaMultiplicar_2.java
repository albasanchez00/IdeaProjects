import java.util.Scanner;

public class TablaMultiplicar_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero=0;
        for (byte i=1;i<=10;i++){
            System.out.println("\n** TABLA DEL " + i +" **");
            for (byte j=1;j<=10;j++){
                System.out.println(i + " x " + j + " = " + (i*j));
            }
        }
        sc.close();
    }
}
