import java.util.Scanner;
/*Una empresa que se dedica a la venta de Aceite de Oliva necesita una aplicación en java para gestionar las facturas.
En cada factura figura: el código del artículo, la cantidad vendida en litros y el precio por litro.

Realizar un menú, con la siguiente estructura:
1. Facturar
2. Salir

En facturar, solicitar el código que pueden ser (01 de 1 litro, 02 de 3 litros y 03 de 5 litros)
----------------------------------------
Según el formato, los precios son:
    1 litro -> 9,99€
    3 litros -> 29,99€
    5 litros-> 49,95€
---------------------------------------------
Según lo que haya facturado mostrar los datos suministrados, el total de la factura, y el IVA 4%
*/

public class Main {
    public static void main(String[] args) {
        //Primero declaramos el Scanner que nos permitirá leer los datos.
        Scanner sc = new Scanner(System.in);
        //Declaramos las variables para el aceite según los litros y establecemos su valor (como no cambiaran las declaramos como constantes).
        final double aceite1l=9.99, aceite3l=29.99, aceite5l=49.95;
        //Declaramos las variables que necesitaremos aparte del precio.
        int cantidad1L=0,cantidad3L=0,cantidad5L=0;
        int op=0;
        double totalLitros=0, precioTotal=0;
        //Declaramos un bucle do{}while para mostrar, recoger y calcular los datos insertados
        do {
            //Mostramos el menú de opciones al cliente
            System.out.println("|**** Tienda de Aceite *****|");
            System.out.println("|---------------------------|");
            System.out.println("|****    1. Aceite 1L   ****|");
            System.out.println("|****    2. Aceite 3L   ****|");
            System.out.println("|****    3. Aceite 5L   ****|");
            System.out.println("|****    4. Facturar    ****|");
            System.out.println("|---------------------------|");
            System.out.println("|Indique una opción → ");
            //Recogemos el dato introducido por el cliente
            op = sc.nextInt();
            // Con switch() realizaremos una serie de acciones según la opción introducida por el usuario
            switch (op) {
                // En los casos 1,2 y 3 se preguntará la cantidad a comprar y se calculará
                case 1->{
                    System.out.println("\nIndica la cantidad de 1L → ");
                    cantidad1L = sc.nextInt();
                    precioTotal += (double)cantidad1L*aceite1l;
                    totalLitros += cantidad1L*1;
                }
                case 2->{
                    System.out.println("\nIndica la cantidad de 3L → ");
                    cantidad3L = sc.nextInt();
                    precioTotal += (double)cantidad3L*aceite3l;
                    totalLitros += cantidad3L*3;
                }
                case 3->{
                    System.out.println("\nIndica la cantidad de 5L → ");
                    cantidad5L = sc.nextInt();
                    precioTotal += (double)cantidad5L*aceite5l;
                    totalLitros += cantidad5L*5;
                }
                //En este caso se muestra un mensaje y se detiene el bucle
                case 4->{
                    System.out.println("\nGenerando factura...");
                    break;
                }
                //En este caso se muestra un mensaje si la opción marcada no existe
                default -> {
                    System.out.println("Opcion no válida");
                }
            }
        }while (op!=4); //Cuando la opción sea 04/4 saldrá del bucle
        //Calculamos la cantidad total de litros facturado sumando las cantidades.
        totalLitros+=cantidad1L*cantidad3L*cantidad5L;
        //Mostramos y devolvemos la factura con el total de los litros y el precio final de compra.
        System.out.println("\n|****    Factura Aceite     ****|");
        System.out.println("| Cantidad total (litros) → "+totalLitros+" litros");
        System.out.printf("| Total a pagar (sin IVA) → %2f €",precioTotal);
        System.out.printf("\n| Total a pagar (+IVA) → %2f €",(precioTotal*1.04));
    }
}