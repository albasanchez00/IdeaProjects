public class Persona {
    //Definición de los atributos de la Clase...
    String nombre; //Ámbito de clases:
    byte edad;
    double estatura;
    static String empresa="Los tres hermanos, S.L."; //parecido a constantes (final),
    // la diferencia es que puede ser cambiado... para mostrarlo o cambiarlo, se llama a la clase
    // no a la instancia de un objeto.

    /* Declarar un valor static de id que se incremente según los objetos sean instanciados a la clase */
    static int Id=0; //de la clase
    int id0;


    //Métodos constructores (únicamente recibe datos, no devuelve nada).
    public Persona(String nombrePersona, byte edad, double estatura) {
        this.nombre = nombrePersona;
        this.edad = edad;
        this.estatura = estatura;
        this.id0=++Id;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        this.id0=++Id;
    }

    public Persona() {
        this.id0=++Id;
    }


    //Son métodos que siempre se crearan dentro de la clase.
    //Métodos no estáticos, porque la clase no es estática (static).
    void mostrarNombre(){
        System.out.println("Nombre: "+nombre);
    }

    //Métodos → Comportamientos o acciones de la clase.
    //Método Getter.
    public String getNombre() {
        return nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public double getEstatura() {
        return estatura;
    }


    //Método Setter, me permiten asignar o actualizaar valores.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    //Ejemplo de los ámbitos de los atributos y las variables...
    double crecer(double estatura){
        double aumento=this.estatura+estatura; //variable de método
        if(aumento>this.estatura){
            String mensaje="El valor del aumento de estatura no es correcto";//variable de bloque
            aumento=this.estatura;
        }
        return aumento;
    }

    //Ultimo método → toString → recomiendo formaterarlo...
    @Override
    public String toString() {
        return "ID: "+id0+
                "\nNombre="+nombre+
                "\nEdad="+edad+
                "\nEstatura="+estatura;
    }
}
