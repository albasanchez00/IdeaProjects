package modelos2;

public class Anunciantes {
    private String nombreAnunciante;
    private String telefono;
    private String direccion;

    public Anunciantes(String nombreAnunciante, String telefono, String direccion) {
        this.nombreAnunciante = nombreAnunciante;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Anunciantes() {
    }

    public String getNombreAnunciante() {
        return nombreAnunciante;
    }

    public void setNombreAnunciante(String nombreAnunciante) {
        this.nombreAnunciante = nombreAnunciante;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
