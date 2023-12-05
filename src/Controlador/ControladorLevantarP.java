package Controlador;

import Modulo.Agregar;
import Modulo.LevantarPedido;
import Modulo.MenuTienda;
import Modulo.Percistencia;
import Vista.VistaLevantarP;
import Vista.VistaMenu;

import java.util.ArrayList;
import java.util.List;

public class ControladorLevantarP {
    private ArrayList<LevantarPedido> pedidosList;
    private VistaLevantarP vista = new VistaLevantarP();
    private LevantarPedido pedido1;





    ControladorLevantarP(VistaLevantarP vista){
        pedidosList =  new ArrayList<>();
        this.vista=vista;

    }//Constructor

    public ControladorLevantarP() {
    }

    public void iniciardatos (){

        pedidosList = Percistencia.cargarPedidos("PedidosP.txt");

    }

    public LevantarPedido agregardetalle() throws Exception {
        pedido1 = new LevantarPedido(
                vista.SolicitarCodigo(),
                vista.SolicitarPlatillo(),
                vista.SolicitarPrecio(),
                vista.SolicitarCantidad()
                );

        return pedido1;

    } //Método agregar productos




    public int buscar(String codigo){
        codigo = pedido1.getCodigo();
        for (int i = 0; i < pedidosList.size(); i++) {
            String newcodigo = pedidosList.get(i).getCodigo();

            if (codigo.equals(pedidosList.get(i).getCodigo())) {
                System.out.println(i);
                return i;
            }//
        }
        return -1;//Código de producto no encotrado

    } //Método que buscas el codigo del producto



    public boolean eliminarProducto (String codigo){
        int compara = buscar(codigo);
        if (compara != -1) {
            pedidosList.remove(compara);//elimina el producto del Array
            return true;
        }else {

            return false;
        }
    }//Metodo para eliminar productos



    public void modificarPedidos(String codigo) throws Exception {
        int  compara = buscar(codigo);
        if(compara != -1 ) {
            vista.imprimirInfoProd(pedidosList.get(compara));
            Integer opcion = 0;
            while (opcion != 7) {
                switch (vista.MenuModificarLevantaP()) {

                    case 1:
                        vista.imprimirInfoProd(pedidosList.get(compara));
                        pedidosList.get(compara).setPlatillo(vista.SolicitarPlatillo());



                        break;
                    case 2:
                        vista.imprimirInfoProd(pedidosList.get(compara));
                        pedidosList.get(compara).setPrecio(vista.SolicitarPrecio());



                        break;
                    case 3:
                        vista.imprimirInfoProd(pedidosList.get(compara));
                        pedidosList.get(compara).setCantidad(vista.SolicitarCantidad());



                        break;

                    case 4:
                        opcion = 4;
                        break;
                }//fin switch
            }//llave final del while
        }//llave final del if
    }//Método para modificar los atributos


    public void MenuLevantarPe() throws Exception {
        Integer opcion=0; ;
        while(opcion != 6){
            switch (vista.MenuPedido()){
                case 1:
                    agregardetalle();
                    break;
                case 2:
                    String  indice = vista.SolicitarCodigo();
                    vista.imprimeInfoBorrado(eliminarProducto(indice));

                    break;
                case 3:
                    vista.SolicitarCodigo();
                    modificarPedidos(pedido1.getCodigo());

                    break;
                case 4:
                    vista.imprimirInfoTotalPed(pedidosList);

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
