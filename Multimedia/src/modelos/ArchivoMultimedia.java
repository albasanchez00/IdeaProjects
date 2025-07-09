package modelos;

public class ArchivoMultimedia {
    private String nombre;
    public enum Formato {
        MP4, MOV, AVI , MP3, M4A, WAV, PNG, JPG, GIF
    }
    private Formato formato;
    private double tamanio;
    private String fechaCreacion;

    public ArchivoMultimedia(String nombre, Formato formato, double tamanio, String fechaCreacion) {
        this.nombre = nombre;
        this.formato = formato;
        this.tamanio = tamanio;
        this.fechaCreacion = fechaCreacion;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Formato getFormato() {
        return formato;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public String toString() {
        return "ArchivoMultimedia{" +
                "\nNombre → " + nombre +
                "\nFormato → " + formato +
                "\nTamaño → " + tamanio +
                "\nFecha Creacion → " + fechaCreacion;
    }
}
