package modelos;

public class Imagen extends ArchivoMultimedia {
    private String resolucion;
    private int canalColor;
    private String tasaBits;

    public Imagen(String nombre, Formato formato, double tamanio, String fechaCreacion, String resolucion, int canalColor, String tasaBits) {
        super(nombre, formato, tamanio, fechaCreacion);
        this.resolucion = resolucion;
        this.canalColor = canalColor;
        this.tasaBits = tasaBits;
    }

    public Imagen(String nombre, Formato formato, double tamanio, String fechaCreacion) {
        super(nombre, formato, tamanio, fechaCreacion);
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public int getCanalColor() {
        return canalColor;
    }

    public void setCanalColor(int canalColor) {
        this.canalColor = canalColor;
    }

    public String getTasaBits() {
        return tasaBits;
    }

    public void setTasaBits(String tasaBits) {
        this.tasaBits = tasaBits;
    }

    @Override
    public String toString() {
        return super.toString()+"\nImagen:" +
                "\nResolucion → " + resolucion +
                "\nCanal de Colores → " + canalColor +
                "\nTasa de Bits → " + tasaBits;
    }
}


