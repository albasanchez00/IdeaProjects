/* Desarrolla en Java una aplicación de consola que simule una máquina expendedora de refrescos.
Esta máquina debe permitir al usuario:
1. Ver un menú de 6 refrescos disponibles con su precio.
2. Seleccionar un refresco introduciendo un número.
3. Introducir el dinero para pagar.
4. Mostrar si el dinero es suficiente y calcular el cambio.

Al final, mostrar:
- Cuántas unidades se vendieron de cada refresco.
- El total de dinero recaudado.

Bebidas disponibles:
1. Coca-Cola
2. Pepsi
3. Fanta Naranja
4. Sprite
5. Aquarius Limón
6. Nestea
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Instanciamos la clase MaquinaRefrescos.
        MaquinaRefrescos maqRefrescos = new MaquinaRefrescos();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            //Primero mostramos el menu de refrescos.
            maqRefrescos.mostrarMenu();
            opcion = sc.nextInt();

            //Si la opcion no es 0 (0-Salir) se procesa el pedido.
            if (!(opcion == 0)) {
                System.out.println("Ingrese el dinero:");
                //Enviamos la cantidad ingresada y procesamos el pedido.
                maqRefrescos.procesarPedido(opcion, sc.nextDouble());
            }
        }while (opcion!=0); //Mientras la opción sea distinto de 0 se repetirá el proceso (cuando sea 0 saldrá).
        System.out.println("Gracias por su compra");
        sc.close(); //Cerramos el scanner.
        maqRefrescos.mostrarHistorial(); //Mostramos el historial de compras.
    }
}