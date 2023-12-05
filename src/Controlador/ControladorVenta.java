package Controlador;

import Modulo.*;
import Vista.VistaLevantarP;
import Vista.VistaRegistroV;

import java.util.ArrayList;
import java.util.Scanner;

public class ControladorVenta implements Agregar {

    private VistaRegistroV vista;
    private RegistroVentas ventas1;
    private ArrayList<RegistroVentas> ventasList;
    private ArrayList<LevantarPedido> datosPedido;
    private ControladorLevantarP controladorPedido = new ControladorLevantarP();




    ControladorVenta(VistaRegistroV vista){
        ventasList =  new ArrayList<>();
        this.vista=vista;


    }//Constructor


   /* public void GenerarTicket() {
        ArrayList<RegistroVentas> datos = new ArrayList<>();
        datos = Percistencia.cargarVentas("Ventas.txt");

        double suma=0;
        System.out.println("===Ticket de Compra===");
        System.out.println("Nombre Cliente: " + datos.get(datos.size()-1).getNombreC());
        System.out.println("Numero de mesa: "+ datos.get(datos.size()-1).getMesa());
        for (int i = 0; i < datos.get(datos.size()-1).getDatosPedido().size(); i++) {
            System.out.println("Pedido: "+ (i+1));
            System.out.println("Platillo: " + datos.get(datos.size()-1).getDatosPedido().get(i).getPlatillo());
            System.out.println("Precio: " + datos.get(datos.size()-1).getDatosPedido().get(i).getPrecio());
            System.out.println("Cantidad: " + datos.get(datos.size()-1).getDatosPedido().get(i).getCantidad());
            System.out.println("Subtotal: " + datos.get(datos.size()-1).getDatosPedido().get(i).getSubtotal());
            System.out.println("");

            suma = suma + datos.get(datos.size()-1).getDatosPedido().get(i).getSubtotal();

        }
        System.out.println("Total de la compra:"+suma);

    }*/




    public void iniciardatos (){

        ventasList = Percistencia.cargarVentas("Ventas.txt");

    }

    public void agregar() throws Exception {
       ArrayList<LevantarPedido> pedidos =new ArrayList<>();

              String fecha=  vista.SolicitarFecha();
            String nombre=  vista.SolicitarNombre();
            int mesa=   vista.SolicitarMesa();
        boolean salida=true;
       do{
           pedidos.add(controladorPedido.agregardetalle());
           Scanner sc = new Scanner(System.in);
           System.out.println("Desea agregar un nuevo producto?(s/n)");
           String control=sc.nextLine();


           if(control.equals("n") ){
               salida = false;
           }


       }while (salida);
    RegistroVentas ventasr = new RegistroVentas(fecha,nombre,mesa,pedidos);
        ventasList.add(ventasr);
        Percistencia.guardarVentas(ventasList,"Ventas.txt");
    } //Método agregar productos



    public int buscar(String nombreC){
        nombreC = ventas1.getFecha();
        for (int i = 0; i < ventasList.size(); i++) {
            String newcodigo = ventasList.get(i).getNombreC();

            if (nombreC.equals(ventasList.get(i).getNombreC())) {
                System.out.println(i);
                return i;
            }//
        }
        return -1;//Código de producto no encotrado

    } //Método que buscas el codigo del producto



    public boolean eliminarProducto (String nombreC){
        int compara = buscar(nombreC);
        if (compara != -1) {
            ventasList.remove(compara);//elimina el producto del Array
            return true;
        }else {

            return false;
        }
    }//Metodo para eliminar productos



    public void modificarVentas(String nombreC) throws Exception {
        int  compara = buscar(nombreC);
        if(compara != -1 ) {
            vista.imprimirInfoProd(ventasList.get(compara));
            Integer opcion = 0;
            while (opcion != 4) {
                switch (vista.MenuModificarVenta()) {
                    case 1:

                        vista.imprimirInfoProd(ventasList.get(compara));
                        ventasList.get(compara).setFecha(vista.SolicitarFecha());

                        break;
                    case 2:

                        vista.imprimirInfoProd(ventasList.get(compara));
                        ventasList.get(compara).setNombreC(vista.SolicitarNombre());

                        break;
                    case 3:

                        vista.imprimirInfoProd(ventasList.get(compara));
                        ventasList.get(compara).setProdVend(vista.SolicitarMesa());



                        break;

                    case 4:
                        opcion = 4;
                        break;
                }//fin switch
            }//llave final del while
        }//llave final del if
    }//Método para modificar los atributos


    public void MenuVenta() throws Exception {
        Integer opcion=0; ;
        while(opcion != 6){
            switch (vista.MenuVentas()){
                case 1:
                    agregar();
                    break;
                case 2:
                    String  indice = vista.SolicitarNombre();
                    vista.imprimeInfoBorrado(eliminarProducto(indice));

                    break;
                case 3:
                    vista.SolicitarNombre();
                    modificarVentas(ventas1.getNombreC());

                    break;
                case 4:
                    vista.imprimirInfoTotalVentas(ventasList);

                    break;
                case 5:
                    imprimirMenulista();

                    break;


                case 6:
                    opcion = 6;
                    break;
            } //fin del switch
        } //fin del while
    } //fin de Menu de Tienda

    public void imprimirMenulista(){
        ArrayList<MenuTienda> llamamenu = new ArrayList<>();
        llamamenu =Percistencia.cargarMenu("Menu.txt");
        for (int i = 0; i <llamamenu.size() ; i++) {
            System.out.println(llamamenu.get(i));
        }
    }




}
