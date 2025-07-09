public class Platos {
    //Atributos de la Clase Platos
    private String nombrePlato;
    private double precioPlato;
    private String tipoPlato;

    //Constructor de la Clase Platos
    public Platos(String nombrePlato, double precioPlato, String tipoPlato) {
        this.nombrePlato = nombrePlato;
        this.precioPlato = precioPlato;
        this.tipoPlato = tipoPlato;
    }

    //Métodos Getter y Setter
    public String getNombrePlato() {
        return nombrePlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public double getPrecioPlato() {
        return precioPlato;
    }

    public void setPrecioPlato(double precioPlato) {
        this.precioPlato = precioPlato;
    }

    public String getTipoPlato() {
        return tipoPlato;
    }

    public void setTipoPlato(String tipoPlato) {
        this.tipoPlato = tipoPlato;
    }

    //Método toString() para mostrar los datos.
    @Override
    public String toString() {
        return "Platos Menú:" +
                "\nNombre Plato → " + nombrePlato +
                "\nPrecio Plato → " + precioPlato + "€" +
                "\nTipo Plato → " + tipoPlato;
    }
}
