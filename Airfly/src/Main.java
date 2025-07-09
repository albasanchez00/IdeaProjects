/* Actividad. La aerolínea Airfly necesita un sistema básico para gestionar su personal y flota de avuibes.
* Se requiere desarrollar una aplicación en Java que contemple lo siguiente
1. Gestión de Personal
    - Implementar una clase Empleado con atributos como nombre, ID y departamento.
    - Crear objetos de tipo Empleado con diferentes datos y mostrarlos en pantalla.

2. Gestión de Flota de Aviones
    - Implementar una clase Avion con atributos como matrícula, modelo y capacidad de pasajeros.
    - Crear objetos de tipo Avion con diferentes datos y mostrarlos en pantalla.

3. Programa Principal (Main)
    - En la clase Main, instanciar al menos tres empleados y dos aviones.

Mostrar en pantalla la información de cada objeto utilizando System.out.println().
*/
public class Main {
    public static void main(String[] args) {
        Personal empleado1 =new Personal("Juan","Personal de Aire",1);
        System.out.println("Información del Personal");
        System.out.println("Nombre: "+ empleado1.getNombre());
        System.out.println("Departamento: "+ empleado1.getDepartamento());
        System.out.println("Id: "+ empleado1.getId());

        Personal empleado2 =new Personal("María","Personal de Tierra",2);
        System.out.println("\nNombre: "+ empleado2.getNombre());
        System.out.println("Departamento: "+ empleado2.getDepartamento());
        System.out.println("Id: "+ empleado2.getId());

        Personal empleado3 =new Personal("Pablo","Personal de Tierra",3);
        System.out.println("\nNombre: "+ empleado3.getNombre());
        System.out.println("Departamento: "+ empleado3.getDepartamento());
        System.out.println("Id: "+ empleado3.getId());

        /**/
        FlotaAvion avion1 =new FlotaAvion("L-14","EC-AAP",250);
        System.out.println("\nInformación de Aviones");
        System.out.println("Modelo: "+ avion1.getModelo());
        System.out.println("Matrícula: "+ avion1.getMatricula());
        System.out.println("Capacidad: "+ avion1.getCapacidad());
        System.out.println("Id: "+ avion1.getIdA());


        FlotaAvion avion2 =new FlotaAvion("W-2","EC-AA8",178);
        System.out.println("\nModelo: "+ avion2.getModelo());
        System.out.println("Matrícula: "+ avion2.getMatricula());
        System.out.println("Capacidad: "+ avion2.getCapacidad());
        System.out.println("Id: "+ avion2.getIdA());

    }
}