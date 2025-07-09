/* Siempre trabaja con un ID → que identifique cada
 objeto */

public class Coche implements Comparable{
    private static int contador; //cada vez que se cree un objeto coche con el constructor,
    //este id se incrementará en 1 y a ese objeto se le asignará el valor
    private Marcas marca;
    private String modelo;
    private String color;
    private String matricula;
    private int anio;
    private double kilometraje;
    private int idCoche;

    //Método Constructor

    public Coche(Marcas marca, String modelo, String color, String matricula, int anio, double kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.matricula = matricula;
        this.anio = anio;
        this.kilometraje = kilometraje;
        this.idCoche = ++contador;
    }

    public Marcas getMarca() {
        return marca;
    }

    public void setMarca(Marcas marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getIdCoche() {
        return idCoche;
    }

    @Override
    public int compareTo(Object o) {
        Coche c = (Coche) o;
        return c.getMarca().compareTo(this.marca);
    }

    @Override
    public String toString() {
        return "Coche (Id→ "+idCoche+"):" +
                "\nMarca → " + marca +
                "\nModelo → " + modelo +
                "\nColor → " + color+
                "\nMatricula → " + matricula+
                "\nAño → " + anio +
                "\nKilometraje → " + kilometraje+
                "\n";
    }


}
