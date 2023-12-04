package Vista;

import Modulo.Clientes;
import Modulo.LevantarPedido;
import Modulo.Percistencia;

import java.util.ArrayList;
import java.util.Scanner;

public class VistaLevantarP {

    Scanner lectura= new Scanner(System.in);
    public String SolicitarCodigo(){
        System.out.println("Escr. Codigo. ");
        lectura = new Scanner(System.in);
        return lectura.next();
    }//Método que solicita Codigo

    public String SolicitarNombre () {
        System.out.println("Escribe el nombre");
        lectura = new Scanner(System.in);
        return lectura.next();

    }

    public int SolicitarMesa(){

        while (true){

            try {
                System.out.println("Escribe el numero de mesa");
                lectura= new Scanner(System.in);
                String entrada = lectura.nextLine();
                int mesa;
                mesa = Integer.parseInt(entrada);

                return  mesa;


            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Debes ingresar un número.");

            }

        }
    }
    public String SolicitarPlatillo(){

        System.out.println("Escribe el platillo");
        lectura= new Scanner(System.in);
        return lectura.nextLine();


    }
    public int SolicitarCantidad(){
        while (true){

            try {
                System.out.println("Escribe la cantidad");
                lectura= new Scanner(System.in);
                String entrada = lectura.nextLine();
                int cant;
                cant = Integer.parseInt(entrada);

                return  cant;


            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Debes ingresar un número.");

            }

        }

    }
    public void imprimirInfoTotalPed(ArrayList<LevantarPedido> pedidosList){
        Percistencia.cargarPedidos("PedidosP.txt");
        pedidosList.forEach(System.out::println);

    }////Método que imprime los elementos del ArrayList

    public int MenuPedido(){
        lectura = new Scanner(System.in);
        System.out.println("======Menú Pedido=====");
        System.out.println("1-Agregar Pedido");
        System.out.println("2-Borrar Pedido ");
        System.out.println("3-Modificar Pedido");
        System.out.println("4-Desplegar Pedidos");
        System.out.println("5-Mostrar menu");
        System.out.println("6.Opción: ");
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
        System.out.println("++El Cliente fue  borrado++");
    }
    public void prodModificdo(){
        System.out.println("++Modificación del Cliente Exitosa++");
    }
    public void prodNOEncontado(){
        System.out.println("++No se encuentra el Cliente++");
    }



    public void imprimirInfoProd(LevantarPedido obj1){
        if (obj1 != null)
            System.out.println(obj1);
        else
            prodNOEncontado();
    }//Método que imprime los productos

    public int MenuModificarLevantaP(){
        lectura = new Scanner(System.in);
        //lectura.useDelimiter("\n");
        System.out.println("===Menú modificación===");
        System.out.println("1-Nombre ");
        System.out.println("2-Mesa");
        System.out.println("3-Platillo");
        System.out.println("4-Catidad");
        System.out.println("5-Opción :");
        return lectura.nextInt();
    }//Método que despliega texto y recibe un elemento

}
