package Vista;

import Modulo.Clientes;
import Modulo.MenuTienda;
import Modulo.Percistencia;

import java.util.ArrayList;
import java.util.Scanner;

public class VistaClientes {
    Scanner lectura = new Scanner(System.in);

    public String SolicitarID(){
        System.out.println("Escribe el ID. ");
        lectura = new Scanner(System.in);
        return lectura.next();
    }//Método que solicita Nombre
    public String SolicitarNombre(){
        System.out.println("Escribe el Nombre. ");
        lectura = new Scanner(System.in);
        return lectura.next();
    }//Método que solicita Nombre
    public String SolicitarApellido() {
        System.out.println("Escribe el Apellido");
        lectura = new Scanner(System.in);
        return lectura.next();
    }//Método que solicita  Apelido

    public int SolicitarEdad () {
        boolean entrada1 = true;
        while (true){

            try {
                System.out.println("Escribe la Edad");
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

    public String SolicitarDomicilio(){
        System.out.println("Escribe el Domicilio ");
        lectura = new Scanner(System.in);
        return lectura.next();
    }//Método que solicita Producto
    public String SolicitarCorreo(){
        System.out.println("Escribe el Correo");
        lectura = new Scanner(System.in);
        return lectura.next();
    }//Método que solicita Domicilio

    public int SolicitarNumeroTelefono () {
        boolean entrada2 = true;
        while (true){

            try {
                System.out.println("Escribe el numero de telefono");
                lectura = new Scanner(System.in);
                String entrada = lectura.nextLine();
                int numTel;
                numTel = Integer.parseInt(entrada);

                return  numTel;


            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Debes ingresar un número.");

            }

        }

    }




    public void imprimirInfoTotalCli(ArrayList<Clientes> clientesList){
        Percistencia.cargarClientes("Clientes.txt");
        clientesList.forEach(System.out::println);

    }////Método que imprime los elementos del ArrayList

    public int MenuCliente(){
        lectura = new Scanner(System.in);
        System.out.println("======Menú  Clientes=====");
        System.out.println("1-Agregar Cliente");
        System.out.println("2-Borrar Cliente ");
        System.out.println("3-Modificar Cliente");
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
        System.out.println("++El Cliente fue  borrado++");
    }
    public void prodModificdo(){
        System.out.println("++Modificación del Cliente Exitosa++");
    }
    public void prodNOEncontado(){
        System.out.println("++No se encuentra el Cliente++");
    }



    public void imprimirInfoProd(Clientes obj1){
        if (obj1 != null)
            System.out.println(obj1);
        else
            prodNOEncontado();
    }//Método que imprime los productos

    public int MenuModificarCliente(){
        lectura = new Scanner(System.in);
        //lectura.useDelimiter("\n");
        System.out.println("===Menú modificación===");
        System.out.println("1-Nombre ");
        System.out.println("2-Apellido");
        System.out.println("3-Edad");
        System.out.println("4-Domicilio");
        System.out.println("5-Correo");
        System.out.println("6-Numero de Telefono");
        System.out.println("7-Salir");
        System.out.println("Opción :");
        return lectura.nextInt();
    }//Método que despliega texto y recibe un elemento
}
