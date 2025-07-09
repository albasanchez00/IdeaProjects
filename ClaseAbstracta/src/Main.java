/*
Crear la clase abstracta Instrumento, que almacena en una tabla las notas musicales de una melodia (dentro de una
misma octava). El método ass() añade nuevas notas musicales. La clase también dispone del método abstracto
interpretar() que, en cada sub-clase que herede de Instrumento, mostrará por consola las notas musciales segun
las interprete. Utilizar enumerados para definir las notas musciales.

*****

 Crea la clase Campana que hereda de Instrumento
 */
public class Main {
    public static void main(String[] args) {
        Notas[] cancion = {Notas.MI, Notas.LA, Notas.MI, Notas.LA, Notas.RE, Notas.DO};
        Piano p = new Piano();
        //Bucle -> Le agrego cada nota de la canción
        for (Notas m : cancion) {
            p.add(m); //Le almacenamos las nota musicales al piano que a su vez tiene un array de la superclase llamado melodía.
        }
        System.out.println("Melodía Piano");
        p.interpretar(); //Interpretar muestra la melodía.

        //También podría insertar notas a la canción que interpreta el piano de esta manera...
        p.add(Notas.LA);
        System.out.println();
        p.interpretar();

        Notas[] cancionCampana = {Notas.SOL, Notas.LA, Notas.SI, Notas.DO};
        Campana melodiaC = new Campana();
        for (Notas m : cancionCampana) {
            melodiaC.add(m);
        }
        System.out.println("\nMelodía Campana");
        melodiaC.interpretar();




        Rectangulo area2 = new Rectangulo(5, 10);
        area2.Calcular(area2.altura,area2.base);
        area2.mostrarArea();
    }
}