

public class Perro extends Animales implements Sonido {

    private String raza;


    public Perro(double peso, double altura, int edad, String raza) {
        super(peso, altura, edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void voz() {
        System.out.println("guauguau");
    }

    public void mostrarRaza(){ //Metodo Getter
        System.out.println("Raza del perro: "+this.raza);
    }


}
