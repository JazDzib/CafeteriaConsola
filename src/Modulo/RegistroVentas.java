package Modulo;

import java.io.Serializable;
import java.util.ArrayList;

public class RegistroVentas  implements Serializable {

    private String fecha;
    private String nombreC;
    private double precio;
    private int prodVend;
    private double subtotal;
    private double total;
    private int mesa;
    private ArrayList<LevantarPedido> datosPedido;

    public RegistroVentas(String fecha,String nombreC, int prodVend) {
        this.fecha = fecha;
        this.nombreC=nombreC;

        this.prodVend = prodVend;

    }

    public RegistroVentas(String fecha, String nombreC, int mesa, ArrayList<LevantarPedido> datosPedido) {
        this.fecha = fecha;
        this.nombreC = nombreC;
        this.mesa=mesa;
        this.datosPedido = datosPedido;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public ArrayList<LevantarPedido> getDatosPedido() {
        return datosPedido;
    }

    public void setDatosPedido(ArrayList<LevantarPedido> datosPedido) {
        this.datosPedido = datosPedido;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
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

    public int getProdVend() {
        return prodVend;
    }

    public void setProdVend(int prodVend) {
        this.prodVend = prodVend;
    }

    @Override
    public String toString() {
        return "RegistroVentas{" +
                "fecha='" + fecha + '\'' +
                ", nombreC='" + nombreC + '\'' +
                ", mesa=" + mesa +
                ", datosPedido=" + datosPedido +
                '}';
    }
}
