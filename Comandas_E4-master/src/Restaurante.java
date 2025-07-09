import javax.swing.*;
import java.util.ArrayList;

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

    private void inicializarDatos() {
        menu.add(new Platos("Ensalada Cesar", 8.50, "Primero"));
        menu.add(new Platos("Macarrones", 6.50, "Primero"));
        menu.add(new Platos("Ensaladilla", 9.50, "Primero"));
        menu.add(new Platos("Solomillo", 12.50, "Segundo"));
        menu.add(new Platos("Chuleta de cerdo", 13.50, "Segundo"));

        bebida.add(new Bebidas("Agua", 1.50));
        bebida.add(new Bebidas("Coca Cola", 2.50));
        bebida.add(new Bebidas("Cerveza", 3.50));
        bebida.add(new Bebidas("Vino", 4.50));
        bebida.add(new Bebidas("Café", 1.80));

        mesa.add(new Mesas(NumeroMesa.MESA_1, ZonaMesa.SALON));
        mesa.add(new Mesas(NumeroMesa.MESA_2, ZonaMesa.SALON));
        mesa.add(new Mesas(NumeroMesa.MESA_3, ZonaMesa.SALON));
        mesa.add(new Mesas(NumeroMesa.MESA_1, ZonaMesa.TERRAZA));
        mesa.add(new Mesas(NumeroMesa.MESA_2, ZonaMesa.TERRAZA));
        mesa.add(new Mesas(NumeroMesa.MESA_3, ZonaMesa.TERRAZA));
    }

    private String listarElementos(ArrayList<?> lista) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lista.size(); i++) {
            sb.append(i + 1).append(". ").append(lista.get(i).toString()).append("\n\n");
        }
        return sb.toString();
    }

    public void mostrarMenu() {
        JOptionPane.showMessageDialog(null, listarElementos(menu), "Menú de Platos", JOptionPane.INFORMATION_MESSAGE);
    }

    public void mostrarBebida() {
        JOptionPane.showMessageDialog(null, listarElementos(bebida), "Menú de Bebidas", JOptionPane.INFORMATION_MESSAGE);
    }

    public void mostrarMesas() {
        StringBuilder salon = new StringBuilder("Salón:\n");
        StringBuilder terraza = new StringBuilder("Terraza:\n");
        for (Mesas m : mesa) {
            if (m.getzMesa() == ZonaMesa.SALON) salon.append(m).append("\n");
            else terraza.append(m).append("\n");
        }
        JOptionPane.showMessageDialog(null, salon + "\n" + terraza, "Mesas Disponibles", JOptionPane.INFORMATION_MESSAGE);
    }

    public Mesas buscarMesa(int zonaSeleccion, int mesaSeleccion) {
        ZonaMesa zona = (zonaSeleccion == 1) ? ZonaMesa.SALON : (zonaSeleccion == 2) ? ZonaMesa.TERRAZA : null;
        NumeroMesa nMesa = switch (mesaSeleccion) {
            case 1 -> NumeroMesa.MESA_1;
            case 2 -> NumeroMesa.MESA_2;
            case 3 -> NumeroMesa.MESA_3;
            default -> null;
        };

        if (zona == null || nMesa == null) return null;

        for (Mesas m : mesa) {
            if (m.getzMesa() == zona && m.getnMesa() == nMesa) return m;
        }
        return null;
    }

    public Platos buscarPlato(int indice) {
        if (indice > 0 && indice <= menu.size()) return menu.get(indice - 1);
        return null;
    }

    public Bebidas buscarBebida(int indice) {
        if (indice > 0 && indice <= bebida.size()) return bebida.get(indice - 1);
        return null;
    }

    public void tomarComanda() {
        try {
            int zonaSeleccion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione zona:\n1. Salón\n2. Terraza"));
            int mesaSeleccion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione número de mesa (1-3):"));
            Mesas mesaElegida = buscarMesa(zonaSeleccion, mesaSeleccion);
            if (mesaElegida == null) {
                JOptionPane.showMessageDialog(null, "Mesa no encontrada.");
                return;
            }

            Comandas nuevaComanda = new Comandas(mesaElegida);

            // Pedido de platos
            boolean seguir = true;
            while (seguir) {
                mostrarMenu();
                int idx = Integer.parseInt(JOptionPane.showInputDialog("Seleccione un plato (0 para salir):"));
                if (idx == 0) break;
                Platos p = buscarPlato(idx);
                if (p != null) {
                    int cant = Integer.parseInt(JOptionPane.showInputDialog("Cantidad:"));
                    nuevaComanda.agregarItem(p, cant);
                }
            }

            // Pedido de bebidas
            while (true) {
                mostrarBebida();
                int idx = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una bebida (0 para salir):"));
                if (idx == 0) break;
                Bebidas b = buscarBebida(idx);
                if (b != null) {
                    int cant = Integer.parseInt(JOptionPane.showInputDialog("Cantidad:"));
                    nuevaComanda.agregarItem(b, cant);
                }
            }

            comanda.add(nuevaComanda);
            JOptionPane.showMessageDialog(null, "Comanda registrada exitosamente.\n" + nuevaComanda.getResumenPedido());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al tomar la comanda: " + e.getMessage());
        }
    }

    public void generarFactura() {
        try {
            int zonaSeleccion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione zona:\n1. Salón\n2. Terraza"));
            int mesaSeleccion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione número de mesa (1-3):"));
            Mesas mesaElegida = buscarMesa(zonaSeleccion, mesaSeleccion);

            if (mesaElegida == null) {
                JOptionPane.showMessageDialog(null, "Mesa no encontrada.");
                return;
            }

            for (Comandas c : comanda) {
                if (c.getMesa().equals(mesaElegida)) {
                    Facturas f = new Facturas();
                    f.agregarComanda(c); // Agregar la comanda a la factura
                    factura.add(f);
                    JOptionPane.showMessageDialog(null, "Factura generada con éxito:\n" + f);
                    return;
                }
            }

            JOptionPane.showMessageDialog(null, "No se encontró comanda para esta mesa.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al generar factura: " + e.getMessage());
        }
    }
    public void ejecutar() {
        int opcion = 0;
        do {
            String input = JOptionPane.showInputDialog(null,
                    "===== RESTAURANTE JAVA =====\n" +
                            "1. Ver menú\n" +
                            "2. Ver bebidas\n" +
                            "3. Tomar Comanda\n" +
                            "4. Ver mesas\n" +
                            "5. Generar factura\n" +
                            "0. Salir\n\n" +
                            "Seleccione una opción:");
            if (input == null) break;

            try {
                opcion = Integer.parseInt(input);
                switch (opcion) {
                    case 1 -> mostrarMenu();
                    case 2 -> mostrarBebida();
                    case 3 -> tomarComanda();
                    case 4 -> mostrarMesas();
                    case 5 -> generarFactura();
                    case 0 -> {
                        break;
                    }
                    default -> JOptionPane.showMessageDialog(null, "Opción no válida.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida.");
                continue;
            }
        } while (opcion!=0);
    }
}