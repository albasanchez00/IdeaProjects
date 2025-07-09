public class Animales {
    private double peso;
    private double altura;
    private int edad;

    public Animales(double peso, double altura, int edad) {
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "\nAnimales:" +
                "\nPeso → " + peso +
                "\nAltura → " + altura +
                "\nEdad → " + edad;
    }
}
