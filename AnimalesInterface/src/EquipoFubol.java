public class EquipoFubol {
    private String nombre;
    private String dni;
    private int edad;

    public EquipoFubol(String nombre, String dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public boolean equals(Object obj) {
        return this.dni.equals(((EquipoFubol) obj).dni);
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "EquipoFubol:" +
                "\nNombre → " + nombre +
                "\nDni='" + dni +
                "\nEdad=" + edad;
    }

}
