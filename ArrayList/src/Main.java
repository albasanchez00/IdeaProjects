import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        explicaionAL();
    }


    // Explicación de ArrayList
    public static void explicaionAL() {
        //Como se declara un ArrayList
        ArrayList<String> listaAlumnos = new ArrayList<>();
        listaAlumnos.add("JuanMa");
        listaAlumnos.add("Alba");
        listaAlumnos.add("Raul");
        listaAlumnos.add("Fran");
        listaAlumnos.add("Sandra");
        listaAlumnos.add("Laura");

        System.out.println("Lista de Alumnos: " + listaAlumnos);

        for (String alumno : listaAlumnos) {
            System.out.println("Nombre: " + alumno.toUpperCase());
        }

        //Borrar un elemento
        String alumnoBorrado=listaAlumnos.remove(1);
        System.out.println(alumnoBorrado+" ha sido elimnad@ de la lista");
        System.out.println("Lista Actualizada: " + listaAlumnos);

        //Entras a la longitud de una ArrayList.size()
        for(int i=0; i< listaAlumnos.size(); i++){
            System.out.println("["+ i + "] " + listaAlumnos.get(i));
        }

        //Modificar un elemento indicando indice y elemento
        listaAlumnos.set(3,"Arturo");
        System.out.println("Lista actualizada: " + listaAlumnos);

        //Concer la longitud del Array
        int longitud = listaAlumnos.size();
        System.out.println("Nº de alumnos en la lista: " + longitud);
        Collections.sort(listaAlumnos); //Modifica la lista y la ordena en un orden natural (segun la tabla ASCII)
        System.out.println("Alumnos: " + listaAlumnos);

        //Ejemplo de busqueda manual en un ArrayList
        for(int i=0; i< listaAlumnos.size(); i++){
            if (listaAlumnos.get(i).equals("Arturo")){
                listaAlumnos.remove(i);//Borramos a Arturo
            }
        }
        System.out.println("Lista actualizada: " + listaAlumnos);

        //Buscar un elemento en el ArrayList y me indica true/false
        boolean busqueda = listaAlumnos.contains("Raul");
        System.out.println("¿Existe Raul?\n"+busqueda);

        //Buscar la primera ocurrencia de algún parámetro y que te devuelva el indice
        int indice = listaAlumnos.indexOf("Raul");
        System.out.println("\nSandra existe con el indice → "+indice);

        //Elimina todo el contenido del ArrayList
        listaAlumnos.clear();
        System.out.println("\nLista actualizada: " + listaAlumnos);
        boolean vacio=listaAlumnos.isEmpty();
        System.out.println("\n¿Está vacía la lista?\n"+vacio);

        //Podemos cambiar el orden de los datos, pero no introducir nuevos dentro de un array ya creado
        listaAlumnos.add("JuanMa");
        listaAlumnos.add("Alba");
        listaAlumnos.add("Raul");
        listaAlumnos.add("Fran");
        listaAlumnos.add(1,"Sandra");
        listaAlumnos.add("Laura");
        System.out.println("\nLista con indice cambiado: " + listaAlumnos);

        //Copiar o clonar el Array
        ArrayList <String> listaAlumnos2 = (ArrayList)listaAlumnos.clone();
        Collections.sort(listaAlumnos2);
        System.out.println("\nLista 2 de alumnos: " + listaAlumnos2);
        System.out.println();
        for (String alumno2 : listaAlumnos2){
            System.out.println("Lista de alumnos2: "+alumno2);
        }
    }
}