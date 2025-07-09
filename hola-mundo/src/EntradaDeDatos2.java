import java.util.Scanner;

public class EntradaDeDatos2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.next();
        System.out.print("Ingrese su edad actual: ");
        byte edad = sc.nextByte();
        System.out.print("Indique su sexo [M] o [F] -> ");
        String sexo = sc.next();
        System.out.println("Tu nombre es " + nombre + ", tienes " + edad + " y tu género es " + sexo);
        sc.close();
    }
}
