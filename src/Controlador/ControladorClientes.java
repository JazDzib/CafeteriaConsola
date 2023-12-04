package Controlador;

import Modulo.Agregar;
import Modulo.Clientes;
import Modulo.MenuTienda;
import Modulo.Percistencia;
import Vista.VistaClientes;
import Vista.VistaControladorP;
import Vista.VistaMenu;

import java.util.ArrayList;

public class ControladorClientes implements Agregar {
    private ArrayList<Clientes> clientesList;
    private VistaClientes vista;
    private Clientes clientes1;
    public ControladorClientes(VistaClientes vista) {
        clientesList = new  ArrayList<>();
        this.vista = vista;
    }
    /*ControladorClientes(VistaClientes vista) {
        clientesList = new ArrayList<Clientes>();
        this.vista = vista;
    }*/


    public ArrayList<Clientes> getClientesList() {
        return clientesList;
    }

    public void setClientesList(ArrayList<Clientes> clientesList) {
        this.clientesList = clientesList;
    }


    public void iniciardatosC (){

        clientesList = Percistencia.cargarClientes("Clientes.txt");

    }
    public void agregar() throws Exception {
        clientes1 = new Clientes(vista.SolicitarID(),vista.SolicitarNombre(),
                vista.SolicitarApellido(),
                vista.SolicitarEdad(),
                vista.SolicitarDomicilio(),
                vista.SolicitarCorreo(),
                vista.SolicitarNumeroTelefono());
       clientesList.add(clientes1);
        Percistencia.guardarClientes(clientesList,"Clientes.txt");
    } //Método agregar productos



    public int buscar(String id){
        String ideobtenido =clientes1.getId();
        for (int i = 0; i < clientesList.size(); i++) {
          //  String newid = clientesLis.get(i).getId();

            if (ideobtenido.equals(clientesList.get(i).getId())) {
                System.out.println(i);
                return i;
            }//
        }
        return -1;//Código de producto no encotrado

    } //Método que buscas el codigo del producto



    public boolean eliminarProducto (String id){
        int compara = buscar(id);
        if (compara != -1) {
            clientesList.remove(compara);//elimina el producto del Array
            return true;
        }else {

            return false;
        }
    }//Metodo para eliminar productos



    public void modificarMenuClientes(String id) throws Exception {
        int  compara = buscar(id);
        if(compara != -1 ) {
            vista.imprimirInfoProd(clientesList.get(compara));
            Integer opcion = 0;
            while (opcion != 5) {
                switch (vista.MenuModificarCliente()) {
                    case 1:

                        vista.imprimirInfoProd(clientesList.get(compara));
                        clientesList.get(compara).setId(vista.SolicitarID());

                        break;
                    case 2:

                        vista.imprimirInfoProd(clientesList.get(compara));
                        clientesList.get(compara).setNombre(vista.SolicitarNombre());

                        break;
                    case 3:

                        vista.imprimirInfoProd(clientesList.get(compara));
                        clientesList.get(compara).setApellido(vista.SolicitarApellido());

                        break;
                    case 4:

                        vista.imprimirInfoProd(clientesList.get(compara));
                        clientesList.get(compara).setEdad(vista.SolicitarEdad());

                        break;
                    case 5:

                        vista.imprimirInfoProd(clientesList.get(compara));
                        clientesList.get(compara).setDomicilio(vista.SolicitarDomicilio());

                        break;
                    case 6:

                        vista.imprimirInfoProd(clientesList.get(compara));
                        clientesList.get(compara).setCorreo(vista.SolicitarCorreo());

                        break;
                    case 7:

                        vista.imprimirInfoProd(clientesList.get(compara));
                        clientesList.get(compara).setNumTel(vista.SolicitarNumeroTelefono());

                        break;

                    case 8:
                        opcion = 8;
                        break;
                }//fin switch
            }//llave final del while
        }//llave final del if
    }//Método para modificar los atributos


    public void MenudeClientes() throws Exception {
        Integer opcion=0; ;
        while(opcion != 5){
            switch (vista.MenuCliente()){
                case 1:
                    agregar();
                    break;
                case 2:
                    String  indice = vista.SolicitarID();
                    vista.imprimeInfoBorrado(eliminarProducto(indice));

                    break;
                case 3:
                    vista.SolicitarID();
                    modificarMenuClientes(clientes1.getId());

                    break;
                case 4:
                    vista.imprimirInfoTotalCli(clientesList);

                    break;
                case 5:
                    opcion = 5;
                    break;
            } //fin del switch
        } //fin del while
    } //fin de Menu de Tienda

}
