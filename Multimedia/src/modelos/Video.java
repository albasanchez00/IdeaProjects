package modelos;

public class Video extends ArchivoMultimedia{
    private String duracion;
    private String fotogramas;
    private String resolucion;


    public Video(String nombre, Formato formato, double tamanio, String fechaCreacion, String duracion, String fotogramas, String resolucion) {
        super(nombre, formato, tamanio, fechaCreacion);
        this.duracion = duracion;
        this.fotogramas = fotogramas;
        this.resolucion = resolucion;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getFotogramas() {
        return fotogramas;
    }

    public void setFotogramas(String fotogramas) {
        this.fotogramas = fotogramas;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    @Override
    public String toString() {
        return super.toString()+"\nVideo" +
                "\nDuracion → " + duracion +
                "\nFotogramas → " + fotogramas +
                "\nResolucion → " + resolucion;
    }
}
