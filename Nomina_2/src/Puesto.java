public enum Puesto {
    AGENTE_SERVICIO("001"), EMPLEADO_OFICINA("002"), DIRECTIVO("003");

    String codigo;
    //Método para acceder a los valores del ENUM
    Puesto(String codigo) {
        this.codigo = codigo;
    }
    public static Puesto getPuesto(String codigo) {
        for (Puesto p : Puesto.values()) {
            if (p.codigo.equals(codigo)) {
                return p;
            }
        }
        return null;
    }
    //Getter y Setter
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


}
