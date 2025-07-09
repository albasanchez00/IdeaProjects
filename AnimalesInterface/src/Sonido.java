public interface Sonido {
    /* Los atributos de una interfaz son constantes... */
    int version=1; //Constantes... no cambia su valor en la ejecución

    void voz(); //es abstracta por defecto

    /* Método que se implementa directamente en la interfaz... y puede ser Overiding en el método que lo implemento */
    default void durmiendo(){
        System.out.println("zzzzz");
        //Al ser DEFAULT-> EL METODO NO TIENE PORQUE SER STATIC
    }

    //Podemos crear metodos estaticos y por defecto son publicos... y solo se puede acceder a ellos mediante la interfaz
    static void bostezo(){
        System.out.println("ggggggggg");
        System.out.println(contarVoces()); //Al ser STATIC-> EL METODO DEBE SER STATIC SINO DARA ERROR
    }

    //Solo pueden acceder a un método privado desde mismo archivo...desde Sonido
    private static int contarVoces(){
        int valor=0;
        valor++;
        return valor;
    }


}
