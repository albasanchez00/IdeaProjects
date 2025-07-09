import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        menu();


    }

    static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Encendiendo radio.... indique una frecuencia");
        System.out.print("Frecuencia (80-100)→ ");
        double frecuenciaInicial=sc.nextDouble();
        SintonizadorFM radio=new SintonizadorFM(frecuenciaInicial);
        int opcion=0;
        do {
            System.out.println("\n|********** RADIO FM ***********|");
            System.out.println("|*******************************|");
            System.out.println("|***** 1. Subir frecuencia *****|");
            System.out.println("|***** 2. Bajar frecuencia *****|");
            System.out.println("|**** 3. Mostrar frecuencia ****|");
            System.out.println("|********** 4. Salir ***********|");
            System.out.println("|*******************************|");
            System.out.print("|Indica una opción → ");
            try {
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1-> radio.subirFrecuencia();

                    case 2-> radio.bajarFrecuencia();

                    case 3-> radio.mostrarFrecuencia();

                    case 4-> System.out.println("Hasta luego....");

                    default-> System.out.println("Opción no válida");

                }
            }catch (Exception e) {
                System.out.println("Opción incorrecta");
            }



        }while(opcion!=4);
    }

}