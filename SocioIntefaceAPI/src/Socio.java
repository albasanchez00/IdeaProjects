import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Socio implements Comparable{
    private int id;
    private String nombre;
    private LocalDate fNacimento;
    DateTimeFormatter fechaFormateada = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    //LocalDate lo pasamos como String para que no de errores al pasar por el formato de fecha
    public Socio(int id, String nome, String fNacimento) {
        this.id = id;
        this.nombre = nome;
        this.fNacimento = LocalDate.parse(fNacimento, fechaFormateada);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getfNacimento() {
        return fNacimento;
    }

    public void setfNacimento(LocalDate fNacimento) {
        this.fNacimento = fNacimento;
    }

    //Método para calcular la edad
    public int calcularEdad(){
        int edad=0;
        return (int) fNacimento.until(LocalDate.now(), ChronoUnit.YEARS);
    }


    @Override
//    public int compareTo(Object socio) {
//        Socio otroSocio = (Socio) socio;
//        int resultado;
//        if(this.id<otroSocio.getId()){
//            resultado=-1;
//        }else if(this.id>otroSocio.getId()){
//            resultado=1;
//        }else {
//            resultado=0;
//        }
//        return resultado;
//    }
    public int compareTo(Object o) {
        Socio otroSocio = (Socio) o;
        return nombre.compareTo(otroSocio.nombre);
    }

    //ToString()
    @Override
    public String toString() {
        return "\nSocio ||" +
                "\nId → "+ id +
                "\nNombre → " + nombre +
                "\nNacimento → " + fNacimento.format(fechaFormateada)+
                "\nEdad → "+calcularEdad()+" años";
    }
}
