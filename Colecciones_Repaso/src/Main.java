/*
* Las colecciones son parte de un framework de JAVA llamada Colections. Lo que permite agrupar objetos
* dentro de un conjutnos
*
* List → No ordenadas y permiten duplicados → ArrayList
* Set → No permitir duplicados
*
* ArrayList → Metodos que perimiten remover (remove), cambiar (set), agregar (add)
* C    - add
* R    - recorrido con un foreach normal... iterator
* U    - set
* D    - remove
*
* CRUD (CREATE READ UPDATE DELETE) → OPERACIONES BÁSICAS EN ESTRUCTURAS DE DATOS
*
* Objetos pueden ser de una clase que tú como programador creas o puede ser una clase por ejemplo tipo
* wrappers:
* Integer, Double, Character, String, Byte...etc...
*
* Ejemplo Tipo Wrapper → En este ejemplo se crea una estructura dinámica de tipo ArrayList con 10 num aleatorios
        ArrayList<Integer> lista = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            lista.add((int)(Math.random() * 100));
        }
        JOptionPane.showMessageDialog(null, lista.toString());
*/


import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        menu();

        //Crea una función menu, donde las operaciones de CRUD

    }

    private static ArrayList<Coche> coches = new ArrayList<Coche>();

    public static void menu(){
        int opcion = 0;
        String opcionString;
        do {
            opcionString = JOptionPane.showInputDialog(null, """
                Menu Concesionario:
                1. Crear Coche
                2. Actualizar Coche
                3. Eliminar Coche
                4. Listar Coches
                5. Mostrar Detalles por Id
                6. Colección Coches
                7. Salir""");

            try {
                opcion = Integer.parseInt(opcionString);
                switch (opcion){
                    case 1,2->altaModifCoche(opcion);
                    case 3-> eliminarCoche();
                    case 4->{
                        JOptionPane.showMessageDialog(null, mostrarListado());
                    }
                    case 5->{
                        Coche x=buscarCoche();
                        JOptionPane.showMessageDialog(null, x);
                        menu();
                    }

                    case 6 ->{
                        ArrayList <Coche> ordenarMarca = new ArrayList<>(coches);
                        Collections.sort(ordenarMarca);
                        JOptionPane.showMessageDialog(null, ordenarMarca);
                    }

                    case 7->JOptionPane.showMessageDialog(null, "Hasta Luego");
                    default->JOptionPane.showMessageDialog(null, "Opción no valida");

                }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Opción no valida");
            }
        }while (opcion<5);
    }

    public static void altaModifCoche(int opcion){
        //Si se va a leer los mismos datos tanto en el alta como en la modificacion, creamos las varaible fuera de la condicional
        Marcas marca;
        String modelo="",color="",matricula="", anioS="", kmString="";
        int anio=0;
        double kilometraje=0;
        if (opcion==1){ // -> Alta Coche
            marca= solicitarMarca();
            modelo=solicitarModelo();
            color=solicitarColor();
            matricula=solicitarMatricula();
            anio=solicitarAnio();
            kilometraje=solicitarKm();
            if (!marca.toString().isEmpty() && !modelo.isEmpty() && !color.isEmpty() && !matricula.isEmpty() && anio>0 && kilometraje>0){
                Coche nuevo = new Coche(marca, modelo, color, matricula, anio, kilometraje);
                //Creado el objeto Coche, lo inserto en la lista
                coches.add(nuevo);
            }else {
                JOptionPane.showMessageDialog(null, "Alguno de los datos introducidos no son válidos");
            }
        }else{ //Modificación
            //Preguntar que ID quieres modificar -> Recorrer ArrayList con el Iterator, identifica el objeto
            String identificarCoche=JOptionPane.showInputDialog(null,"Ingrese el id del coche: ");
            String modificarId=JOptionPane.showInputDialog(null,"Ingrese el id del coche: ");
            int idCoheModificar =Integer.parseInt(modificarId);
            boolean flag=false;
            Iterator <Coche> iterator= coches.iterator();
            while (iterator.hasNext()){
                Coche coche=iterator.next();
                if (coche.getIdCoche()== idCoheModificar){
                    String datoModificar=JOptionPane.showInputDialog(null, """
                            Indique el dato a modificar: 
                            1. Marca
                            2. Modelo
                            3. Color
                            4. Matricula
                            5. Año fabricación
                            6. Kilometraje""");
                    try {
                        int datoModificarInt=Integer.parseInt(datoModificar);
                        switch (datoModificarInt){
                            case 1->coche.setMarca(solicitarMarca());
                            case 2->coche.setModelo(solicitarModelo());
                            case 3->coche.setColor(solicitarColor());
                            case 4->coche.setMatricula(solicitarMatricula());
                            case 5->coche.setAnio(solicitarAnio());
                            case 6->coche.setKilometraje(solicitarKm());
                            default->JOptionPane.showMessageDialog(null,"Opción no válida");
                        }
                    }catch (Exception e){
                        JOptionPane.showMessageDialog(null,"Error al ingresar el valor");
                    }
                }
            }
        }
    }

    public static Coche buscarCoche(){
        String identificarS =JOptionPane.showInputDialog(null, "Ingrese el id del coche: ");
        int idCoheBuscar =Integer.parseInt(identificarS);
        boolean flag=false;
        Coche enviarCoche=null;
        Iterator <Coche> iterator= coches.iterator();
        while (iterator.hasNext()){
            Coche coche=iterator.next();
            if (coche.getIdCoche()== idCoheBuscar){
                enviarCoche=iterator.next();
                flag=true;
            }
        }
        if (!flag){
            enviarCoche=null;
        }
        return enviarCoche;
    }

    public static void eliminarCoche(){
        String identificarS =JOptionPane.showInputDialog(null,mostrarListado() + "Ingrese el id del coche: ");
        int idModificar =Integer.parseInt(identificarS);
        boolean flag=false;
        Iterator <Coche> iterator = coches.iterator();
        while (iterator.hasNext()){
            Coche coche=iterator.next();
            if (coche.getIdCoche()== idModificar){
                flag=true;
                iterator.remove();
            }
        }
        if (!flag){
            JOptionPane.showMessageDialog(null,"No se encontró el Id del coche");
        }
    }

    public static String mostrarListado(){
        String cocheString="";
        for (Coche c : coches) {
            cocheString += c+"\n";
        }
        return cocheString;
    }

    public static Marcas solicitarMarca(){
        return (Marcas) JOptionPane.showInputDialog(null, "Seleccione la marca del coche: ","Elegir",JOptionPane.QUESTION_MESSAGE,null,Marcas.values(),Marcas.values()[0]);
    }

    public static String solicitarModelo(){
        return JOptionPane.showInputDialog(null, "Ingrese el modelo del coche: ");
    }

    public static String solicitarColor(){
        return JOptionPane.showInputDialog(null, "Ingrese el color del coche: ");
    }
    public static String solicitarMatricula(){
        return JOptionPane.showInputDialog(null, "Ingrese la matricula del coche: ");
    }
    public static int solicitarAnio(){
        int anio=0;
        String anioS = JOptionPane.showInputDialog(null, "Ingrese el año de fabricacióm: ");
        try {
            anio = Integer.parseInt(anioS);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Opcion no valida");
        }
        return anio;
    }

    public static double solicitarKm(){
        double km=0;
        String kmS =  JOptionPane.showInputDialog(null, "Indique el kilometraje: ");
        try {
            km = Double.parseDouble(kmS);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Opción no valida");
        }
        return km;
    }

}