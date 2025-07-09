public class SintonizadorFM {
    //La frecuencia se incrementará de 0.5 a 0.5
    private double frecuencia;

    public SintonizadorFM(double frecuencia) {
        //Debe estar comprendida entre 80 Mhz y 108 Mhz
        if (frecuencia < 80) {
            this.frecuencia = 108;
        }else if (frecuencia > 108) {
            this.frecuencia = 80;
        }else {
            this.frecuencia = frecuencia;
        }
    }

    //Método para comprobar la frecuencia
    public void comprobarFrecuencia() {
        if (frecuencia < 80) {
            this.frecuencia = 108;
        }else if (frecuencia > 108) {
            this.frecuencia = 80;
        }else {
            this.frecuencia = frecuencia;
        }
    }

    //Método para bajar de frecuencia.
    public double bajarFrecuencia() {
        this.frecuencia -= 0.5;
        comprobarFrecuencia();
        return this.frecuencia;
    }
    //Método para subir de frecuencia.
    public double subirFrecuencia() {
        this.frecuencia += 0.5;
        comprobarFrecuencia();
        return this.frecuencia;
    }

    //Método para mostrar la frecuencia
    public void mostrarFrecuencia() {
        System.out.println("Sincronizando.... " + frecuencia + " Mhz");
    }
}
