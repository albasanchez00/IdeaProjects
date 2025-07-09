import java.util.Arrays;

/*
    for (int i=0; i<tabla.length; i++) → Para recorrer una tabla de forma ascendente
    for (int i=tabla.length-1; i>=0; i--) → Para recorrer una tabla de forma descendente

    Por ejemplo:
    for(tipo valor : nombreTabla)

    Ejemplo:
    1. Crear una tabla de 10 elementos aleatorios (for)
    2. Mostrar la tabla de forma ascendente con foreach()
    3. Mostrar la tabla de forma descendente con foreach()
    4. M
*/

public class Recorrido_Arrays {
    public static void main(String[] args) {
        int[] numero = new int[10];
        numero = crearArray(); // Se iguala/reemplaza los valores que devuelve la función crearArray()

        System.out.println("ORDENAR VALORES DESCENDETES");
        mostrarDescendete(numero);
        System.out.println();
        
        System.out.println("\nORDENAR POR VALORES ASCENDETES");
        mostrarAscendete(ordenar(numero));

        /* Otra forma de ejecución */
        mostrarDescendete(ordenar(crearArray()));
    }

    static int[] crearArray() {
        // 1. Crear un Array de 10 elementos aleatorios
        int[] arrayNumero = new int[10];
        for (int i = 0; i < 10; i++) {
            arrayNumero[i] = (int)(Math.random()*100);
        }
        return arrayNumero;
    }

    // 2. Mostrar la tabla de forma ascendente con foreach()
    static void mostrarAscendete(int[] arrayNumero) {
        for (int item: arrayNumero) {
            System.out.print(item + " ");
        }
    }

    // 3. Mostrar la tabla de forma descendente con foreach()
    static void mostrarDescendete(int[] arrayNumero) {
        for (int i=0; i<arrayNumero.length; i++) {
            System.out.print(arrayNumero[i] + " ");
        }
    }

    // 4. Mostrar la tabla ordenada por valor con Arrays.sort()
    static int[] ordenar(int[] arrayNumero) {
        Arrays.sort(arrayNumero);
        return arrayNumero;
    }
}
