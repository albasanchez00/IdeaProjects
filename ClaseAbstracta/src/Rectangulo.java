public class Rectangulo extends FormaGeometrica{
    protected double area;

    public Rectangulo(double altura, double base) {
        super(altura, base);
        this.area = area;
    }

    @Override
    protected void Calcular(Double altura, double base) {
        area = area * altura;
    }


    @Override
    public String toString() {
        return super.toString()+ "Rectangulo{" +
                "area=" + area +
                '}';
    }
}
