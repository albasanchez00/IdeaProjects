public class FlotaAvion {
    String modelo;
    String matricula;
    int capacidad;
    static int Id=0; //de la clase
    int idA;
    public FlotaAvion(String modelo, String matricula, int capacidad) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.capacidad = capacidad;
        this.idA=++Id;
    }

    public FlotaAvion(String matricula) {
        this.matricula = matricula;
        this.idA=++Id;
    }
    public FlotaAvion() {
        this.idA=++Id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getIdA() {
        return idA;
    }

    public void setIdA(int idA) {
        this.idA = idA;
    }

    @Override
    public String toString() {
        return "Modelo="+modelo+
                "\nMatrícula="+matricula+
                "\nCapacidad="+capacidad+
                "\nID:"+idA;
    }
}
