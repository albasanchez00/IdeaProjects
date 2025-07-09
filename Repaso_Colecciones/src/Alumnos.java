public class Alumnos {
    private String nombre;
    private String apellidos;
    private String curso;
    public static Materia materia;
    private double notaPromedio;
    public enum Materia {
        LENGUA, METEMATICAS, FISICA, BIOLOGIA, QUIMICA;
    }
    private static int contadorIds = 0;   // contador común
    private int idAlumno;

    public Alumnos(String nombre, String apellidos, String curso, double notaPromedio, Materia materia) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.curso = curso;
        this.notaPromedio = notaPromedio;
        this.materia = materia;
        this.idAlumno = ++contadorIds;
    }

    //Métodos Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNotaPromedio() {
        return notaPromedio;
    }

    public void setNotaPromedio(double notaPromedio) {
        this.notaPromedio = notaPromedio;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    //Método toString()

    @Override
    public String toString() {
        return "Alumnos id ("+idAlumno+"):" +
                "\nNombre → " + nombre +
                "\nApellidos → " + apellidos +
                "\nCurso → " + curso +
                "\nNota Promedio → " + notaPromedio +
                "\nMateria → " + materia;
    }
}
