package Modulo;

import java.io.Serializable;

public class RegistroVentas implements Serializable {
    private String codigo;
    private String fecha;
    private int precio;
    private int prodVend;
    private  String nombreC;

    public RegistroVentas(String codigo, String fecha, String nombreC, int precio, int prodVend) {
        this.codigo= codigo;
        this.fecha = fecha;
        this.nombreC = nombreC;
        this.precio = precio;
        this.prodVend = prodVend;
    }

    public String getId() {
        return codigo;
    }

    public void setId(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getProdVend() {
        return prodVend;
    }

    public void setProdVend(int prodVend) {
        this.prodVend = prodVend;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    @Override
    public String toString() {
        return "RegistroVentas{" +
                "codigo='" + codigo + '\'' +
                ", fecha='" + fecha + '\'' +
                ", precio=" + precio +
                ", productos Vendidos=" + prodVend +
                ", nombreCliente='" + nombreC + '\'' +
                '}';
    }
}
