import java.util.Scanner;

/* Operaciones a realizar:
    - Crear una cuenta y para ello solicitar el DNI y titular, el saldo se inicializa en 0.
    - Sacar dinero, para ello debes comprobar que hay saldo.
    - Ingresar dinero, sumarle al saldo el nuevo importe insertado.

* Sobre cargar los métodos constructores, para poder crear objetos a partir del dni, sin nombre y saldo.
* Más otro método constructor con dni, titular y saldo.

* Siguiente cambio: Agregar un atributo estático del nombreBanco...
*/

public class Main {
    public static void main(String[] args) {
        menu();
    }

    static void menu(){
        Scanner sc = new Scanner(System.in);
        int opcion=0;

        //Creamos el objeto
        CuentaCorriente cta=new CuentaCorriente();
        do {
            System.out.println("|********* Menú "+ CuentaCorriente.nombreBanco +" ********|");
            System.out.println("|-----------------------------------|");
            System.out.println("|**** 1. Crear Cuenta sin Saldo ****|");
            System.out.println("|**** 2. Crear Cuenta con Saldo ****|");
            System.out.println("|**** 3. Ingresar Saldo         ****|");
            System.out.println("|**** 4. Retirar Saldo          ****|");
            System.out.println("|**** 5. Mostrar Datos          ****|");
            System.out.println("|**** 6. Salir                  ****|");
            System.out.println("|___________________________________|");
            try {
                opcion = sc.nextInt();
                sc.nextLine();
                switch (opcion) {
                    case 1 ->{
                        System.out.println("Ingrese su nombre: ");
                        cta.setTitular(sc.nextLine());
                        System.out.println("Ingrese su DNI: ");
                        cta.setDni(sc.next());
                        cta.getDni();
                    }
                    case 2 ->{
                        System.out.println("Ingrese su nombre: ");
                        cta.setTitular(sc.nextLine());
                        System.out.println("Ingrese su DNI: ");
                        cta.setDni(sc.next());
                        System.out.println("Indique el saldo a ingresar: ");
                        try {
                            cta.setSaldo(sc.nextDouble());
                        }catch (Exception e){
                            System.out.println("El dato ingresado no es correcto");
                        }
                    }
                    case 3 ->{
                        System.out.println("Indique el saldo a ingresar: ");
                        try {
                            cta.setSaldo(sc.nextDouble());
                        }catch (Exception e){
                            System.out.println("El dato ingresado no es correcto");
                        }
                    }
                    case 4 ->{
                        System.out.println("Indique el saldo a retirar: ");
                        try {
                            cta.retirarSaldo(sc.nextDouble());
                        }catch (Exception e){
                            System.out.println("El dato ingresado es incorrecto");
                        }
                    }
                    case 5 ->{
                        System.out.println(cta.toString());
                    }
                    case 6 ->{
                        System.out.println("Saliendo.... ¡Hasta pronto!");
                    }
                    default ->{
                        System.out.println("Opción no válida");
                    }
                }
            }catch (Exception e){
                System.out.println("Opción no válida");
                //limpiar el buffer
                sc.next();
            }
        }while(opcion!=6);
    }
}