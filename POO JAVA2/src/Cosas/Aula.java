package Cosas;

/* Tanto los atributos como métodos de una clase son llamados "Miembros de la Clase"
    * Modificadores de acceso.
    * Por defecto... no se pone nada (visible en su propia clase y clases vecinas).
    * Private... (visible solo en la misma clase).
    * Public... (Visible en clases vecinas y externas).
    * Atributos -→ Protected... (Visible en clases vecinas y sus herencias)
*/

public class Aula {
    // Por convención los argumentos deben ser privados, y acceder a sus valores mediante los métodos
    private String id;
    private String nombre;
    private int nPuestos;

    //Si no creo un constructor, se crea uno vacío...
    public Aula(String nombre, String id, int nPuestos) {
        this.nombre = nombre;
        this.id = id;
        this.nPuestos = nPuestos;
    }

    public Aula() {
    }

    /* Sección de Getter */
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getnPuestos() {
        return nPuestos;
    }

    /* Sección de Setter */
    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setnPuestos(int nPuestos) {
        this.nPuestos = nPuestos;
    }
}
