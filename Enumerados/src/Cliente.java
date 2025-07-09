public class Cliente {
    private String nombre;
    enum Sexo{
        HOMBRE,MUJER
    }

    //Método constructor
    private  Sexo sexoCliente;

    public Cliente(String nombre, Sexo sexoCliente) {
        this.nombre = nombre;
        this.sexoCliente = sexoCliente;
    }

    //Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Sexo getSexoCliente() {
        return sexoCliente;
    }

    public void setSexoCliente(Sexo sexoCliente) {
        this.sexoCliente = sexoCliente;
    }

    //toString()
    @Override
    public String toString() {
        return "Cliente: " + nombre + '\n' +
                "Sexo: " + sexoCliente;
    }
}
