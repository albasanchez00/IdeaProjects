package modelos2;

public class Empresa {
    private String nombreEmrpesa;
    private Sucursales sucursal;

    public Empresa(String nombreEmrpesa, Sucursales sucursal) {
        this.nombreEmrpesa = nombreEmrpesa;
        this.sucursal = sucursal;
    }

    public Empresa() {
    }

    public String getNombreEmrpesa() {
        return nombreEmrpesa;
    }

    public void setNombreEmrpesa(String nombreEmrpesa) {
        this.nombreEmrpesa = nombreEmrpesa;
    }

    public Sucursales getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursales sucursal) {
        this.sucursal = sucursal;
    }

    @Override
    public String toString() {
        return "Empresa->" +
                "\nNombre Emrpesa:" + nombreEmrpesa +
                "\nSucursal:" + sucursal;
    }
}
