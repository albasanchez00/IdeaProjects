import java.util.Scanner;

public class Bombilla {
    static public boolean interruptorGeneral=true;
    private boolean interruptor;

    //Constructor vacío, para crear el objeto bombilla en estado apagado.
    public Bombilla() {this.interruptor=false;}

    //Método que enciende o apaga según cómo este el interruptor.
    public void encenderApagar() {
        if (this.interruptor) {
            this.interruptor=false;
        }else {
            this.interruptor=true;
        }
    }

    //Método para cambiar de estado.
    public boolean estado() {
        return interruptorGeneral && this.interruptor;
    }

    //Método para mostrar el estado.
    public String mostrarEstado() {
        return estado()?" Encendido ":" Apagado ";
    }
}
