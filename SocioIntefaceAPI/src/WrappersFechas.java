import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

public class WrappersFechas {
    public static void main(String[] args) {

        String numero="6331960";
        try{
            int dni=Integer.parseInt(numero); //Pasa un string a Int (tipo primitivo)

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        int num=2342;
        Integer num2=Integer.valueOf(num); // Pasando un entero a la clase Integer (tipo Objeto)

        Double num3=8987.56;
        /* Porque no se instancia... */

        /* Los wrappers son de Tipo Estático (Static) → Se aplican los métodos... */
        Character num4=Character.toUpperCase('h');
        boolean esDigito=Character.isDigit(num4); // Devolverá → False
        boolean esNumero=Character.isDigit(num); // Devolverá → True

        //System.out.println(numero.charAt(15));
        
        
        /* Intenta declarar un dato tipo Byte y luego en la ejecución del programa se sobre pase
        a 127 */
        //Byte -127 a 127
        byte edad = 100;
        for (int i=0;i<70;i++){
            edad+=i;
        }
        System.out.println(edad);

        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la edad del Socio:");
        try {
            edad=sc.nextByte();
        }catch(Exception e){
            System.out.println("Edad no válida" +e);
        }

//        System.out.println("Indica el dia → ");
//        int dia=sc.nextInt();
//        System.out.println("Indica el mes → ");
//        int mes=sc.nextInt();
//        System.out.println("Indica el año → ");
//        int anio=sc.nextInt();
//        LocalDate fecha=LocalDate.of(anio,mes,dia); //Formateando una fehca a partir de datos numéricos
//        System.out.println(fecha);

//        System.out.println("Indica la fecha de nacimiento del Socio (AAAA-MM-DD) → ");
//        String fechaN=sc.next();
//        LocalDate fechaNSocio =LocalDate.parse(fechaN);
//        System.out.println("Fecha Nacimiento: "+fechaNSocio);
//
//        LocalDate fechaActual=LocalDate.now();
//        System.out.println("Fecha Actual: "+fechaActual);
//
//        //Fecha y hora actuales
//        LocalDateTime fechaHoraAc=LocalDateTime.now();
//        System.out.println("\nFecha y Hora Actual: "+fechaHoraAc);

        //De la calse localDate puedo aplicarle los métodos asociados
        LocalDate hoy=LocalDate.now();
//        int dia=hoy.getDayOfMonth();
//        System.out.println("Día: "+dia);
//        int mes=hoy.getMonthValue();
//        System.out.println("Mes: "+mes);
//        int anio=hoy.getYear();
//        System.out.println("Año: "+anio);

//        //Sumar 10 días al día de hoy
//        LocalDate diezDias=hoy.plus(10, ChronoUnit.DAYS);
//        System.out.println("Hoy más 10 días son = "+diezDias);
//
//        //Dentro de 10 años
//        LocalDate diezAnios=hoy.plus(10,ChronoUnit.YEARS);
//        System.out.println("Hoy en 10 años son = "+diezAnios);

        //Restar una fecha -> días, meses o años
        LocalDate hoyMenos5=hoy.minus(5,ChronoUnit.DAYS);
        System.out.println(hoyMenos5);
        LocalDate hoyMenosMeses=hoy.minus(5,ChronoUnit.MONTHS);
        System.out.println(hoyMenosMeses);
        LocalDate hoyMenosAnios=hoy.minus(5,ChronoUnit.YEARS);
        System.out.println(hoyMenosAnios);

        //Saber si la fecha x está en un año bisiesto
        boolean anioBisiesto=hoy.isLeapYear();
        System.out.println("¿Es bisiesto?\n"+anioBisiesto);

        //Comparar dos fechas After o Before
        LocalDate otraFecha=LocalDate.parse("2005-05-02");
        boolean antes=otraFecha.isBefore(hoy);
        System.out.println("¿"+otraFecha+" es antes que "+hoy+"?\n"+antes);
        boolean despues=otraFecha.isAfter(hoy);
        System.out.println("¿"+otraFecha+" es después que "+hoy+"?\n"+despues);

        LocalDateTime horaFecha=LocalDateTime.now();
        //Formatear una fecha -> IMPORTANTE. El mes debe ser en Mayúscula (MM)
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("EEEE', 'dd 'de' MMMM 'de' yyyy", new Locale("es", "ES"));
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Fecha (dd/MM/yyyy) -> " + horaFecha.format(formatoFecha).toUpperCase(Locale.ROOT));
        System.out.println("Hora (HH:mm:ss) -> " + horaFecha.format(formatoHora));

        int hora = horaFecha.getHour();
        int minuto = horaFecha.getMinute();
        int segundo = horaFecha.getSecond();
        System.out.println(hora + ":" + minuto + ":" + segundo);

        LocalDateTime ho3 = LocalDateTime.now();

        //HAY COSAS QUE SE REQUIERE DETENER EL TIEMPO EN LA EJECUCIÓN DE UN PROGRAMA...
        //----
        System.out.println("Hola, que tal");
        try {
            Thread.sleep(4000, 1000); //Detiene la ejecucion 400 milisegundos
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Volvemos...");




    }




}
