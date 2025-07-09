import java.util.Scanner;

public class ParoImpar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Indique un número entero -> ");
        int num=sc.nextInt();
        String salida=num%2==0?"El número es par":"El número es impar";
        System.out.println(salida);
    }
}
