import java.time.LocalDateTime;
import java.util.ArrayList;

public class Comandas {
    private ZonaMesa zMesa;
    private ArrayList<itemPedido> pedidos;
    private Mesas mesa;
    private LocalDateTime fechaHora;
    private Destino destino;

    //Metodo Constructor en el que creamos el item.
    public Comandas(Mesas mesa) {
        this.mesa = mesa;
        this.pedidos = new ArrayList<>();
        this.fechaHora = LocalDateTime.now();
        this.destino = Destino.NO_ESPECIFICADO;
    }


    public void agregarItem(Object item, int cantidad) {
        // Validar cantidad positiva
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad debe ser mayor que cero.");
            return;
        }

        itemPedido itemPedido = new itemPedido(item, cantidad);
        pedidos.add(itemPedido); // AÑADIR ESTA LÍNEA

        // Actualizar destino según el tipo de item
        actualizarDestino();
    }

    //Funcion encargada de actualizar el destino de la comanda
    private void actualizarDestino() {
        boolean tieneBebidas = false;
        boolean tienePlatos = false;

        //Instanciamos los valores del pedido
        for (itemPedido item : pedidos) {
            if (item.getItem() instanceof Bebidas) {
                tieneBebidas = true;
            } else if (item.getItem() instanceof Platos) {
                tienePlatos = true;
            }
        }
        //Si tienes platos y bebidas entra al primero, si solo tiene comida entrará en el segundo ....
        if (tienePlatos && tieneBebidas) {
            this.destino = Destino.AMBOS;
        } else if (tienePlatos) {
            this.destino = Destino.COCINA;
        } else if (tieneBebidas) {
            this.destino = Destino.BARRA;
        } else {
            this.destino = Destino.NO_ESPECIFICADO;
        }
    }

    //Getter y Setter


    public Mesas getMesa() {
        return mesa;
    }

    public void setMesa(Mesas mesa) {
        this.mesa = mesa;
    }

    public ZonaMesa getzMesa() {
        return zMesa;
    }

    public void setzMesa(ZonaMesa zMesa) {
        this.zMesa = zMesa;
    }

    public ArrayList<itemPedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<itemPedido> pedidos) {
        this.pedidos = pedidos;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    //Creamos la funcion que se encargará de calcular el gasto total del cliente
    public double getPrecioTotal() {
        double total=0;
        for(itemPedido p : pedidos) {
            total+= p.getPrecio();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Comanda:" +
                "\nMesa → " + zMesa +
                "\nPedidos → " + pedidos +
                "\nNº Mesa → " + mesa +
                "\nFecha y Hora → " + fechaHora +
                "\nDestino → " + destino;
    }

    public String getResumenPedido() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n===== RESUMEN DEL PEDIDO =====\n");
        sb.append("\nMesa: ").append(mesa.toString());
        sb.append("\nPedido: \n");

        for (itemPedido item : pedidos) {
            sb.append(" - ").append(item.toString()).append("\n");
        }

        sb.append("\nTotal: ").append(getPrecioTotal()).append("€");
        return sb.toString();
    }
}
