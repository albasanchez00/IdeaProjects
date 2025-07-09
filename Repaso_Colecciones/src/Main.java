/* Creamos una clase alumnos con los atributos:
    - Nombre
    - Apellidos
    - Curso
    - Nota Promedio →
    - Enum (Materia)
*/

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    //Creamos la colección de forma global, para que todos los métodos puedan acceder a ellos...
    static ArrayList<Alumnos> grupoAlumnos = new ArrayList();

    /* Creamos un menu con las opciones de
        - Alta
        - Baja
        - Modificacion
        - Mostrar Datos
        - CRUD
    */
    public static void  menu(){
        int opcion=0;
        String opcionString= JOptionPane.showInputDialog(null,"Ingrese la opcion: \n1. Alta \n2. Baja \n3. Modificación \n4. Mostrar \n5. Salir");
        try{
            opcion=Integer.parseInt(opcionString);
            switch(opcion){
                case 1,3 ->{
                    altaModificacion(opcion);
                }
                case 2 ->{
                    eliminar();
                }
                case 4 ->{
                    mostrar();
                }
                case 5 ->{
                    JOptionPane.showMessageDialog(null,"Saliendo...");
                    break;
                }
                default ->{
                    JOptionPane.showMessageDialog(null,"Opcion incorrecta");
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ingrese una opción valida");
        }
    }


    public static void altaModificacion(int opcion) {
        String nombre = "", apellidos="", curso="";
        double notaMedia=0;
        Alumnos.Materia materiasAlumno = null;


        //Hasta aquí
        if (opcion==1){
            nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del alumno: ");
            apellidos = JOptionPane.showInputDialog(null, "Ingrese los apellidos del alumno: ");
            curso = JOptionPane.showInputDialog(null, "Ingrese el curso del alumno: ");
            materiasAlumno = leerMateria();
            //Pasarlo desde aquí a una nueva funcion
            notaMedia = leerNota();
            Alumnos nuevo=new Alumnos(nombre,apellidos,curso,notaMedia,materiasAlumno);
            if (nuevo!=null){
                grupoAlumnos.add(nuevo);
                menu();
            }
        }
        if (opcion==3){
            String salida=mostrarAlumnos();
            String modificarId=JOptionPane.showInputDialog(null,"Ingrese el id del alumno: ");
            String queModificar=JOptionPane.showInputDialog(null,"1.Nombre \n2.Apellidos \n3.Curso \n4. Materia \n5. Nota Media");
            int opcionModificar=0;
            int idAlumnoModificar=0;
            try{
                idAlumnoModificar=Integer.parseInt(modificarId);
                opcionModificar=Integer.parseInt(queModificar);
                Iterator <Alumnos> alumnosIterator=grupoAlumnos.iterator();
                while (alumnosIterator.hasNext()){
                    Alumnos alumnos=alumnosIterator.next();
                    if (alumnos.getIdAlumno()==idAlumnoModificar){
                        switch (opcionModificar){
                            case 1 ->{
                                nombre=JOptionPane.showInputDialog(null, "Ingrese el nombre del alumno: ");
                                alumnos.setNombre(nombre);
                            }
                            case 2 ->{
                                apellidos=JOptionPane.showInputDialog(null, "Ingrese los apellidos: ");
                                alumnos.setApellidos(apellidos);
                            }
                            case 3 ->{
                                curso=JOptionPane.showInputDialog(null, "Ingrese los curso: ");
                                alumnos.setCurso(curso);
                            }
                            case 4 ->{
                                notaMedia=leerNota();
                                alumnos.setNotaPromedio(notaMedia);
                            }
                            case 5 ->{
                                materiasAlumno=leerMateria();
                                alumnos.setMateria(materiasAlumno);
                            }
                        }
                    }
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Ingrese una opcion valida");
            }
            mostrar();
        }
    }


    public static void eliminar(){
        if(!grupoAlumnos.isEmpty()){
            String salida=mostrarAlumnos();
            String idEliminar=JOptionPane.showInputDialog(null, salida+"Ingrese el id del alumno a eliminar: ");
            //iterator -> Buscamos el id y lo eliminamos
            int id;
            boolean eliminado=false;
            try{
                id=Integer.parseInt(idEliminar);
                Iterator<Alumnos> it = grupoAlumnos.iterator();
                while (it.hasNext()) {
                    Alumnos alumno = it.next();
                    if (alumno.getIdAlumno()==id) {
                        it.remove();
                        eliminado=true;
                    }
                }
                if (!eliminado) {
                    JOptionPane.showMessageDialog(null,"El id del alumno no existe");
                }
                mostrar();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Ingrese el id del alumno a eliminar");
            }
        }else {
            mostrar();
        }
    }


    public static void mostrar(){
        String salida=mostrarAlumnos();
        JOptionPane.showMessageDialog(null,salida);
        menu();
    }

    public  static String mostrarAlumnos(){
        String salida="";
        if(!grupoAlumnos.isEmpty()){
            for(Alumnos alumno:grupoAlumnos){
                salida += alumno.toString()+"\n";
            }
        }else {
            salida="No exiten alumnos que mostrar";
        }
        return salida;
    }

    public static double leerNota(){
        boolean notaMediaCorrecta = false;
        double notaMedia=0;
        do {
            String notaMediaString = JOptionPane.showInputDialog(null, "Ingrese nota media correcta");
            try {
                notaMedia=Double.parseDouble(notaMediaString);
                notaMediaCorrecta=true;
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Ingrese nota media correcta");
            }
        }while (!notaMediaCorrecta);
        return notaMedia;
    }

    public static Alumnos.Materia leerMateria(){
        Alumnos.Materia[] materias = {Alumnos.Materia.BIOLOGIA, Alumnos.Materia.LENGUA, Alumnos.Materia.METEMATICAS, Alumnos.Materia.FISICA, Alumnos.Materia.QUIMICA};
        int materiaSeleccionada = JOptionPane.showOptionDialog(null,
                        "Ingrese la materia del alumno: ",
                        "Materia",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,
                        null,
                        materias,
                        materias[0]
        );
        Alumnos.Materia materiaAlumno = materias[materiaSeleccionada];
        return materiaAlumno;
    }
}