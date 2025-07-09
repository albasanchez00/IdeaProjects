package modelos;

public class Persona {
    //Atributos de la super clase
    private String nombre;
    private String apellido;
    private int edad;
    public enum Sexo{
        MASCULINO,FEMININO
    }
    private Sexo sexo;

    //Método constructor
    public Persona(String nombre, String apellido, int edad, Sexo sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    //Metodo toString()
    @Override
    public String toString() {
        return "Persona:" +
                "\nNombre → " + nombre +
                "\nApellido → " + apellido +
                "\nEdad → " + edad +
                "\nSexo → " + sexo;
    }

}
