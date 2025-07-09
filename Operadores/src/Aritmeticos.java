import java.util.Scanner;

public class Aritmeticos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Operador Aritmetico Suma -> + */
        // 1. Declaramos las variables con un valor.
        int numero1=5,numero2=10,numero3=15;
        // 2. Sumamos todos los valores.
        int suma=numero1+numero2+numero3;
        // 3. Mostramos el resultado por pantalla.
        System.out.printf("La suma es = %d\n",suma);

        /* Operador Aritmetico Resta -> - */
        int resta=numero3-numero2;
        System.out.printf("La resta es = %d\n",resta);

        /* Operador Aritmetico de Asignación -> = */
        resta=0;
        System.out.printf("La resta ahora vale -> %d\n",resta);

        /* Operador Aritmetico Multiplicación -> * */
        int multiplicar=numero1*numero2;
        System.out.printf("La multiplicación es = %d\n",multiplicar);

        /* Operador Aritmetico Dividisión -> / */
        // En este caso debemos poner (double) para formatear el tipo entero de esos valores ya declarados.
        double division= (double) numero3 /numero1;
        System.out.printf("La división es = %s\n",division);

        /* Operador Aritmetico Resto o Módulo -> % */
        double restoDivision = (double) numero1%numero3;
        System.out.printf("La resto es = %s\n",restoDivision);

        /* Operador Aritmetico de Incremento -> ++  */
        //Supuesto como prefijo
        ++numero1;
        System.out.printf("Ahora numero1 es = %d\n",numero1);

        /* Operador Aritmetico de Decremento -> --  */
        //Supuesto como prefijo
        --numero1;
        System.out.printf("Ahora numero1 es = %d\n",numero1);

        // Para entender la diferencia entre el incremento (++) y el decremento (--) de prefijo y posfijo
        int a,b,c;
        a=1;
        b=a++; // -> b=1 y luego a=2
        c=++a; // -> incrementamos primero a a=3 y despues asignamos el valor a c=3
        System.out.println("a="+a+" b="+b+" c="+c);

        int d=a*b++;
        System.out.println("d="+d+" a="+a+" b="+b);


        /* Actividad. Solicita la edad al usuario y muestra cuanto tendrá eñ proximo año (asumimos que no nacio en Enero)
        *   1. Declarar el Scanner.
        *   2. Solicitamos la edad.
        *   3. Declaramos la variable y leemos el texto.
        *   4. Incrementar su edad.
        *   5. Devolver su edad en 2025.
         * */
        System.out.print("Indica tu edad actual -> ");
        byte edad=sc.nextByte();
        edad++;
        System.out.println("Tu edad en 2025 será de -> "+edad+ " años");


        /* Actividad Repaso. Solicita el DNI al usuario y muestra el numero que corresponde con la letra asignada a su DNI.
         *   2. Solicitamos el DNI.
         *   3. Declaramos la variable y leemos el texto.
         *   3. Calculamos la letra del DNI.
         *   5. Devolver el número que identifica a la letra que corresponde al DNI.
         * */
        System.out.print("Introduce el numero de tu DNI (sin empezar por 0) -> ");
        int numeroDni=sc.nextInt();
        int letraDNI=numeroDni%23;
        System.out.println("La letra es: "+letraDNI);





    }
}
