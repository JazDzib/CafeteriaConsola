package Vista;

import Modulo.MenuTienda;
import Modulo.Percistencia;

import java.util.ArrayList;

import java.util.InputMismatchException;
import java.util.Scanner;


public class VistaMenu {

    Scanner lectura = new Scanner(System.in);

    public String SolicitarCodigo(){
        System.out.println("Escr. Codigo. ");
        lectura = new Scanner(System.in);
        return lectura.next();
    }//Método que solicita Codigo
    public String SolicitarCategria() {
        System.out.println("Escr. Categoria ");
        lectura = new Scanner(System.in);
        return lectura.next();
    }//Método que solicita Categoria
    public String SolicitarProducto(){
        System.out.println("Escr. Producto ");
        lectura = new Scanner(System.in);
        return lectura.next();
    }//Método que solicita Producto


        public double SolicitarPrecio () {
            boolean entrada2 = true;
            while (true){

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
        //Método que solicita Precio





    public String SolicitarDescripcion(){
        System.out.println("Escr. Descripcion del Producto ");
        lectura = new Scanner(System.in);
        return lectura.nextLine();
    }//Método que solicita Descripción


    public void imprimirInfoTotal(ArrayList<MenuTienda>menuTList){
        Percistencia.cargarMenu("Menu.txt");
        menuTList.forEach(System.out::println);

    }////Método que imprime los elementos del ArrayList

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
    }////Método que despliega texto y recibe un elemento


    public void imprimeInfoBorrado(boolean e)
    {
        if (e) {
            prodEliminado();
        }else{
            prodNOEncontado();
        }
    }//Método que imprime mensajes cuando se elimina un producto

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



    public void imprimirInfoProd(MenuTienda obj1){
        if (obj1 != null)
            System.out.println(obj1);
        else
            prodNOEncontado();
    }//Método que imprime los productos

    public int MenuModificarMenu(){
        lectura = new Scanner(System.in);
        //lectura.useDelimiter("\n");
        System.out.println("===Menú modificación===");
        System.out.println("1-Categoria ");
        System.out.println("2-Producto");
        System.out.println("3-Precio");
        System.out.println("4-Descripcion");
        System.out.println("5-Salir");
        System.out.println("Opción :");
        return lectura.nextInt();
    }//Método que despliega texto y recibe un elemento
}
