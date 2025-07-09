public class ConversionTipos {
    public static void main(String[] args) {
        // Ensanchamiento de la variable.
        int numero1=5500;
        double numero2=numero1;
        double numero3=856.54;
        //Truncar -> Quitar los decimales si es posible.
        numero1=(int)numero3;
        System.out.println(numero1);

        // Casting de tipo
        double numero4=numero2+(double)numero1; // Al estar truncado devolvera 856.0 y no 856.54
        System.out.println(numero4);


        /* Precedencias de las Operaciones Matemáticas
            *  Postfijo-> exp ++ y exp --
            *  Prefijo -> ++ exp y -- exp
            *  Aritméticos -> * / y %
            *  Aritméticos -> + y -
            *  Relacionales -> < <= y > >=
            *  Comparación -> == y !=
            *  And Lógico -> &&
            *  Or Lógico -> ||
            *  Ternario -> ? :
            *  Asignación -> += -= *= /= %=
            *
            * Ejemplo:
                int precedencia = 2+3*4; //-> 14
                int precedencia = (2+3)*4; //-> 20

                boolean logica = 1>2 && 2>3 //-> falso
        */

        // Operador Ternario
        int precedencia=(2+3)*4;
        int valor= precedencia>4?1:2;
        String otroValor=precedencia>4?"Es mayor que 4":"Es menor que 4";
        System.out.println("Una evaluacion la puedo hacr aquí -> " + (precedencia>4?"Es mayor que 4":"Es menor que 4"));
        


    }
}
