import java.time.LocalTime;
import java.util.ArrayList;

public class Facturas {
    private Comandas comandas;
    private LocalTime fechaHoraF;
    private double cuentaTotal;
    private final double iva=0.21;

    public Facturas(ArrayList<Comandas> comandas) {
        this.comandas = comandas;
        this.fechaHoraF = LocalTime.now();
        this.cuentaTotal = 0;
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
