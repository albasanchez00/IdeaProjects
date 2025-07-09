public class Futbolista extends EquipoFubol {
    private int numeroGoles;

    public Futbolista(String nombre, String dni, int edad, int numeroGoles) {
        super(nombre, dni, edad);
        this.numeroGoles = numeroGoles;
    }

    public int getNumeroGoles() {
        return numeroGoles;
    }

    public void setNumeroGoles(int numeroGoles) {
        this.numeroGoles = numeroGoles;
    }
}
