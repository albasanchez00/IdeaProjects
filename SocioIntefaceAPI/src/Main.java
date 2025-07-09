import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        crearSocios();
    }

    public static void crearSocios() {
        Socio s1=new Socio(4,"Manuel","14/10/2009");
        Socio s2=new Socio(1,"Laura","02/12/1989");
        Socio s3=new Socio(0,"Julian","21/04/1995");
        Socio s4=new Socio(2,"Maria","04/08/1999");
        Socio s5=new Socio(3,"Sergio","12/02/1983");

        System.out.println(s1.compareTo(s2));
        System.out.println(s3);
        ArrayList<Socio> socios=new ArrayList<Socio>();
        socios.add(s1);
        socios.add(s2);
        socios.add(s3);
        socios.add(s4);
        socios.add(s5);
        System.out.println(socios);
        for (Socio o:socios){
            System.out.println(o);
        }
        Collections.sort(socios);


        System.out.println("********** Socios ordenador por ID **********");
        for (Socio s:socios){
            System.out.println(s);
        }


        //Mostrar con el método Comparator por ID
        OrdenarId oID=new OrdenarId(); //Enviamos a ordenar utilizando esta interface
        //Mostramos por pantalla
        Collections.sort(socios,oID);
        System.out.print("\n********** Socios ordenador por ID **********");
        for (Socio o:socios){
            System.out.println(o);
        }

        System.out.println("\n********** Socios ordenador por Edades **********");
        OrdenarEdades oEdad=new OrdenarEdades();
        //Para ordenar de forma inversa al metodo natural (mayor-menor)
        Collections.sort(socios,oEdad.reversed());
        for (Socio o:socios){
            System.out.println(o);
        }

    }



}