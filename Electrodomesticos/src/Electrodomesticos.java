public class Electrodomesticos {
    private String tipo;
    private String marca;
    private double potencia;

    public Electrodomesticos(String tipo, String marca, double potencia) {
        this.tipo = tipo;
        this.marca = marca;
        this.potencia = potencia;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getConsumo(int horas){
        double consumoTotal = potencia*horas;
        return consumoTotal;
    }
    public double getCosteConsumo(double costeHora, int horas){
        costeHora = potencia*horas;
        return costeHora;
    }

    @Override
    public String toString() {
        return "\nElectrodomesticos:" +
                "\nTipo → " + tipo +
                "\nMarca → " + marca +
                "\nPotencia → " + potencia;
    }
}
