public abstract class Entrenador extends EquipoFubol{
    private String idFederacion;

    public Entrenador(String nombre, String dni, int edad, String idFederacion) {
        super(nombre, dni, edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
}
