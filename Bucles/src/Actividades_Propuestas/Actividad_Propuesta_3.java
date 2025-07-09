package Actividades_Propuestas;

/* Actividad Propuesta 3. Mostrar un saludo mediante un bucle 10 veces.
* Mosrtar 10 veces 'Hola' en la consola
* Pista → Necesitas un contador que se incremente en cada interación
*/

public class Actividad_Propuesta_3 {
    public static void main(String[] args) {
        int saludo = 0;
        String mensaje = "";
        String saludoT = "Hola";
        do {
            saludo++;
            System.out.printf(saludoT+"\n");

        } while (saludo <= 10);
    }
}
