package Modulo;

import java.io.Serializable;
import java.util.ArrayList;

public class LevantarPedido implements Serializable {
    private String codigo;
    private String nombrec;
    private String fecha;
    private int mesa;
    private  String platillo;
    private int cantidad;

    private double precio;
    private double total;
    private double subtotal;

    public LevantarPedido(String codigo, String platillo,double precio,int cantidad) {
        this.codigo=codigo;
        this.platillo = platillo;
        this.cantidad = cantidad;
        this.precio=precio;
        this.subtotal = precio * cantidad;

    }

    /*public LevantarPedido(String fecha, String nombrec, double subtotal,double total) {
        this.fecha = fecha;
        this.nombrec = nombrec;
        this.total = total;
        this.subtotal =subtotal;

    }*/

    public double costoTotal(){
        double totalprecio = getPrecio() * getCantidad();
        return totalprecio;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombrec;
    }

    public void setNombre(String nombrec) {
        this.nombrec = nombrec;
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
                "codigo='" + codigo + '\'' +
                ", platillo='" + platillo + '\'' +
                ", cantidad=" + cantidad +
                ", precio=" + precio +
                '}';
    }
}
