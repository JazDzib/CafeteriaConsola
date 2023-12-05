package Vista;

import Modulo.Almacen;
import Modulo.MenuTienda;
import Modulo.Percistencia;

import java.util.ArrayList;
import java.util.Scanner;

public class VistaAlmacen {
    Scanner lectura = new Scanner(System.in);

    /**Método que solicita el Código
     * @return Código del producto.
     */
    public String SolicitarCodigo(){
        System.out.println("Escribe el Codigo. ");
        lectura = new Scanner(System.in);
        return lectura.next();
    }

    /**Método que solicita Categoria
     * @return La categoría del producto.
     */
    public String SolicitarCategoria() {
        System.out.println("Escribe la Categoria ");
        lectura = new Scanner(System.in);
        return lectura.next();
    }

    /**
     * Método que solicita ingresar el nombre del producto.
     * @return Nombre del producto.
     */
    public String SolicitarNombre(){
        System.out.println("Escribe el Nombre ");
        lectura = new Scanner(System.in);
        return lectura.next();
    }

    /**
     * Solicita ingresar el número de existencia del producto.
     * @return El número de existencia.
     */
    public int SolicitarExistencias () {
        boolean entrada2 = true;
        while (true){

            try {
                System.out.println("Escribe el numero de existencias");
                lectura = new Scanner(System.in);
                String entrada = lectura.nextLine();
                int exist;
                exist = Integer.parseInt(entrada);
                return exist;


            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Debes ingresar un número.");

            }

        }

    }

    /**
     * Método que imprime la información de todos los productos en el almacén.
     * @param almacenList Lista de productos en el almacén.
     */
    public void imprimirInfoTotalIngred(ArrayList<Almacen> almacenList){
        Percistencia.cargarIngredientes("Almacen.txt");
        almacenList.forEach(System.out::println);
    }

    /**
     * Muestra menú de opciones
     * @return La opción seleccionada.
     */
    public int Menu(){
        lectura = new Scanner(System.in);
        System.out.println("======Menú Almacen=====");
        System.out.println("1-Agregar Ingrediente");
        System.out.println("2-Borrar Ingrediente ");
        System.out.println("3-ModificarIngrediente");
        System.out.println("4-Desplegar lista");
        System.out.println("5-Salir");
        System.out.println("Opción: ");
        return lectura.nextInt();
    }

    /**
     * Imprime mensajes indicando si un producto fue eliminado o no encontrado.
     * @param e Booleano que indica si el producto fue eliminado.
     */
    public void imprimeInfoBorrado(boolean e)
    {
        if (e) {
            prodEliminado();
        }else{
            prodNOEncontado();
        }
    }
    ////Métodos que despliegan mensajes
    public void prodEliminado(){
        System.out.println("++El producto fue  borrado++");
    }
    public void prodModificdo(){
        System.out.println("++Modificación del producto Exitosa++");
    }
    public void prodNOEncontado(){
        System.out.println("++No se encuentra el producto++");
    }

    /**
     * Imprime la información de un producto.
     * @param obj1 Objeto de tipo Almacen que representa un producto.
     */
    public void imprimirInfoIngred(Almacen obj1){
        if (obj1 != null)
            System.out.println(obj1);
        else
            prodNOEncontado();
    }

    /**
     * Muestra un menú de opciones para modificar un producto y solicita al usuario seleccionar una.
     * @return La opción seleccionada por el usuario.
     */
    public int MenuModificarAlmacen(){
        lectura = new Scanner(System.in);
        //lectura.useDelimiter("\n");
        System.out.println("===Menú modificación===");
        System.out.println("1-Categoria ");
        System.out.println("2-Nombre");
        System.out.println("3-Existencias");
        System.out.println("4-Salir");
        System.out.println("Opción :");
        return lectura.nextInt();
    }//Método que despliega texto y recibe un elemento
}
