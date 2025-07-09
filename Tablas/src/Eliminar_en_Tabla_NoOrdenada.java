import java.util.Arrays;

/* Eliminar Elementos dentro de una Tabla No Ordenada.
    1. Se busca recorriendo el Aray... y comparando con un if el elemento a eliminar
    2. Luego el último valor del Array ocupa el sitio del elemento a eliminar.
    3. Finalmente se reduce la longitud de una posición en el Array
*/


public class Eliminar_en_Tabla_NoOrdenada {
    public static void main(String[] args) {
        String[] nombres = {"JuanMa","Anuta","Alba","Rubén","Laura","Arturo","Irina","Dani","Pedro","Fran","Sandra","Raul"};
        System.out.println("Array Sin Modificar → \n"+Arrays.toString(nombres));
        String nombreEliminar="Alba";
        int indice=-1; //Guardará el índice o posición donde se va a sustituir con el último valor.
        String ultimaPos=nombres[nombres.length-1]; //Último elemento del Array.
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equals(nombreEliminar)) {
                indice=i;
                break; //Una vez encontrado, salimos.
            }
        }
        if (indice != -1) { //Si el valor no existe en la tabla, el índice se mantiene en -1
            nombres[indice]=ultimaPos;
            //Recortar el Array
            nombres= Arrays.copyOf(nombres,nombres.length-1);
            System.out.println("\nArray Modificado → \n"+Arrays.toString(nombres));
        }else {
            System.out.println("No se encontró el nombre en la tabla");
        }
    }
}