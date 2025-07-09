public enum TipoRefresco {
    //Creamos los enums con sus respectivos precios.
    COCA_COLA (2.80),
    PEPSI (2.50),
    FANTA_NARANJA (2.80),
    SPRITE (2.50),
    AQUARIUS_LIMON (2.25),
    NESTEA (2.50);

    //Creamos el atributo precio y su metodo constructor.
    private double precio;
    TipoRefresco(double precio) {
        this.precio = precio;
    }
    //Creamos el metodo Getter.
    public double getPrecio() {
        return precio;
    }
}
