package Modulo;

import java.io.Serializable;

public class Almacen implements Serializable {

    private String codigo;
    private String categoria;
    private String nombre;
    private int existencia;

    /**
     * Constructor
     * @param codigo     Código del artículo.
     * @param categoria  Categoría a la que pertenece el artículo.
     * @param nombre     Nombre del artículo.
     * @param existencia Cantidad disponible en el inventario.
     */
    public Almacen(String codigo, String categoria, String nombre, int existencia) {
        this.codigo = codigo;
        this.categoria = categoria;
        this.nombre = nombre;
        this.existencia = existencia;
    }

    /**
     * @return Código del artículo.
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo Nuevo código del artículo.
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return Categoría del artículo.
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria Categoría del artículo.
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return Nombre del artículo.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre Nombre del artículo.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return Cantidad disponible en el almacén.
     */
    public int getExistencia() {
        return existencia;
    }

    /**
     * @param existencia Cantidad existente en el inventario.
     */
    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    /**
     * @return Cadena que representa el objeto Almacen.
     */
    @Override
    public String toString() {
        return "Almacen{" +
                "Codigo='" + codigo + '\'' +
                ", Categoria='" + categoria + '\'' +
                ", Nombre='" + nombre + '\'' +
                ", Existencia=" + existencia +
                '}';
    }
}
