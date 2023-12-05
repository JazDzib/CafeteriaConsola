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

    /**
     * Constructor
     * @param vista Vista asociada al controlador.
     */
    public ControladorClientes(VistaClientes vista) {
        clientesList = new  ArrayList<>();
        this.vista = vista;
    }

    /**
     * Arraylist de clientes.
     * @return Lista de los clientes.
     */
    public ArrayList<Clientes> getClientesList() {
        return clientesList;
    }

    /**
     * @param clientesList Lista de clientes a establecer.
     */
    public void setClientesList(ArrayList<Clientes> clientesList) {
        this.clientesList = clientesList;
    }

    public void iniciardatosC (){
        clientesList = Percistencia.cargarClientes("Clientes.txt");
    }

    /**
     * Agregar cliente nuevo.
     * @throws Exception Si ocurre un error durante la adición.
     */
    public void agregar() throws Exception {
        clientes1 = new Clientes(vista.SolicitarID(),vista.SolicitarNombre(),
                vista.SolicitarApellido(),
                vista.SolicitarEdad(),
                vista.SolicitarDomicilio(),
                vista.SolicitarCorreo(),
                vista.SolicitarNumeroTelefono());
       clientesList.add(clientes1);
        Percistencia.guardarClientes(clientesList,"Clientes.txt");
    }

    /**
     * Buscar cliente.
     * @param id ID del cliente a buscar.
     * @return Índice del cliente si se encuentra, de lo contrario devuelve -1.
     */
    public int buscar(String id){
        String ideobtenido =clientes1.getId();
        for (int i = 0; i < clientesList.size(); i++) {
          //  String newid = clientesLis.get(i).getId();

            if (ideobtenido.equals(clientesList.get(i).getId())) {
                System.out.println(i);
                return i;
            }//
        }
        return -1;
    }

    /**
     * Eliminar cliente.
     * @param id ID del cliente a eliminar.
     * @return true si se eliminó correctamente, false si no se encontró el cliente.
     */
    public boolean eliminarProducto (String id){
        int compara = buscar(id);
        if (compara != -1) {
            clientesList.remove(compara);//elimina el producto del Array
            return true;
        }else {

            return false;
        }
    }//Metodo para eliminar productos

    /**
     * Modificar atributos.
     * @param id ID del cliente a modificar.
     * @throws Exception Si ocurre un error durante la modificación.
     */
    public void modificarMenuClientes(String id) throws Exception {
        int    compara = buscar(id);
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

    /**
     * Menú de gestión de clientes con opciones para agregar, eliminar, modificar y mostrar información.
     * @throws Exception Si ocurre un error durante la ejecución del menú.
     */
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
