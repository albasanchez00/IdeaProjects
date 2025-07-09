package modelos;

public class Audio extends ArchivoMultimedia{
    private String bitsSegundo;
    private double frecuencia;
    public String canal;

    public Audio(String nombre, Formato formato, double tamanio, String fechaCreacion, String bitsSegundo, double frecuencia, String canal) {
        super(nombre, formato, tamanio, fechaCreacion);
        this.bitsSegundo = bitsSegundo;
        this.frecuencia = frecuencia;
        this.canal = canal;
    }

    public Audio(String nombre, Formato formato, double tamanio, String fechaCreacion) {
        super(nombre, formato, tamanio, fechaCreacion);
    }

    public String getBitsSegundo() {
        return bitsSegundo;
    }

    public void setBitsSegundo(String bitsSegundo) {
        this.bitsSegundo = bitsSegundo;
    }

    public double getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(double frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nAudio" +
                "\nBits por Segundo → " + bitsSegundo +
                "\nFrecuencia → " + frecuencia +
                "\nCanal → " + canal;
    }
}
