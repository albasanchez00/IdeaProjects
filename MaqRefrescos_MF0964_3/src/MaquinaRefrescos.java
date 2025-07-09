import java.util.ArrayList;

public class MaquinaRefrescos {
    //Creamos un arraylist para almacenar los refrescos vendidos.
    public ArrayList<Refrescos> refrescos;

    //Creamos el método constructor que será quien cree el historial de refrescos
    public MaquinaRefrescos() {
        refrescos = new ArrayList<>();
    }

    /* Mostramos Menú instanciando la clase y llamamos al metodo
     * Se recorre los enums y se muestra.
    */
    public void mostrarMenu() {
        System.out.println("Menu de refrescos");
        for (int i = 0; i < TipoRefresco.values().length; i++){
            System.out.println((i+1) + ". " + TipoRefresco.values()[i].name()+" → "+TipoRefresco.values()[i].getPrecio());
        }
        System.out.println("0. Salir");
        System.out.print("Ingrese el código del producto: ");
    }

    //Creamos la clase que se encargará de procesar el pedido
    public void procesarPedido(int opcion, double dinero){
        //Si la opción es inferior a 0 (0-Salir) devuelve un error
        if (opcion < 0 || opcion > TipoRefresco.values().length){
            System.out.println("Opcion no valida");
            return;
        }

        //Si no entra en el primer if continua con el proceso.
        //Pediendo el dinero del producto que ha de insertar el cliente
        TipoRefresco tipoRefresco = TipoRefresco.values()[opcion-1];
        double precio = tipoRefresco.getPrecio();
        //Si la cantidad de dinero es menor al precio del producto se muestra un mensaje de error.
        if (dinero < precio){
            System.out.printf("Dinero insuficiente"+ "\nEl %S cuesta %.2f€ y has metido %.2f€.\n",
                    formatearNombre (tipoRefresco), precio, dinero);
        }
        //Si la cantidad de dinero es mayor o igual al precio del producto se procesa el pedido y se calcula el cambio.
        if (dinero >= precio){
            double cambio = dinero - precio;
            refrescos.add(new Refrescos(tipoRefresco));
            System.out.println("\nRefresco vendidos");
            System.out.printf("Precio Refresco: %.2f €\n", precio);
            System.out.printf("Dinero insertado: %.2f €\n", dinero);
            System.out.printf("Cambio: %.2f €\n", cambio);
        }
    }

    //Creamos una clase que se encargara de mostrar el historial de compras al apagar la maquina de refrescos.
    public void mostrarHistorial(){
        int numeroVenta=1;
        double totalVentas=0;
        //Recorremos el arraylist de refrescos y mostramos el historial de compras.
        System.out.println("Historial de compras");
        for (Refrescos refresco : refrescos){
            System.out.println(refresco);
            totalVentas += refresco.getPrecio();
        }
        //Mostramos el total de ventas y el número de productos vendidos.
        System.out.println("Productos Vendidos: " + refrescos.size()+" unidades");
        System.out.printf("Total recaudado: %.2f €\n", totalVentas);
    }

    //Clase que se encargara de formatear el nombre de los refrescos.
    private String formatearNombre (TipoRefresco tipo) {
        return tipo.name().toLowerCase().replace("_", " ");
    }
}
