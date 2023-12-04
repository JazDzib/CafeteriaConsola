package Modulo;

import java.io.Serializable;

public class LevantarPedido implements Serializable {
    private String codigo;
    private String nombre;
    private int mesa;
    private  String platillo;
    private int cantidad;

    public LevantarPedido(String codigo,String nombre, int mesa, String platillo, int cantidad) {
        this.codigo=codigo;
        this.nombre = nombre;
        this.mesa = mesa;
        this.platillo = platillo;
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public String getPlatillo() {
        return platillo;
    }

    public void setPlatillo(String platillo) {
        this.platillo = platillo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "LevantarPedido{" +
                "Codigo='" + codigo + '\'' +
                ", Nombre='" + nombre + '\'' +
                ", Mesa=" + mesa +
                ", Platillo='" + platillo + '\'' +
                ", Cantidad=" + cantidad +
                '}';
    }
}
