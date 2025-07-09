public abstract class CalcularArea extends FormaGeometrica {
    protected double area;
    public CalcularArea(double altura, double base, double area) {
        super(altura, base);
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = base*altura;
    }

    public void mostrarArea(){
        System.out.println("Area: " + this.area);
    }
}
