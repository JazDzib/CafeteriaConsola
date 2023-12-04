package Vista;

import Modulo.Almacen;
import Modulo.MenuTienda;
import Modulo.Percistencia;

import java.util.ArrayList;
import java.util.Scanner;

public class VistaAlmacen {
    Scanner lectura = new Scanner(System.in);

    public String SolicitarCodigo(){
        System.out.println("Escribe el Codigo. ");
        lectura = new Scanner(System.in);
        return lectura.next();
    }//Método que solicita Codigo
    public String SolicitarCategoria() {
        System.out.println("Escribe la Categoria ");
        lectura = new Scanner(System.in);
        return lectura.next();
    }//Método que solicita Categoria
    public String SolicitarNombre(){
        System.out.println("Escribe el Nombre ");
        lectura = new Scanner(System.in);
        return lectura.next();
    }//Método que solicita Producto


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
    //Método que solicita Precio






    public void imprimirInfoTotalIngred(ArrayList<Almacen> almacenList){
        Percistencia.cargarIngredientes("Almacen.txt");
        almacenList.forEach(System.out::println);

    }////Método que imprime los elementos del ArrayList

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



    public void imprimirInfoIngred(Almacen obj1){
        if (obj1 != null)
            System.out.println(obj1);
        else
            prodNOEncontado();
    }//Método que imprime los productos

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
