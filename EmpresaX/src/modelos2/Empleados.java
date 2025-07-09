package modelos2;

public class Empleados extends Persona {
    private String dni;
    private double sueldo;
    public enum Sucursales {
        CIUDADREAL, ALBACETE, TOLEDO, CUENCA,MADRID
    }
    private Sucursales sucursal;

    public Empleados(String nombre, String apellido, int edad, String dni, double sueldo, Sucursales sucursal) {
        super(nombre, apellido, edad);
        this.dni = dni;
        this.sueldo = sueldo;
        this.sucursal = sucursal;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Sucursales getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursales sucursal) {
        this.sucursal = sucursal;
    }

    @Override
    public String toString() {
        return super.toString()+"\nEmpleados->" +
                "DNI:" + dni +
                "\nSueldo:" + sueldo +
                "\nSucursal:" + sucursal;
    }
}
