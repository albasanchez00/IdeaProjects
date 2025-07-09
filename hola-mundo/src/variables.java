import java.lang.Math;
import java.util.Scanner;

public class variables {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         // Declaramos una variable de valor entero -> 'int'.
            int numero1=250;
            int numero2=500;
            int suma1=numero1+numero2;
            System.out.println("La suma valor entero es = " + suma1);


        // Declaramos una variable de valor decimal -> 'double'.
            double numero3=250.56;
            double numero4=500.14;
            double suma2=numero3+numero4;
            System.out.println("La suma valor decimal es = " + suma2);


        // Ejemplo para sumar un valor entero y otro decimal -> 'int' y 'double'.
            double suma3=suma1+suma2;
            System.out.println("La suma de ambos es = " + suma3);


        // Declaramos una variable entre -127 a 127 caracteres de longitud -> 'byte'.
            byte edad=30;
            System.out.println("El edad es: " + edad);


        // Declaramos una variable de tipo booleano -> 'bolean'
            boolean mujer=true;
            System.out.println("¿Es mujer?: " + mujer);

        // Declaramos una variable de tipo dato texto o caracter -> 'char'.
            char sexo='F';
            System.out.println("El sexo es: " + sexo);


        // Ejemplo con API Java
           // Calcular la raíz cuadrada de un número.
           double numero5=5.5;
           double numero6=Math.sqrt(numero5);

           System.out.println("La raíz cuadrada de "+numero5+" es: " + numero6);

           // Calcular el valor máximo entre dos números.
           int a=300;
           int b=600;
           int maximo;
           maximo=Math.max(a,b);
           System.out.println("El valor mayor entre los números " +a+ " y " +b+ " es: " + maximo);

           // Calcular el doble de un número.
           int numero7=6;
           double doble=Math.pow(numero7,2);
           System.out.println("El valor es igual a "+doble);

           //Podemos declarar varias variables al mismo tiempo y darles un valor.
            int c=2,d=8,e=5; // o int c,d,e;
            int suma4=c+d+e;
            System.out.println("La suma total es = " + suma4);


        // Variable de tipo Sting -> Guarda una cadena de caracteres.
         System.out.println("Introduce un texto: ");
         String texto=sc.next();
         System.out.println("El texto introducido es: " + texto);
     }

}
