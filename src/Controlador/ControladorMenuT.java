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

    public void setMenuTList(ArrayList<MenuTienda> menuTList) {
        this.menuTList = menuTList;
    }
    public ArrayList<MenuTienda> getMenuTList() {
        return menuTList;
    }

    ControladorMenuT(VistaMenu vista){
        menuTList =  new ArrayList<>();
        this.vista=vista;

    }//Constructor
    public void iniciardatos (){

        menuTList = Percistencia.cargarMenu("Menu.txt");

    }

    public void agregar() throws Exception {
        menu1 = new MenuTienda(vista.SolicitarCodigo(),
                vista.SolicitarCategria(),
                vista.SolicitarProducto(),
                vista.SolicitarPrecio(),
                vista.SolicitarDescripcion());
        menuTList.add(menu1);
        Percistencia.guardarMenu(menuTList,"Menu.txt");
    } //Método agregar productos



    public int buscar(String codigo){
        //String codigo =menu1.getCodigo();
            for (int i = 0; i < menuTList.size(); i++) {
               String newcodigo = menuTList.get(i).getCodigo();

                if (codigo.equals(menuTList.get(i).getCodigo())) {
                    System.out.println(i);
                    return i;
                }//
            }
        return -1;//Código de producto no encotrado

    } //Método que buscas el codigo del producto



        public boolean eliminarProducto (String codigo){
            int compara = buscar(codigo);
            if (compara != -1) {
                menuTList.remove(compara);//elimina el producto del Array
                return true;
            }else {

                return false;
            }
        }//Metodo para eliminar productos



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
