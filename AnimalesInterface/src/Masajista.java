public abstract class Masajista extends EquipoFubol {
    private String codColegiado;
    private int aniosExperiencia;

    public Masajista(String nombre, String dni, int edad, String codColegiado, int aniosExperiencia) {
        super(nombre, dni, edad);
        this.codColegiado = codColegiado;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getCodColegiado() {
        return codColegiado;
    }

    public void setCodColegiado(String codColegiado) {
        this.codColegiado = codColegiado;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
}
