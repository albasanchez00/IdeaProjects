public interface Aumento {
    double sueldo=0;

    static double aumentarSueldo(double sueldo){
        sueldo+=sueldo;
        return sueldo;
    }



}
