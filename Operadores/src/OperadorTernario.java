import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Es un operador que evalua una condicion  y su comportamiento si es true o false.
        System.out.println("Ingrese su edad -> ");
        byte edad = sc.nextByte();
        //Evaluamos la condicion  y su comportamiento según si es true o false
        String mensaje = edad>=18 ?"Puedes pasar al PUB" : "Espera a cumplir 18";
        System.out.println(mensaje);
        sc.close();
    }
}
