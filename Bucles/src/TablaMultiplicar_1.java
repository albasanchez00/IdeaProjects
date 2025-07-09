import java.util.Scanner;

/*Ejercicio. Pedir un número  por consola comprendido entre el 1 y el 10
    * Debermos mostrar la tabla de multiplicar del número ingresado.
    * Asegurando que el número solicitado esté comprendido en el rango.
    * En el caso de que no lo esté, solicitamos de nuevo el número.
*/

public class TablaMultiplicar_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero=0;
        do{// Asegurarse que el numero esta comprendido entre 1 y 10
            System.out.print("Ingrese el número de la tabla de multiplicar → ");
            numero = sc.nextInt();

        }while(!(numero>0&&numero<10)); // (numero<10 && nuemro>10)

        System.out.println("\n** TABLA DE MULTIPLICAR DEL " + numero +" **");
        for (byte i=1;i<=10;i++){
            System.out.println(numero + " x " + i + " = " + (numero*i));
        }

        /* Salidas anticipadas bucles (for, do-while y while)→
            1. Interrumpe el bucle → Break
            2. Salta la iteracion actual, y continua con el bucle → Continue
        */
        System.out.println("\n** SALIDA ANTICIPADA 'BREAK' **");
        for (int i=1;i<=10;i++){
            if (i==6){//Muestra hasta el número indicado
                break; //salir - interrumpir
            }else {
                System.out.println(numero + " x " + i + " = " + (numero*i));
            }
        }

        System.out.println("\n** SALIDA ANTICIPADA 'CONTINUE' **");
        for (int i=1;i<=10;i++){
            if (i==6){//Salta el número indicado
                continue; //saltar
            }else {
                System.out.println(numero + " x " + i + " = " + (numero*i));
            }
        }



        sc.close();
    }
}
