package modelos;

public class Profesor extends Persona{
    private String aula;
    private double sueldo;
    private String asignatura;


    //Método constructor.
    public Profesor(String nombre, String apellido, int edad, Sexo sexo, String aula, double sueldo, String asignatura) {
        super(nombre, apellido, edad, sexo);
        this.aula = aula;
        this.sueldo = sueldo;
        this.asignatura = asignatura;
    }

    //Método constructor vacío.
    public Profesor() {}



    //Método Getter y Setter.
    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }


    @Override
    public String getNombre() {
        return super.getNombre().toUpperCase();
    }

    //Método toString()
    @Override
    public String toString() {
        return super.toString()+
                "\nProfesor:" +
                "\nSueldo → " + sueldo +
                "\nAignatura → " + asignatura +
                "\nAula → " + aula;
    }
}
