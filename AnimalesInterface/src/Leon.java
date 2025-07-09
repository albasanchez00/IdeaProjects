public class Leon extends Animales implements Sonido{
    public Leon(double peso, double altura, int edad) {
        super(peso, altura, edad);
    }

    @Override
    public void voz() {
        System.out.println("Gruuuu");
    }
    //Reimplementar en una subclase un método de la interfaz
    @Override
    public void durmiendo() {
        System.out.println("guuuuu");
    }
}
