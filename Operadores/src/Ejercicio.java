import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Las respuestas deben indicarse con true o false");
        System.out.println("¿Está lloviendo?");
        boolean tiempo = sc.nextBoolean();

        System.out.println("¿Has terminado la tarea?");
        boolean tarea = sc.nextBoolean();

        System.out.println("¿Tienes que ir a la biblioteca?");
        boolean biblioteca = sc.nextBoolean();

        // Si no llueve y ha terminado la tarea -> podrá salir a la calle o si tiene que ir a la biblioteca.
        // Si no llueve y no terminado la tarea -> No podrá salir a la calle.
       boolean resultado = !tiempo && tarea || biblioteca;
       System.out.println("¿Puedo salir a la calle?\n"+resultado);
    }
}
