import java.util.Scanner;

public class OperaAsigna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Operadores Opera y asigna
            * += -> Suma y asgina
            * -= -> Resta y asgina
            * *= -> Multiplica y asgina
            * /= -> Divide y asgina
            * %= -> Módulo y asgina
        */

        int a=5,b=10,c=15;
        // += -> Suma y asgina
        a+=10;
        System.out.println("Suma y asigna devuelve (a+=10) -> "+ a);

        // -= -> Resta y asgina
        c-=7;
        System.out.println("Resta y asigna devuelve (c -= 7) -> "+ c);

        // *= -> Multiplica y asgina
        a*=10;
        System.out.println("Multiplica y asigna devuelve (a*=10) -> "+ a);

        // /= -> Divide y asgina
        b/=2;
        System.out.println("Divide y asigna devuelve (b/=2) -> "+ b);

        // %= -> Módulo y asgina
        c%=3;
        System.out.println("Modulo y asigna devuelve (c%=3) -> "+ c);


        /* Actividad 2.Solicitar ventas semestrales de las peras y las manzanas.
        * Precio de las manzanas es 2,35
        * Precio de las peras es 1,9
        * Mostrar por la pantalla el importe total vendido
        */
        final double PRECIO_PERA=1.9;
        final double PRECIO_MANZANA=2.35;

        // Solicitamos los datos.
        System.out.println("Kilos de peras vendidos en el 1º Trimestre -> ");
        double kilosPeras=sc.nextDouble();
        System.out.println("Kilos de peras vendidos en el 2º Trimestre -> ");
        kilosPeras+=sc.nextDouble();
        System.out.println("Kilos de manzanas vendidos en el 1º Trimestre -> ");
        double kilosManzanas=sc.nextDouble();
        System.out.println("Kilos de manzanas vendidos en el 2º Trimestre -> ");
        kilosManzanas+=sc.nextDouble();

        kilosPeras*=PRECIO_PERA;
        kilosManzanas*=PRECIO_MANZANA;

        double gananciasTotales=kilosManzanas+kilosPeras;
        System.out.println("Las ventas totales son de -> " + gananciasTotales + "€");

        sc.close();



    }
}
