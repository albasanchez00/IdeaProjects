public class Refrescos {
    //Creamos el atributo tipoRefresco.
    private TipoRefresco tipoRefresco;

    //Creamos el constructor que recibe un tipo de refresco.
    public Refrescos(TipoRefresco tipoRefresco) {
        this.tipoRefresco = tipoRefresco;
    }

    //Creamos los métodos Getter y Setter.
    public TipoRefresco getTipoRefresco() {
        return tipoRefresco;
    }
    public double getPrecio() {
        return tipoRefresco.getPrecio();
    }

    //Creamos el método toString() que muestra el tipo de refresco seleccionado.
    @Override
    public String toString() {
        return "\nRefresco:" +
                "\nTipo del Refresco → " + tipoRefresco;
    }


}
