package modelos2;

import java.security.Principal;

public class Subscriptores extends Persona {
    private String email;
    private String telefono;

    public Subscriptores(String nombre, String apellido, int edad, String telefono, String email) {
        super(nombre, apellido, edad);
        this.telefono = telefono;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return super.toString()+"\nSubscriptores->" +
                "\nEmail:" + email +
                "\nTelefono:" + telefono;
    }
}
