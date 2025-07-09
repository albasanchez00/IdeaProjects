import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bombilla general = new Bombilla();
        Bombilla cocina = new Bombilla();
        Bombilla banio = new Bombilla();
        Bombilla hab1 = new Bombilla();
        Bombilla hab2 = new Bombilla();
        Bombilla terraza = new Bombilla();
        Bombilla salon = new Bombilla();
        int opcion;
        do {
            System.out.println("\n|**** PANEL GENERAL ****|");
            System.out.println("|***********************|");
            System.out.println("|**** 1. Salón ****|");
            System.out.println("|**** 2. Cocina ****|");
            System.out.println("|**** 3. Baño ****|");
            System.out.println("|**** 4. Habitación Principal ****|");
            System.out.println("|**** 5. Habitación Auxiliar ****|");
            System.out.println("|**** 6. Terraza ****|");
            System.out.println("|**** 7. General Casa ****|");
            System.out.println("|**** 8. Mostrar Interruptores ****|");
            System.out.println("|**** 9. Salir ****|");
            System.out.println("|***********************|");
            System.out.println("|Indique una opción → ");
            opcion = sc.nextInt();
            switch (opcion){
                case 1->{
                    salon.encenderApagar();
                }
                case 2->{
                    cocina.encenderApagar();
                }
                case 3->{
                    banio.encenderApagar();
                }
                case 4->{
                    hab1.encenderApagar();
                }
                case 5->{
                    hab2.encenderApagar();
                }
                case 6->{
                    terraza.encenderApagar();
                }
                case 7->{
                    if (Bombilla.interruptorGeneral){
                        Bombilla.interruptorGeneral = false;

                    }else{
                        Bombilla.interruptorGeneral = true;
                    }
                }
                case 8 -> {
                    System.out.println("\nSalon → "+salon.mostrarEstado());
                    System.out.println("Cocina → "+cocina.mostrarEstado());
                    System.out.println("Baño → "+banio.mostrarEstado());
                    System.out.println("Principal → "+hab1.mostrarEstado());
                    System.out.println("Auxiliar → "+hab2.mostrarEstado());
                    System.out.println("Terraza → "+terraza.mostrarEstado());
                    System.out.println("General → "+general.mostrarEstado()+"\n");
                }
                case 9->{
                    System.out.println("Saliendo...");
                }
                default -> System.out.println("Opción no válida");
            }
        }while (opcion!=9);
    }
}