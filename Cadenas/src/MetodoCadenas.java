import java.util.Arrays;

public class MetodoCadenas {
    public static void main(String[] args) {
        //si dos cadenas, puedes compararlas y verificar que sean iguales
        String cadena1 = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme";
        String cadena2 = "En un lugar de la Mancha";
        boolean comparar = cadena1.equals(cadena2);
        System.out.println("¿Son iguales ambas cadenas?\n" + comparar);
        int compararNum = cadena1.compareTo(cadena2); //Devuelve 0 si son iguales
        if (compararNum == 0) {
            System.out.println("Las cadenas son iguales: " + compararNum);
        } else {
            System.out.println("Las cadenas no son iguales: " + compararNum);
        }
        compararNum = cadena1.compareToIgnoreCase(cadena2);
        String nombre1 = "Maria";
        String nombre2 = "MARIA";
        compararNum = nombre1.compareToIgnoreCase(nombre2);
        if (compararNum == 0) {
            System.out.println("Las cadenas son iguales: " + compararNum);
        }else {
            System.out.println("Las cadenas no son iguales: " + compararNum);
        }
        System.out.println();
        nombre1 = cadena1.toUpperCase(); //pasamos el nombre a mayúscula.
        nombre2 = cadena2.toLowerCase(); //pasamos el nombre a minúscula.
        comparar = cadena1.startsWith(cadena2); // startsWith() → Comienza por....
        System.out.println("Ambas cadenas comienzan iguales: " + comparar);
        comparar= cadena1.endsWith("acordarme"); // startsWith() → Comienza por....
        System.out.println("Ambas cadenas terminan iguales: " + comparar);

        String dni="06331960Z";
        comparar=dni.endsWith("Z");
        System.out.println("El dni es correcto: " + comparar);
        char letra=dni.charAt(dni.length()-1);
        System.out.println("La letra escrita es: " + letra);
        comparar=nombre1.equals(nombre2); //true - false

        String password="CEAT1234@";
        int pswdHash=password.hashCode();
        System.out.println("La hash es correcto: " + password+ " en hash es "+ pswdHash);
        String cadenaM = cadena2.toLowerCase(); //pasamos el nombre a minúscula.
        int indice=cadenaM.indexOf("m");
        System.out.println("La indice es: " + indice);
        cadena1=cadena1.replace("u","a"); //para char
        System.out.println(cadena1);
        cadena1=cadena1.replaceAll("Mancha","Marcha"); //para cadena
        System.out.println(cadena1);

        char[] letras= cadena1.toCharArray();
        System.out.println(Arrays.toString(letras));

        String[] arrayCadena=cadena1.split(",");//si no se indica el separador, crea un array por cada posición
        System.out.println(Arrays.toString(arrayCadena));


        // Actividad. Escribe un nombre y apellido, y extraeremos el apellido... Supuesto que el nombre no es compuesto.
        String nombre="Alba Sánchez";
        String[] nombreArray=nombre.split(" ");
        int indiceNombre=nombreArray.length;
        String apellido=nombreArray[1];
        System.out.println("El apellidos es: "+apellido);
        //Como convertir cualquier valor primitivo en String
        int numero=34534634;
        String numero1=String.valueOf(numero); //me devuelve el número pero en tipo String
        String booleano1=String.valueOf(true);
        String double1=String.valueOf(1123.56);
        char ultimo=numero1.charAt(numero1.length()-1);
        // si validar telefono necesita saber que tiene 9 digitos numericos....
        int telefono=926578960;
        String telefono1=String.valueOf(telefono);
        //si quieres extraer una cadena, sabiendo el indice...
        String temporal=telefono1.substring(0,1);
        System.out.println("El primer digito del nº telefono es: "+temporal);
    }
}
