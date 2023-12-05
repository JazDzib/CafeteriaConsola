package Vista;

import Modulo.Clientes;
import Modulo.Percistencia;
import Modulo.RegistroVentas;

import java.util.ArrayList;
import java.util.Scanner;

public class VistaRegistroV {
    Scanner lectura = new Scanner(System.in);

    public String SolicitarFecha(){
        System.out.println("Escribe la Fecha ");
        lectura = new Scanner(System.in);
        return lectura.next();
    }//Método que solicita Nombre

    public String SolicitarNombre(){
        System.out.println("Escribe el Nombre. ");
        lectura = new Scanner(System.in);
        return lectura.next();
    }//Método que solicita Nombre


    public int SolicitarMesa () {
        boolean entrada1 = true;
        while (true){

            try {
                System.out.println("Escribe la mesa");
                lectura = new Scanner(System.in);
                String entrada = lectura.nextLine();
                int edad;
                edad = Integer.parseInt(entrada);


                return edad;

            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Debes ingresar un número.");

            }

        }

    }



    public void imprimirInfoTotalVentas(ArrayList<RegistroVentas> ventasList){
        Percistencia.cargarClientes("Ventas.txt");
        ventasList.forEach(System.out::println);

    }////Método que imprime los elementos del ArrayList

    public int MenuVentas(){
        lectura = new Scanner(System.in);
        System.out.println("======Menú  Venta=====");
        System.out.println("1-Agregar Venta");
        System.out.println("2-Borrar  Venta ");
        System.out.println("3-Modificar  Venta");
        System.out.println("4-Desplegar lista");
        System.out.println("5-Desplegar Menu");
        System.out.println("6-Salir");
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
        System.out.println("++El Cliente fue  borrado++");
    }
    public void prodModificdo(){
        System.out.println("++Modificación del Cliente Exitosa++");
    }
    public void prodNOEncontado(){
        System.out.println("++No se encuentra el Cliente++");
    }



    public void imprimirInfoProd(RegistroVentas obj1){
        if (obj1 != null)
            System.out.println(obj1);
        else
            prodNOEncontado();
    }//Método que imprime los productos

    public int MenuModificarVenta(){
        lectura = new Scanner(System.in);
        //lectura.useDelimiter("\n");
        System.out.println("===Menú modificación===");
        System.out.println("1-Fecha ");
        System.out.println("2-Nombre");
        System.out.println("3-Mesa");
        System.out.println("4-Salir");
        System.out.println("Opción :");
        return lectura.nextInt();
    }//Método que despliega texto y recibe un elemento
}
