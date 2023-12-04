package Modulo;

import java.io.Serializable;

public class Clientes implements Serializable {
    private String id;
    private String nombre;
    private String apellido;
    private int edad;
    private String domicilio;
    private String correo;
    private int numTel;

    public Clientes(String id,String nombre, String apellido, int edad, String domicilio, String correo, int numTel) {
        this.id =id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.domicilio = domicilio;
        this.correo = correo;
        this.numTel = numTel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getNumTel() {
        return numTel;
    }

    public void setNumTel(int numTel) {
        this.numTel = numTel;
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "Nombre='" + nombre + '\'' +
                ", Apellido='" + apellido + '\'' +
                ", Edad=" + edad +
                ", Domicilio='" + domicilio + '\'' +
                ", Correo='" + correo + '\'' +
                ", NumTel=" + numTel +
                '}';
    }
}
