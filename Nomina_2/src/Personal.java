/* Clase Personal
* Atributos
    - nombre, apellidos -> Tipo Texto (String)
    - id, numHijos -> Tipo Entero (int)
    - puesto Puesto (enum)
    - idIncremento -> Tipo Entero


*/

public class Personal {
    private String nombre, apellido;
    static int idGeneral=0; //Solo se puede llamar en la clase y no se puede crear instancia en un objeto
    private int numHijos;
    public Puesto puestoE;
    private int idEmpleado=0; //Se instancia con cada objeto de la clase


    //Método Constructor
    public Personal(String nombre, String apellido, int numHijos, String puestoE) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numHijos = numHijos;
        this.puestoE = Puesto.getPuesto(puestoE);
        this.idEmpleado = ++idGeneral;
    }


    //Métodos Getter y Setter
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumHijos() {
        return numHijos;
    }
    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

    public Puesto getPuestoE() {
        return puestoE;
    }

    public void setPuestoE(Puesto puestoE) {
        this.puestoE = puestoE;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    @Override
    public String toString() {
        return "\nPersonal:" +
                "\nNombre → " + nombre +
                "\nApellido → " + apellido +
                "\nNª de Hijos → " + numHijos +
                "\nPuesto de trabajo → " + puestoE +
                "\nId Empleado → " + idEmpleado;
    }
}
