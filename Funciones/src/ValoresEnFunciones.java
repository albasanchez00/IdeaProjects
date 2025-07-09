import java.util.Scanner;

public class ValoresEnFunciones {
    public static void main(String[] args) {
        //Solicita un número y verifica que multiplicandole 10
        System.out.print("Introduce un valor para el 1º número → ");
        int num1=new Scanner(System.in).nextInt();
        //Mostramos cual de los valores es mayor →
        int mayor=mostrarMayor(num1,num1*10); //Almacenado el valor retornado en una variable.
        System.out.println("Lógicamente, el mayor es "+mayor);

        // Estas 3 líneas ↓
        num1=(int)(Math.random()*101);
        int num2=(int)(Math.random()*101);
        System.out.println("El mayor de dos números aleatorios es "+mostrarMayor(num1,num2));

        // Son lo mismo que esto ↓
        System.out.println("El mayor de dos números aleatorios es "+mostrarMayor(crearRandom(),crearRandom()));

        //Mostrar texto mediante una función ↓
        mostrarTexto("El texto a mostrar mediante una función");
    }


    /** Función que devuelve el mayor de dos números.
     * @param num1
     * @param num2
     * @return int
    */
    static int mostrarMayor(int num1, int num2){
        return Math.max(num1, num2); //Devuelve el valor del mayor número.
    }

    static int crearRandom(){
        return (int)(Math.random()*101);
    }

    // Función para motrar por pantalla cualquier texto con salto de línea
    static void mostrarTexto(String texto){
        System.out.println(texto);
    }
}
