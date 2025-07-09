public class Bebidas {
    private String nombreBebida;
    private double precioBebida;

    public Bebidas(String nombreBebida, double precioBebida) {
        this.nombreBebida = nombreBebida;
        this.precioBebida = precioBebida;
    }

    public String getNombreBebida() {
        return nombreBebida;
    }

    public void setNombreBebida(String nombreBebida) {
        this.nombreBebida = nombreBebida;
    }

    public double getPrecioBebida() {
        return precioBebida;
    }

    public void setPrecioBebida(double precioBebida) {
        this.precioBebida = precioBebida;
    }

    @Override
    public String toString() {
        return "Bebidas Menú:" +
                "\nNombre Bebida → " + nombreBebida +
                "\nPrecio Bebida → " + precioBebida + "€";
    }
}
