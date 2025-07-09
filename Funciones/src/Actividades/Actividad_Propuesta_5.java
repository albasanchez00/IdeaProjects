package Actividades;
import java.util.Scanner;

/* Actividad. Mostrar los siguientes datos al uasuario
Al final mostrarlos de forma organizada en pantalla:
    1. Nombre
    2. Apellidos
    3. Telefono
    4. Dirección
    5. Email

* Luego lo mostraremos en pantalla en una sola línea, conectando los datos.
* Mediante los metodos → setter && getter -> POO
*/

public class Actividad_Propuesta_5 {
    public static void main(String[] args) {
        mostrarDatos();
    }


    /**
     * Función mediante la que definiremos la variable y mostraremos los datos ingresados.
    */
    static void mostrarDatos(){
        String nombre=leerDato("nombre");
        String apellidos=leerDato("apellidos");
        int telefono=leerDato();
        String direccion=leerDato("direccion");
        String email=leerDato("email");
        byte edad=leerNumero("edad");
        int dni=leerNumero(); // Irá a la función que no espera ningún pase de parámetros.
        System.out.println("Nombre: "+nombre+" | Apellido: "+apellidos+" | Telefono: "+telefono+
          " | Dirección: "+direccion+" | Email: "+email+" | DNI: "+dni);
    }


    /**
     * Función genérica donde se le pasa el valor que quiere leer y devuelve lo qye el usuario a introducido.
     * @param dato
     * @return
    */
    static String leerDato(String dato){
        Scanner sc=new Scanner(System.in);
        System.out.print("Indique su "+dato+" → ");
        return sc.nextLine();
    }


    /**
     * Función genérica donde se le pasa el valor que quiere leer y devuelve un número.
     * @param dato
     * @return
    */
    static byte leerNumero(String dato){
        Scanner sc=new Scanner(System.in);
        System.out.print("Indique su "+dato+" → ");
        return sc.nextByte(); // → Devuelve un número.
    }


    /**
     * Sobre carga de funciones...
     * Se puede dar el caso de llamar igual dos funciones.
     * Pero según el paso de parámertos, irá al que corresponda.
     * @return
    */
    static int leerNumero(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Indique su número de DNI (sin letra) → ");
        return sc.nextInt(); // → Devuelve un número entero.
    }


    /**
     * Otro ejemplo → Sobre carga de funciones, ejemplo con la función leerDato()
     * @return
     */
    static int leerDato(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Indique su número de teléfono → ");
        return sc.nextInt();
    }






}
