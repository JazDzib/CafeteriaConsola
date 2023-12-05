package Modulo;

import java.io.Serializable;
import java.util.ArrayList;

public class MenuTienda implements Serializable {

    private String codigo;
    private String categoria;
    private String producto;
    private double precio;

    private String descripcion;
 

    
    public MenuTienda(String codigo, String categoria, String producto, double precio, String descripcion) {
        this.codigo = codigo;
        this.categoria = categoria;
        this.producto = producto;
        this.precio = precio;
        this.descripcion= descripcion;
    }//Contructor

    
    //Getters and Setters
    /**
     * @return Código del producto.
     */
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    @Override
    public String toString() {
        return "MenuTienda{" +
                "Dodigo='" + codigo + '\'' +
                ", Categoria='" + categoria + '\'' +
                ", Producto='" + producto + '\'' +
                ", Precio=" + precio +
                ", Descripcion='" + descripcion + '\'' +
                '}';
    }
}
