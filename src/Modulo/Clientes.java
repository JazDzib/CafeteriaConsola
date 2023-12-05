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

    /**
     * Constructor
     * @param id        ID del cliente.
     * @param nombre    Nombre del cliente.
     * @param apellido  Apellido del cliente.
     * @param edad      Edad del cliente.
     * @param domicilio Domicilio del cliente.
     * @param correo    Correo electrónico del cliente.
     * @param numTel    Número de teléfono del cliente.
     */
    public Clientes(String id,String nombre, String apellido, int edad, String domicilio, String correo, int numTel) {
        this.id =id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.domicilio = domicilio;
        this.correo = correo;
        this.numTel = numTel;
    }

    /**
     * @return ID del cliente.
     */
    public String getId() {
        return id;
    }

    /**
     * @param id ID del cliente.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return Nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre Nombre del cliente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return Apellido del cliente.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido Apellido del cliente.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return Edad del cliente.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad Edad del cliente.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return Domicilio del cliente.
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * @param domicilio Domicilio del cliente.
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * @return Correo electrónico del cliente.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo Correo electrónico del cliente.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return Número de teléfono del cliente.
     */
    public int getNumTel() {
        return numTel;
    }

    /**
     * @param numTel Número de teléfono del cliente.
     */
    public void setNumTel(int numTel) {
        this.numTel = numTel;
    }

    /**
     * @return Cadena que representa el objeto Clientes.
     */
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
