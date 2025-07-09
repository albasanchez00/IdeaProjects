public class Mesas {
    private NumeroMesa nMesa;
    private ZonaMesa zMesa;

    public Mesas(NumeroMesa nMesa, ZonaMesa zMesa) {
        this.nMesa = nMesa;
        this.zMesa = zMesa;
    }

    public NumeroMesa getnMesa() {
        return nMesa;
    }

    public void setnMesa(NumeroMesa nMesa) {
        this.nMesa = nMesa;
    }

    public ZonaMesa getzMesa() {
        return zMesa;
    }

    public void setzMesa(ZonaMesa zMesa) {
        this.zMesa = zMesa;
    }

    @Override
    public String toString() {
        return "Mesas:" +
                "\nNumero de Mesa → " + nMesa +
                "\nZona de Mesa → " + zMesa;
    }
}
