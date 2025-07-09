import java.util.Scanner;

public class Circunferencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calcular Longitud y Área Circulo");
        System.out.println("Indique el radio de la circunferencia: ");
        double radio = sc.nextDouble();

        // Utilizamos la API de Java para ralizar los calculos o traer valores.
        double area = Math.PI * Math.pow(radio, 2); // Math.pow (base/exponente).
        double longitud = 2 * Math.PI * radio;

        // Mostramos por pantalla el calculo realizado.
        System.out.println("El área de la circunferencia es : " + area);
        System.out.println("La longitud de la circunferencia es : " + longitud);
        sc.close();
    }
}
