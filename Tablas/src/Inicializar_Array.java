import java.util.Arrays;

/* El método fill, inicializa un Array según un valor */

public class Inicializar_Array {
    public static void main(String[] args) {
        String[] frutas = new String[10];
        System.out.println(Arrays.toString(frutas));
        Arrays.fill(frutas, "Kiwi");
        System.out.println(Arrays.toString(frutas));

        double[] sueldo = new double[10];
        System.out.println(Arrays.toString(sueldo));
        Arrays.fill(sueldo,1184.00);
        System.out.println(Arrays.toString(sueldo));
    }
}
