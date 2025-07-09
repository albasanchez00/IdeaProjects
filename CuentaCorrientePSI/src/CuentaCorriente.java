
public class CuentaCorriente {
    private String titular;
    private String dni;
    private double saldo;

    /* Método constructor */
    public CuentaCorriente(String titular, String dni) {
        this.titular = titular;
        this.dni = dni;
        this.saldo = 0; //Se crea en la cuenta
    }

    public CuentaCorriente() {
    }

    /* Métodos Getter y Setter */

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            System.out.println("No se puede ingresar un saldo negativo");
        }else {
            this.saldo += saldo;
        }
    }

    //Método Retirar Saldo → Debemos validar que tiene un saldo suficiente para poder retirar el saldo.
    public void retirarSaldo(double valor) {
        if (saldo >= valor) {
            System.out.println("Operación aprobada, puede retirar su dinero");
            this.saldo -= valor;
            System.out.println("Su saldo actual: " + this.saldo);
        }else  {
            System.out.println("Operación denegada, saldo insuficiente");
        }
    }

    @Override
    public String toString() {
        return "Datos de la Cuenta Corriente:" +
                "\nTitular → " + titular +
                "\nDNI → " + dni +
                "\nSaldo = " + saldo;
    }

}
