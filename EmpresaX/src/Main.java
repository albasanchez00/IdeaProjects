
/* Actividdad. En una empresa llamada X se necesita implementar una aplicación que controle y los anunciantes,
la empresa tiene:
- Sede principal y otras extendidas por toda España (Ciudad Real, Madrid, Toledo, Albacete, Cuenca)-> enum()
- Por lo cual, también tiene empleados en cada sucursal. Los datos de los empleados son (Nombre, Apellido, Sucursal, DNI, Sueldo, Edad)
- Los datos de los subscriptores son email, teléfono, nombre, apellidos y edad.
- Anunciantes que tienen los datos de teléfono, dirección, nombre de la empresa.

*

La clase principal....
* ULM



*/

import modelos2.Anunciantes;
import modelos2.Empleados;
import modelos2.Persona;
import modelos2.Sucursales;

public class Main {
    public static void main(String[] args) {

        Empleados empleado = new Empleados("Julio","Lopez",30, "06331960Z",1.856, Empleados.Sucursales.MADRID);
        System.out.println("\n******\n"+empleado);


    }
}