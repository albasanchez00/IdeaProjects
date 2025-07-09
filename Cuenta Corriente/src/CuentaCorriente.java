import java.util.Scanner;

/* Operaciones a realizar:
    - Crear una cuenta y para ello solicitar el DNI y titular, el saldo se inicializa en 0.
    - Sacar dinero, para ello debes comprobar que hay saldo.
    - Ingresar dinero, sumarle al saldo el nuevo importe insertado.

* Sobre cargar los métodos constructores, para poder crear objetos a partir del dni, sin nombre y saldo.
* Más otro método constructor con dni, titular y saldo.

* Siguiente cambio: Agregar un atributo estático del nombreBanco...
*/
public class CuentaCorriente {
    private String titular;
    private String dni;
    private double saldo;
    static String nombreBanco="Banco P.S.I";

    /* Método constructor */
    public CuentaCorriente(String titular, String dni) {
        this.titular = titular;
        this.dni = dni;
        this.saldo = 0; //Se crea en la cuenta
        this.nombreBanco = nombreBanco;
    }

    public CuentaCorriente() {
    }

    public CuentaCorriente(String titular, String dni, double saldo) {
        this.titular = titular;
        this.dni = dni;
        this.saldo = saldo;
    }

    /* Métodos Getter y Setter */
    public static String getNombreBanco() {
        return nombreBanco;
    }

    public static void setNombreBanco(String nombreBanco) {
        CuentaCorriente.nombreBanco = nombreBanco;
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        //Validar que no esté vacío y no contenga números
        //Validar que no esté vacío y no contenga números
        boolean valido = true;
        for (int i = 0; i < this.titular.length(); i++) {
            char letra=titular.charAt(i);
            if (Character.isDigit(letra)) {
                valido = false;
                break;
            }
        }
        while (titular.isEmpty() || !valido) {
            System.out.println("El nobre no es  valido");
            titular=new Scanner(System.in).nextLine();
            valido=true;
            for (int i = 0; i < this.titular.length(); i++) {
                char letra=titular.charAt(i);
                if (Character.isDigit(letra)) {
                    valido = false;
                    break;
                }
            }
        }
        this.titular = titular;
    }

    public String setDni(String dni) {
        //Validar si el dni es correcto
        String letraDni="TRWAGMYFPDXBNJZSQVHLCKE";
        if (dni.length()==9) {
            char l=dni.charAt(dni.length()-1);
            String numerosDni=dni.substring(0,dni.length()-1);
            int n=Integer.parseInt(numerosDni)%23;
            if (letraDni.charAt(n)==l) {
                this.dni=numerosDni;
            }else  {
                System.out.println("El DNI ingresado es incorrecto");
            }
        }else {
            System.out.println("El DNI ingresado es incorrecto, debe tener 8 dígitos y 1 letra");
        }
        return dni;
    }

    public String getDni() {
        return dni;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            System.out.println("No se puede ingresar un saldo negativo");
        }else {
            this.saldo += saldo;
        }
    }

    public double getSaldo() {
        return saldo;
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
