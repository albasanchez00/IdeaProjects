import java.time.LocalTime;
import java.util.ArrayList;

public class Facturas {
    private ArrayList<Comandas> comandas;
    private LocalTime fechaHoraF;
    private double cuentaTotal;
    private final double iva=0.21;

    public Facturas() {
        this.comandas = new ArrayList<>(); // Inicializar correctamente
        this.fechaHoraF = LocalTime.now();
        this.cuentaTotal = 0;
    }

    // Añadir método para agregar comandas y calcular total
    public void agregarComanda(Comandas comanda) {
        comandas.add(comanda);
        cuentaTotal += comanda.getPrecioTotal();
    }


    public double getCuentaTotal() {
        return cuentaTotal;
    }
    public double getIvaAplicado() {
        return cuentaTotal * iva;
    }
    public double getIvaSuma() {
        return cuentaTotal * iva;
    }

    @Override
    public String toString() {
        return "Factura:" +
                "Comandas → " + comandas +
                "Fecha y Hora → " + fechaHoraF +
                "Total (Sin IVA) = " + cuentaTotal + "€" +
                "Total (+IVA) = " + getIvaSuma() + "€";
    }
}
