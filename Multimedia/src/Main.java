import modelos.ArchivoMultimedia;
import modelos.Audio;
import modelos.Imagen;
import modelos.Video;

import java.util.Scanner;

/*Actividad. Crea un proyecto, donde se cera las clases de Audio, Video, Imagen...
* La super clase la llamamos Archivo Multimedia y analizamos que tienen en común audio,video e imagen
que hereden de multimedia

* Metodo comun, visualizar...reproducir....

* Luego, en el main, crear al menos 4 objetos de las distintas clases.
*/
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    Audio audio= new Audio("Gruñido", ArchivoMultimedia.Formato.MP3,2.989,"29/05/22","16 bits",42.560,"estereo");
    System.out.println("\n******\n"+audio);

    Video video = new Video("Peleando", ArchivoMultimedia.Formato.MP4,2.456, "01/12/23","2 minutos","120 fps","1024x720");
    System.out.println("\n******\n"+video);

    Imagen imagen = new Imagen("Gatitos", ArchivoMultimedia.Formato.JPG, 16.456, "12/12/23","1024x720", 3, "8 bits");
    System.out.println("\n******\n"+imagen);

    }
}