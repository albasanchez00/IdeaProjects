import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cliente c1=new Cliente("Juan Perez", Cliente.Sexo.HOMBRE);
        System.out.println(c1.toString());

        System.out.println();

        Cliente c2=new Cliente("Marta Lopez", Cliente.Sexo.valueOf("MUJER"));
        System.out.println(c2.toString());

        System.out.println();

        System.out.println("Tallas disponibles → MINI, MEDIANA, GRANDE, MUYGRANDE");
        System.out.print("Indique la talla → ");
        String tallatallaCliente = new Scanner(System.in).nextLine().toUpperCase();
        Tallas talla=Tallas.valueOf(tallatallaCliente);
        System.out.println("La talla seleccionada es → " +talla.getAbreviatura());
        System.out.println();

        int libro=25;
        TipoIVA iva = TipoIVA.IVAG;
        double precioT=libro* iva.getpIva();
        System.out.println("Precio libro: "+libro+" €");
        System.out.println("Precio libro (+IVA): "+precioT+" €");

        double leche=0.75;
        TipoIVA ivaAlimento = TipoIVA.IVAG;
        double precioLeche=leche*ivaAlimento.getpIva();
        System.out.println("Precio leche:"+leche+" €");
        System.out.println("Precio leche (+IVA):"+precioLeche+" €");

        double pan=2.40;
        double precioJuegos=pan*ivaAlimento.getpIva();
        System.out.println("Precio pan:"+pan+" €");
        System.out.println("Precio pan (+IVA):"+precioJuegos+" €");

        double loteria=50000;
        TipoIVA ivaLoteria=TipoIVA.IVAV;
        double precioLoteria=loteria-(loteria*ivaLoteria.ivaJuego());
        System.out.println("Premio Loteria: "+loteria+" €");
        System.out.println("Premio Loteria (-IVA): "+precioLoteria+" €");

    }
}