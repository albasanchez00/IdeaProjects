public class Caracol extends Animales {
    String ubicacion;

    public Caracol(double peso, double altura, int edad, String ubicacion) {
        super(peso, altura, edad);
        this.ubicacion = ubicacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void mostrarUbicacion(){
        System.out.println("Ubicacion: "+this.ubicacion);
    }
}
