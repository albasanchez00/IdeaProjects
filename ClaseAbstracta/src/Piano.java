public class Piano extends Instrumento {
   //Constructor vacio
    public Piano() {
        super(); //Implementa el constructor de la superclase.
    }

    public void interpretar() {
        //Recorremos el Array de Notas de la superclase y la mostramos con un switch/case
        for (Notas m : melodias) {
            System.out.print(m + "-");
        }
    }
}
