public enum TipoIVA {
    IVAG(21),IVAR(4),IVASR(1),IVAV(40),IVA_A(10);

    TipoIVA(double pIva){
        this.pIva=pIva;
    }

    private double pIva;

    //Método getter
    public double getpIva() {
        double pIvaR=(this.pIva/100)+1;
        return pIvaR;
    }

    public double ivaJuego() {
        double pIvaJ=this.pIva/100;
        return pIvaJ;
    }
}
