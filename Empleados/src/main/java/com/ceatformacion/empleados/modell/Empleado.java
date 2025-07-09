package com.ceatformacion.empleados.modell;

import java.time.LocalDate;

public class Empleado {
    private static int contador;
    private String nombre;
    private String apellido;
    private int nHijos;
    private String dni;
    private LocalDate fechaNacimiento;
    private String ultTitulacion;
    private int idEmpleado;
    public enum Puesto{ DIRECTIVO, ADMINISTRATIVO, OFICINA};
    private Puesto puesto;


    public Empleado() {

    }
    public Empleado(String nombre, String apellido, int nHijos, String dni, String fechaNacimiento, String ultTitulacion, Puesto puesto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nHijos = nHijos;
        this.dni = dni;
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento);
        this.ultTitulacion = ultTitulacion;
        this.puesto = puesto;
        this.idEmpleado = ++contador;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getnHijos() {
        return nHijos;
    }

    public void setnHijos(int nHijos) {
        this.nHijos = nHijos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento);
    }

    public String getUltTitulacion() {
        return ultTitulacion;
    }

    public void setUltTitulacion(String ultTitulacion) {
        this.ultTitulacion = ultTitulacion;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }


}
