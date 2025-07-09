/*Implementa la clase Abstracta FormaGeometrica con los atributos base y altura (tipo double)
* El metodo abstracto double calcularArea()
* Luego implementa, las clases Triángulo y Rectángulo heredando de la clase FormaGeometrica
*/

public abstract class FormaGeometrica {
    protected double altura;
    protected double base;

    public FormaGeometrica(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    protected FormaGeometrica() {
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    protected abstract void Calcular(Double altura, double base);

}
