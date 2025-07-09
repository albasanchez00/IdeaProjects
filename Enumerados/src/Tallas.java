public enum Tallas {
    //VALORES DE LAS CONSTANTES
    MINI("S"),MEDIANA("M"),GRANDE("L"),MUYGRANDE("XL");
    //Atributos
    private String abreviatura;

    //Creamos el método constructor
    private Tallas(String abreviatura){
        this.abreviatura=abreviatura;
    }

    //Método Getter (al ser constantes no se declara setter, ya que no cambia su valor)
    public String getAbreviatura() {
        return abreviatura;
    }

}
