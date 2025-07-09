public class Campana extends Instrumento {
    public Campana() {
        super();
    }

    public void interpretar() {
        //Recorremos el Array de Notas de la superclase y la mostramos con un switch/case
        for (Notas m : melodias) {
            System.out.print(m + "-");
        }
    }

}
