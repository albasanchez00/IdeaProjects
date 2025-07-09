import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Restaurante {
    private ArrayList<Platos> menu;
    private ArrayList<Bebidas> bebida;
    private ArrayList<Comandas> comanda;
    private ArrayList<Mesas> mesa;
    private ArrayList<Facturas> factura;

    public Restaurante() {
        menu = new ArrayList<>();
        bebida = new ArrayList<>();
        mesa = new ArrayList<>();
        comanda = new ArrayList<>();
        factura = new ArrayList<>();

        inicializarDatos();
    }


    public void inicializarDatos() {
        //Añadimos platos al menú.
        Platos menu1 = new Platos("Ensalada Cesar", 8.50, "Primero");
        Platos menu2 = new Platos("Ensalada Cesar", 8.50, "Primero");
        Platos menu3 = new Platos("Ensalada Cesar", 8.50, "Primero");
        Platos menu4 = new Platos("Ensalada Cesar", 8.50, "Primero");
        Platos menu5 = new Platos("Ensalada Cesar", 8.50, "Primero");

        //Añadimos bebidas al menú
        Bebidas bebida1 = new Bebidas("Agua",1.50);
        Bebidas bebida2 = new Bebidas("Coca Cola",2.50);
        Bebidas bebida3 = new Bebidas("Cerveza", 3.50);
        Bebidas bebida4 = new Bebidas("Vino", 4.50);
        Bebidas bebida5 = new Bebidas("Café", 1.80);

        //Creamos las mesas.
        //Mesas Salón
        Mesas mesaS1 = new Mesas( NumeroMesa.MESA_1, ZonaMesa.SALON );
        Mesas mesaS2 = new Mesas( NumeroMesa.MESA_2, ZonaMesa.SALON );
        Mesas mesaS3 = new Mesas( NumeroMesa.MESA_3, ZonaMesa.SALON );
        //Mesas Terraza
        Mesas mesaT1 = new Mesas( NumeroMesa.MESA_1, ZonaMesa.TERRAZA );
        Mesas mesaT2 = new Mesas( NumeroMesa.MESA_2, ZonaMesa.TERRAZA );
        Mesas mesaT3 = new Mesas( NumeroMesa.MESA_3, ZonaMesa.TERRAZA );
    }

    //Creamos la función que se encargará de mostrar el menú
    public void mostrarMenu(){
        JOptionPane.showMessageDialog(null,"\n******* BEBIDAS *******");
        for (int i=0; i < menu.size(); i++){
            JOptionPane.showMessageDialog(null,((i+1) + ". " + menu.get(i)));
        }
    }

    //Creamos la función que se encargará de mostrar el menú
    public void mostrarBebida(){
        JOptionPane.showMessageDialog(null,"\n******* BEBIDAS *******");
        for (int i=0; i < bebida.size(); i++){
            JOptionPane.showMessageDialog(null,((i+1) + ". " + bebida.get(i)));
        }
    }

    //Creamos una función que se encargará de mostrar las mesas dentro del Restaurante
    public void mostrarMesas(){
        JOptionPane.showMessageDialog(null, "\n******* Salón *******");
        for (Mesas mesas : mesa){
            if (mesas.getzMesa() == ZonaMesa.SALON){
                JOptionPane.showMessageDialog(null,"Mesa Salon: "+mesa);
            }
        }

        JOptionPane.showMessageDialog(null, "\n******* Terraza *******");
        for (Mesas mesas : mesa){
            if (mesas.getzMesa() == ZonaMesa.TERRAZA){
                JOptionPane.showMessageDialog(null,"Mesa Terraza: "+mesa);
            }
        }
    }

    //Buscar mesa
    public Mesas buscarMesa(int zonaSeleccion, int mesaSeleccion){
        ZonaMesa zona;
        NumeroMesa nMesa;

        switch (zonaSeleccion){
            case 1 -> {
                zona = ZonaMesa.SALON;
                break;
            }
            case 2 -> {
                zona = ZonaMesa.TERRAZA;
                break;
            }
            default -> {
                return null;
            }
        }

        if (mesaSeleccion < 1 || zonaSeleccion > 3){
            return null;
        }

        switch (mesaSeleccion){
            case 1 ->{
                nMesa = NumeroMesa.MESA_1;
                break;
            }
            case 2 ->{
                nMesa = NumeroMesa.MESA_2;
                break;
            }
            case 3 ->{
                nMesa = NumeroMesa.MESA_3;
                break;
            }
            default -> {
                return null;
            }
        }
        return null;
    }
    public Platos buscarPlato(int indice) {
        if (indice > 0 && indice <= menu.size()) {
            return menu.get(indice - 1);
        }
        return null;
    }
    public Bebidas buscarBebida(int indice) {
        if (indice > 0 && indice <= bebida.size()) {
            return bebida.get(indice - 1);
        }
        return null;
    }


    public void tomarComanda() {
        Scanner sc = new Scanner(System.in);
        // Mostrar mesas disponibles
        mostrarMesas();
        // Seleccionar zona
        JOptionPane.showMessageDialog(null,"\nSeleccione zona:");
        JOptionPane.showMessageDialog(null,"1. Salón");
        JOptionPane.showMessageDialog(null,"2. Terraza");
        JOptionPane.showInputDialog("Opción: ");
        int zonaSeleccion = sc.nextInt();

        // Seleccionar número de mesa
        JOptionPane.showInputDialog(    null,"Seleccione número de mesa (1-5): ");
        int mesaSeleccion = sc.nextInt();

        Mesas mesa = buscarMesa(zonaSeleccion, mesaSeleccion);
        if (mesa == null) {
            JOptionPane.showMessageDialog(null,"Mesa no encontrada.");
            return;
        }

        // Crear nueva comanda
        Comandas comanda = new Comandas(mesa);

        // Mostrar menú del día y tomar pedido de platos
        mostrarMenu();
        boolean seguirPidiendoPlatos = true;

        while (seguirPidiendoPlatos) {
            JOptionPane.showInputDialog("\nSeleccione un plato (0 para terminar): ");
            int indice = sc.nextInt();

            if (indice == 0) {
                seguirPidiendoPlatos = false;
            } else {
                Platos plato = buscarPlato(indice);
                if (plato != null) {
                    JOptionPane.showInputDialog("Cantidad: ");
                    int cantidad = sc.nextInt();

                    if (cantidad > 0) {
                        comanda.agregarItem(plato, cantidad);
                    } else {
                        JOptionPane.showMessageDialog(null,"La cantidad debe ser mayor que cero.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null,"Plato no encontrado.");
                }
            }
        }
        // Mostrar bebidas y tomar pedido de bebidas
        mostrarMenu();
        boolean seguirPidiendoBebidas = true;

        while (seguirPidiendoBebidas) {
            JOptionPane.showInputDialog("\nSeleccione una bebida (0 para terminar): ");
            int indice = sc.nextInt();

            if (indice == 0) {
                seguirPidiendoBebidas = false;
            } else {
                Bebidas bebida = buscarBebida(indice);
                if (bebida != null) {
                    JOptionPane.showInputDialog("Cantidad: ");
                    int cantidad = sc.nextInt();

                    if (cantidad > 0) {
                        comanda.agregarItem(bebida, cantidad);
                    } else {
                        JOptionPane.showMessageDialog(null,"La cantidad debe ser mayor que cero.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null,"Bebida no encontrada.");
                }
            }
        }


        // Mostrar resumen para confirmación
        System.out.println(comanda.getResumenPedido());

        JOptionPane.showInputDialog("¿Confirmar pedido? (S/N): ");
        String confirmacion = sc.next();

        if (confirmacion.equalsIgnoreCase("S")) {
            // Guardar la comanda
            Comandas comandas = new Comandas();

            JOptionPane.showMessageDialog(null,"\nComanda confirmada y enviada con éxito!");
            JOptionPane.showMessageDialog(null,comanda);
        } else {
            JOptionPane.showMessageDialog(null,"\nOperación cancelada por el usuario.");
        }
    }
    public void generarFactura() {
        Scanner sc = new Scanner(System.in);

        ArrayList<Comandas> comandasFinalizadas = new ArrayList<>();
        // Seleccionar zona
        JOptionPane.showMessageDialog(null,"\nSeleccione zona:");
        JOptionPane.showMessageDialog(null,"1. Salón");
        JOptionPane.showMessageDialog(null,"2. Terraza");
        JOptionPane.showInputDialog("Opción: ");
        int zonaSeleccion = sc.nextInt();

        // Seleccionar número de mesa
        JOptionPane.showInputDialog("Seleccione número de mesa (1-5): ");
        int mesaSeleccion = sc.nextInt();

        Mesas mesaBuscada = buscarMesa(zonaSeleccion, mesaSeleccion);
        if (mesaBuscada == null) {
            System.out.println("Mesa no encontrada.");
            return;
        }

        for (Comandas c : comanda) {
            if (c.getMesa().getzMesa() == mesaBuscada.getzMesa() &&
                    c.getMesa().getnMesa() == mesaBuscada.getnMesa()) {
                break;
            }
        }

        if (comanda == null) {
            System.out.println("Comanda no encontrada o no finalizada.");
            return;
        }

        // Confirmación de facturación
        System.out.println("\nResumen de la comanda a facturar:");
        System.out.println(comanda);

        System.out.print("\n¿Generar factura? (S/N): ");
        String confirmacion = sc.next();

        if (!confirmacion.equalsIgnoreCase("S")) {
            System.out.println("\nOperación cancelada por el usuario.");
            return;
        }

        try {
            Facturas factura = new Facturas(comanda);
            factura.getCuentaTotal();

            System.out.println("\nFactura generada con éxito!");
            System.out.println(factura);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n===== RESTAURANTE JAVA =====");
            System.out.println("1. Ver menú del día");
            System.out.println("2. Ver bebidas");
            System.out.println("3. Ver estado de mesas");
            System.out.println("4. Tomar comanda");
            System.out.println("5. Generar factura");
            System.out.println("0. Salir");

            System.out.print("\nSeleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    mostrarMenu();
                    break;
                case 2:
                    mostrarBebida();
                    break;
                case 3:
                    mostrarMesas();
                    break;
                case 4:
                    tomarComanda();
                    break;
                case 5:
                    generarFactura();
                    break;
                case 0:
                    System.out.println("\n¡Gracias por usar el sistema Restaurante Java!");
                    break;
                default:
                    System.out.println("\nOpción no válida. Inténtelo de nuevo.");
            }

        } while (opcion != 0);
    }
}
