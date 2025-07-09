package Actividades;

/* Solicita dos números y mediante function determina cual es mayor y cual menor
* Luego muestra todos los números de forma decreciente que existen entre ellos
* Ejemplo:
    num1 = 8;
    num2 = 9;
* Funcion que calcula mayorMenor(int num1, int num2){
        int mayor=Math.max(num1,num2);
        int menor=Math.min(num1,num2);
        //Llamamos a la función
    }

* Función mostrarNumeros (int mayor, int menor){
        for (i=menor;i<=mayor;i++){
            System.out.println(num1,num2);
        }
    }
*/

public class Actividad_Propuesta_2 {
    /* NOTA ->
    Si los num no se declaran como static la funcion mostrarNumeros() va dentro
    de la funcion mayorMenor().
     */
    static int num1=18;
    static int num2=9;
    static int mayor;
    static int menor;
    public static void main(String[] args) {
        mayorMenor(num1,num2);
        mostrarNumeros(num1,num2);
    }

    static void mayorMenor(int num1, int num2){
        mayor=Math.max(num1,num2);
        menor=Math.min(num1,num2);
    }

    static void mostrarNumeros(int mayor, int menor){
        for (int i=menor;i<=mayor;i++){
            System.out.print(i+" - ");
        }
    }
}
