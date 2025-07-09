import java.util.Scanner;

public class EjmploFor_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Ejemplo 1. Vamos a solicitar al usuario un número, u mostrara todos los números del 1 hasta
           el número ingresado.*/
        int num;
        System.out.print("Indique un número → ");
        num = sc.nextInt();
        for (int i=1;i<=num;i++) {
            System.out.printf("%d-",i);
        }


        /* Ejemplo 2. Escribe un programa que muestre todos los multiplos de 7, menores que 100 */
        int multiplo;
        System.out.println("\nIngrese un multiplo →");
        multiplo = sc.nextInt();
        System.out.printf("Multiplos de %d hasta 100 →\n",multiplo);
        for (int a=0;a<=100;a+=multiplo) {
            System.out.printf("%d-",a);
        }
        sc.close();
    }
}
