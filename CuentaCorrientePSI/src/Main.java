
/* Enunciado. Diseña una clase Cuenta Corriente que almacene el 'NOMBRE', 'DNI' y 'SALDO' del titular
* Operaciones a realizar:
    - Crear una cuenta y para ello solicitar el DNI y titular, el saldo se inicializa en 0.
    - Sacar dinero, para ello debes comprobar que hay saldo.
    - Ingresar dinero, sumarle al saldo el nuevo importe insertado.
*/

import java.util.Scanner;

public class Main {
    static void menu(){
        Scanner sc = new Scanner(System.in);
        int opcion=0;
        //Creamos el objeto
        CuentaCorriente cta=new CuentaCorriente();

        do {
            System.out.println("|******** Cuenta Bancaria ********|");
            System.out.println("|******** 1. Crear Cuenta ********|");
            System.out.println("|******** 2. Ingresar Saldo ********|");
            System.out.println("|******** 3. Retirar Saldo ********|");
            System.out.println("|******** 4. Mostrar Datos ********|");
            System.out.println("|******** 5. Salir ********|");
            try {
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1 ->{
                        System.out.println("Ingrese su nombre: ");
                        cta.setTitular(sc.nextLine());
                        System.out.println("Ingrese su DNI: ");
                        cta.setDni(sc.nextLine());
                    }
                    case 2 ->{
                        System.out.println("Indique el saldo a ingresar: ");
                        try {
                            cta.setSaldo(sc.nextDouble());
                        }catch (Exception e){
                            System.out.println("El dato ingresado no es correcto");
                        }
                    }
                    case 3 ->{
                        System.out.println("Indique el saldo a retirar: ");
                        try {
                            cta.retirarSaldo(sc.nextDouble());
                        }catch (Exception e){
                            System.out.println("El dato ingresado es incorrecto");
                        }
                    }
                    case 4 ->{
                        System.out.println(cta.toString());
                    }
                    case 5 ->{
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
        }while(opcion!=5);

    }
}