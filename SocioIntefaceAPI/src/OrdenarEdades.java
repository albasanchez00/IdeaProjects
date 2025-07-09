import java.util.Comparator;

public class OrdenarEdades implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Socio)o1).calcularEdad()-((Socio)o2).calcularEdad();
    }
}
