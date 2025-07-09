import java.util.Arrays;

/* Busqueda Secuencial:
    Es la comparación de un elemento buscado, comparado con cada uno de los valores del Array
    · Sintaxis
        while (indice < arrayPalabras.length && !arrayPalabras[indice].equals(buscarPalabra)){}
*/
public class Buscar_Array_Secuencial {
    public static void main(String[] args) {
        String[] palabras= {"Maniquí","Pájaro","Sol","Aula","Estrella","Montaña","Baile","Juego","Disfraz",
                "Rojo","Colores","Fiesta","Música","Confeti","Máscara","Carroza","Carpa","Gafas","Peluca","Carnaval"};
        int indice = buscarSecuencial(palabras,"Carnaval");
        System.out.println("La palabra '"+palabras[indice]+"' está en el índice → "+indice);

        // Tabla Ordenada de Precios
        double[] precios={45.58,78.85,66.15,75.95,74.87,25.47,66.21};
        Arrays.sort(precios);

        //Si devuelve >=0 (mayor o igual que) es que ha encontrado el índice del elemento.
        //Si te devuelve <=0 el elemento buscado no fue encontrado y te indica la posible posición donde insertarlo.
        int posicion=Arrays.binarySearch(precios,61);
        if(posicion<0){
            System.out.println("No se encontro el precio, puede insertarlo en la posición → "+ (-posicion-1));
        }else {
            System.out.println("\nEl precio está en la posición → "+posicion);
        }
    }

    static int buscarSecuencial(String[] arrayPalabras, String buscarPalabra) {
        int indice = 0;
        while (indice < arrayPalabras.length && !arrayPalabras[indice].equals(buscarPalabra)) {
            indice++;
        }
        return indice;
    }

}
