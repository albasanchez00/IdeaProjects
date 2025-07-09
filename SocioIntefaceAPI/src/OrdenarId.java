import java.util.Comparator;

public class OrdenarId implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return ((Socio)o1).getId()-((Socio)o2).getId();
    }
}
