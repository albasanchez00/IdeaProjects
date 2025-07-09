import java.util.Arrays;
//Si utilizamos un metodo abstracto la clase tambien debe de ser lo (abstract class)
public abstract class Instrumento {
    Notas[] melodias; //Tabla que almacena las notas de la melodia

    //Metodo Constructor
    public Instrumento() {
        melodias = new Notas[0];
    }

    public void add(Notas n) {
        melodias = Arrays.copyOf(melodias, melodias.length + 1); //aumentamos 1 posición en la longitud de la tabla
        melodias[melodias.length - 1] = n; // insertamos al final la nueva nota
    }

    //Método Abstracto
    protected abstract void interpretar();
    //Cada instrumento interpretará las notas según su tono.



}
