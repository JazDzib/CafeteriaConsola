package Modulo;

import java.io.Serializable;
import java.util.ArrayList;

public class MenuTienda implements Serializable {

    private String codigo;
    private String categoria;
    private String producto;
    private double precio;
    private String descripcion;

    /**
     * Constructor
     *
     * @param codigo      Código del producto.
     * @param categoria   Categoría del producto.
     * @param producto    Nombre del producto.
     * @param precio      Precio del producto.
     * @param descripcion Descripción del producto.
     */
    public MenuTienda(String codigo, String categoria, String producto, double precio, String descripcion) {
        this.codigo = codigo;
        this.categoria = categoria;
        this.producto = producto;
        this.precio = precio;
        this.descripcion= descripcion;
    }

    
    //Getters and Setters
    /**
     * @return Código del producto.
     */
    public String getCodigo() {
        return codigo;
    }
    /**
     * @param codigo Código del producto.
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    /**
     * @return Categoría del producto.
     */
    public String getCategoria() {
        return categoria;
    }
    /**
     * @param categoria Categoría del producto.
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    /**
     * @return Nombre del producto.
     */
    public String getProducto() {
        return producto;
    }
    /**
     * @param producto Nombre del producto.
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }
    /**
     * @return Precio del producto.
     */
    public double getPrecio() {
        return precio;
    }
    /**
     * @param precio Precio del producto.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    /**
     * @return Descripción del producto.
     */
    public String getDescripcion() {
        return descripcion;
    }
    /**
     * @param descripcion Descripción del producto.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return Cadena que representa el objeto MenuTienda.
     */
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