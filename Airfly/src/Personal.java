public class Personal {
    String nombre;
    String departamento;
    static int Id=0; //de la clase
    int id0;
    public Personal(String nombre, String departamento, int id) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.id0=++Id;
    }

    public Personal(String nombre) {
        this.nombre = nombre;
        this.id0=++Id;
    }

    public Personal() {
        this.id0=++Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getId() {
        return id0;
    }

    public void setId(int id) {
        this.id0 = id;
    }

    @Override
    public String toString() {
        return "Nombre="+nombre+
                "\nDepartamento="+departamento+
                "\nId="+id0;
    }
}
