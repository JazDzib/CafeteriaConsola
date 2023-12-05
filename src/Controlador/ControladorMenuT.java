package Controlador;

import Modulo.Agregar;
import Modulo.MenuTienda;
import Modulo.Percistencia;
import Vista.VistaMenu;

import java.util.ArrayList;

public class ControladorMenuT implements Agregar{
    private ArrayList<MenuTienda> menuTList;
    private VistaMenu vista;
    private MenuTienda menu1;

    /**
     * Establece la lista del menú de platillos.
     * @param menuTList Lista de menú a establecer.
     */
    public void setMenuTList(ArrayList<MenuTienda> menuTList) {
        this.menuTList = menuTList;

        /**
         * Obtener lista de platillo
         * @return Lista de platillo.
         */
    }
    public ArrayList<MenuTienda> getMenuTList() {
        return menuTList;
    }

    /**
     * Constructor de la clase ControladorMenuT
     * @param vista Vista asociada al controlador.
     */
    ControladorMenuT(VistaMenu vista){
        menuTList =  new ArrayList<>();
        this.vista=vista;


/**
 * Inicializa constructor para los datos cargando el menú desde un archivo.
 */
    }
    public void iniciardatos (){

        menuTList = Percistencia.cargarMenu("Menu.txt");
    }

    /**
     * Agrega un nuevo platillo a la lista y guarda la lista actualizada en un archivo.
     * @throws Exception Si ocurre un error durante la adición.
     */

    public void agregar() throws Exception {
        menu1 = new MenuTienda(vista.SolicitarCodigo(),
                vista.SolicitarCategria(),
                vista.SolicitarProducto(),
                vista.SolicitarPrecio(),
                vista.SolicitarDescripcion());
        menuTList.add(menu1);
        Percistencia.guardarMenu(menuTList,"Menu.txt");
    } //Método agregar productos


    /**
     * Busca el índice de un platillo por su código.
     * @param codigo Código del platillo a buscar.
     * @return Índice del platillo si se encuentra.
     * <p>return -1; Si Código de producto no encotrado</p>
     */
    public int buscar(String codigo){
        //String codigo =menu1.getCodigo();
            for (int i = 0; i < menuTList.size(); i++) {
               String newcodigo = menuTList.get(i).getCodigo();

                if (codigo.equals(menuTList.get(i).getCodigo())) {
                    System.out.println(i);
                    return i;
                }//
            }
        return -1;
    }

    /**
     * Elimina un platillo de la lista
     * @param codigo Código del platillo a eliminar.
     * @return True o False.
     * <p>true si se eliminó correctamente el producto del Array.</p>
     * <p>false si no se pudo eliminar.</p>
     */
        public boolean eliminarProducto (String codigo){
            int compara = buscar(codigo);
            if (compara != -1) {
                menuTList.remove(compara);
                return true;
            }else {

                return false;
            }
        }

    /**
     * Modifica los atributos de un platillo por su código.
     * @param codigo Código del menú a modificar.
     * @throws Exception Si ocurre un error durante la modificación.
     */
    public void modificarMenu(String codigo) throws Exception {
       int  compara = buscar(codigo);
        if(compara != -1 ) {
            vista.imprimirInfoProd(menuTList.get(compara));
            Integer opcion = 0;
            while (opcion != 5) {
                switch (vista.MenuModificarMenu()) {
                    case 1:

                        vista.imprimirInfoProd(menuTList.get(compara));
                        menuTList.get(compara).setCategoria(vista.SolicitarCategria());

                        break;
                    case 2:

                        vista.imprimirInfoProd(menuTList.get(compara));
                        menuTList.get(compara).setProducto(vista.SolicitarProducto());

                        break;
                    case 3:

                        vista.imprimirInfoProd(menuTList.get(compara));
                        menuTList.get(compara).setPrecio(vista.SolicitarPrecio());

                        break;
                    case 4:

                        vista.imprimirInfoProd(menuTList.get(compara));
                        menuTList.get(compara).setDescripcion(vista.SolicitarDescripcion());

                        break;
                    case 5:
                        opcion = 5;
                        break;
                }//fin switch
            }//llave final del while
        }//llave final del if
    }//Método para modificar los atributos

    /**
     * Menú de la tienda con opciones para agregar, eliminar, modificar y mostrar información.
     * @throws Exception Si ocurre un error durante la ejecución del menú.
     */
    public void MenuDELaTienda() throws Exception {
        Integer opcion=0; ;
        while(opcion != 5){
            switch (vista.Menu()){
                case 1:
                    agregar();
                    break;
                case 2:
                    String  indice = vista.SolicitarCodigo();
                    vista.imprimeInfoBorrado(eliminarProducto(indice));

                    break;
                case 3:
                   vista.SolicitarCodigo();
                    modificarMenu(menu1.getCodigo());

                    break;
                case 4:
                    vista.imprimirInfoTotal(menuTList);

                    break;

                case 5:
                    opcion = 5;
                    break;
            } //fin del switch
        } //fin del while
    } //fin de Menu de Tienda



}
