import java.util.Scanner;

public class Relacionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Los operadores relacionales dan como resultado  vredadero o falso (true o false)
        int a=5,b=10,c=25;
        //Operador ==  -> Igual que
        boolean igual = a==b; //Devolverá false
        System.out.println("Igual es: "+igual);

        //Operador ==  -> Distinto que
        boolean distinto= a!=b; //Devolverá true
        System.out.println("Distinto es: "+distinto);

        //Operador <=  -> Menor o igual que
        boolean menor= a<b; //Devolverá true
        boolean menorIgual= a<=b; //Devolverá true
        System.out.println("Menor es: "+menor);
        System.out.println("Menor o igual es: "+menorIgual);

        //Operador =>  -> Mayor o igual que
        boolean mayor= a>b; //Devolverá false
        boolean mayorIgual= a>=b; //Devolverá false
        System.out.println("Mayor es: "+mayor);
        System.out.println("Mayor o igual es: "+mayorIgual);


        // Ejemplo. Solicitar la edad e indicar si es mayor que 18, indicar true o false
        System.out.print("Introduce tu edad actual -> ");
        byte edad=sc.nextByte();
        byte mayoriaEdad=18; // -> Opcional
        boolean esMayor= edad>=mayoriaEdad; // Si es mayor o igual(>=) que 18 devolverá TRUE, sino FALSE
        System.out.println("¿Es mayor de edad? -> "+esMayor);



        /* Operadore aritmeticos y logicos */
        System.out.println("Escribe un numero: ");
        int numero=sc.nextInt();
        boolean pares= (numero%2)==0; //Si el numero es par devolverá TRUE
        System.out.println("¿Es par? "+pares);




    }

}
