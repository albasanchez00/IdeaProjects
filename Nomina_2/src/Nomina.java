public class Nomina {
    private double nHoras;
    private double tarifaHoras;
    private Personal p;
    private double salarioBruto;
    private final double D_SOCIAL = 3.46;
    private final double D_N_COMUN = 6.15;
    private final double D_SEG_MED = 0.95;
    private final double D_FONDO_P = 4.44;
    private final double D_SEG_DES = 3.05;
    private final double D_PENSION_C = 3.81;
    private final double D_JUB_ANT = 1.02;


    public Nomina(double nHoras, double tarifaHoras, Personal p) {
        this.nHoras = nHoras;
        this.tarifaHoras = tarifaHoras;
        this.p = p;
        calcularSalarioBruto();
    }

    //Métodos Getter y Setter
    public double getnHoras() {
        return nHoras;
    }
    public void setnHoras(double nHoras) {
        this.nHoras = nHoras;
    }

    public double getTarifaHoras() {
        return tarifaHoras;
    }
    public void setTarifaHoras(double tarifaHoras) {
        this.tarifaHoras = tarifaHoras;
    }

    public double calcularPrimaFamiliar() {
        double primaFamiliar=0;
        if(this.p.getNumHijos()==1){
            primaFamiliar=20;
        }else if(this.p.getNumHijos()==2){
            primaFamiliar=50;
        }else if(this.p.getNumHijos()>2){
            primaFamiliar=70+(this.p.getNumHijos()-2)*20;
        }
        return primaFamiliar;
    }

    public void calcularSalarioBruto() {
        double salarioBruto=0, horaExtras50 = 0, horaExtras60=0, horasNormales = 169;
        if(this.nHoras<169){
            salarioBruto=this.nHoras*this.tarifaHoras;
        }else if(this.nHoras<=180){
            horaExtras50=this.nHoras-horasNormales;
            salarioBruto=horasNormales*this.tarifaHoras+horaExtras50*this.tarifaHoras*1.5;
        }else {
            horaExtras50=180-horasNormales;
            horaExtras60=this.nHoras-180;
            salarioBruto=horasNormales*this.tarifaHoras+horaExtras50*this.tarifaHoras*1.5+horaExtras60*1.6;
        }
        this.salarioBruto=salarioBruto;
    }

    public double calcularDeducciones(Double porcentaje) {
        return (porcentaje/100)*this.salarioBruto;
    }

    public void mostrarNomina(){
        double salarioNeto, totalDed;
        double d_Social,d_Comun,d_PensionC,d_SegMed,d_FondoP,d_SegDes,d_JubAnt;
        System.out.println(p.toString());
        System.out.println("Salario Bruto → "+this.salarioBruto + "€");
        System.out.println("\nCalculo de Deducciones → ");

        d_Social=this.calcularDeducciones(this.D_SOCIAL);
        System.out.println("Deducción Social → "+d_Social + "€");

        d_Comun=this.calcularDeducciones(this.D_N_COMUN);
        System.out.println("Deducción Contingencias Comunes → "+d_Comun + "€");

        d_SegMed=this.calcularDeducciones(this.D_SEG_MED);
        System.out.println("Deducción Seguro Desempleo → "+d_SegMed + "€");

        d_FondoP=this.calcularDeducciones(this.D_FONDO_P);
        System.out.println("Deducción Fondo Pensiones → "+d_FondoP + "€");

        d_SegDes=this.calcularDeducciones(this.D_SEG_DES);
        System.out.println("Deducción Seguro Desempleo → "+d_SegDes + "€");

        d_PensionC=this.calcularDeducciones(this.D_PENSION_C);
        System.out.println("Deducción Pensión → "+d_PensionC + "€");

        d_JubAnt=this.calcularDeducciones(this.D_JUB_ANT);
        System.out.println("Deducción Jubilación Anticipada → "+d_JubAnt + "€");



        totalDed=d_FondoP+d_Comun+d_SegDes+d_JubAnt+d_SegMed+d_PensionC+d_Social;
        System.out.println("Deducciones totales → " + totalDed +"€");

        System.out.println("\nSalario Bruto: " + salarioBruto + "€");

        salarioNeto=this.salarioBruto-totalDed;
        System.out.println("Salario Neto: "+salarioNeto + "€");

        salarioNeto+=this.calcularPrimaFamiliar();
        System.out.println("Aumento de " + calcularPrimaFamiliar() + "€ prima familiar");
        System.out.println("Salario Neto a pagar: "+salarioNeto + "€");
    }


}
