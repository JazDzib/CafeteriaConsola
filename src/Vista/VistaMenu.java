package Vista;

import Modulo.MenuTienda;
import Modulo.Percistencia;

import java.util.ArrayList;

import java.util.InputMismatchException;
import java.util.Scanner;


public class VistaMenu {

    Scanner lectura = new Scanner(System.in);

    /**
     * Método que solicita y devuelve el código ingresado por el usuario.
     * @return Código ingresado por el usuario.
     */
    public String SolicitarCodigo(){
        System.out.println("Escr. Codigo. ");
        lectura = new Scanner(System.in);
        return lectura.next();
    }

    /**
     * Método que solicita y devuelve la categoría ingresada por el usuario.
     * @return Categoría ingresada por el usuario.
     */
    public String SolicitarCategria() {
        System.out.println("Escr. Categoria ");
        lectura = new Scanner(System.in);
        return lectura.next();
    }

    /**
     * Método que solicita y devuelve el nombre del producto ingresado por el usuario.
     * @return Nombre del producto ingresado por el usuario.
     */
    public String SolicitarProducto(){
        System.out.println("Escr. Producto ");
        lectura = new Scanner(System.in);
        return lectura.next();
    }

    /**
     * Método que solicita y devuelve el precio ingresado por el usuario.
     * @return Precio ingresado por el usuario.
     */
        public double SolicitarPrecio () {
            boolean entrada2 = true;
            while (true) {

                try {
                    System.out.println("Escr. Precio");
                    lectura = new Scanner(System.in);
                    String entrada = lectura.nextLine();
                    double numero;
                    numero = Double.parseDouble(entrada);
                    return numero;


                } catch (NumberFormatException e) {
                    System.out.println("Entrada no válida. Debes ingresar un número.");

                }

            }

        }

    /**
     * Método que solicita y devuelve la descripción del producto ingresada por el usuario.
     * @return Descripción del producto ingresada por el usuario.
     */
    public String SolicitarDescripcion(){
        System.out.println("Escr. Descripcion del Producto ");
        lectura = new Scanner(System.in);
        return lectura.nextLine();
    }

    /**
     * Método que imprime los elementos del ArrayList
     * @param menuTList Imprime el menú.
     */
    public void imprimirInfoTotal(ArrayList<MenuTienda>menuTList){
        Percistencia.cargarMenu("Menu.txt");
        menuTList.forEach(System.out::println);
    }

    /**
     * Método que muestra el menú principal.
     * @return Opción seleccionada.
     */
    public int Menu(){
        lectura = new Scanner(System.in);
        System.out.println("======Menú=====");
        System.out.println("1-Agregar Producto al menu");
        System.out.println("2-Borrar Producto ");
        System.out.println("3-Modificar Menu");
        System.out.println("4-Desplegar lista");
        System.out.println("5-Salir");
        System.out.println("Opción: ");
        return lectura.nextInt();
    }

    /**
     * Método que imprime un mensaje cuando se elimina un producto.
     * @param e Indica si se eliminó el producto o no.
     */
    public void imprimeInfoBorrado(boolean e){
        if(e){
            prodEliminado();
        }else{
            prodNOEncontado();
        }
    }
    /**Métodos de los mensajes*/
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
     * Método que imprime la información de los productos.
     * @param obj1 Producto a imprimir.
     */
    public void imprimirInfoProd(MenuTienda obj1){
        if (obj1 != null)
            System.out.println(obj1);
        else
            prodNOEncontado();
    }

    /**
     * Método que muestra el menú de opciones para modificar el menú.
     * @return Opción seleccionada por el usuario.
     */
    public int MenuModificarMenu(){
        lectura = new Scanner(System.in);

        System.out.println("===Menú modificación===");
        System.out.println("1-Categoria ");
        System.out.println("2-Producto");
        System.out.println("3-Precio");
        System.out.println("4-Descripcion");
        System.out.println("5-Salir");
        System.out.println("Opción :");
        return lectura.nextInt();
    }
}