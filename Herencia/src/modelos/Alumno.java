package modelos;

public class Alumno extends Persona {
    private double nota;
    private String asigOptativa;
    private String curso;
    private String tutor;


    //Método constructor
    public Alumno(String nombre, String apellido, int edad, Sexo sexo, double nota, String asigOptativa, String curso, String tutor) {
        super(nombre, apellido, edad, sexo);
        this.nota = nota;
        this.asigOptativa = asigOptativa;
        this.curso = curso;
        this.tutor = tutor;
    }

    //Método constructor vacío
    public Alumno() {}


    //Metodos Getter y Setter
    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getAsigOptativa() {
        return asigOptativa;
    }

    public void setAsigOptativa(String asigOptativa) {
        this.asigOptativa = asigOptativa;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTutor() {
        return "El tuto del Alumno " + super.getNombre() + " es → " + tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    @Override
    public String getNombre() {
        return super.getNombre().toUpperCase();
    }

    //Generamos metodo toString()
    @Override
    public String toString() {
        return super.toString()+
                "\nAlumno:" +
                "\nNota → " + nota +
                "\nAignatura Optativa → " + asigOptativa +
                "\nCurso → " + curso +
                "\nTutor → " + tutor;
    }
}
