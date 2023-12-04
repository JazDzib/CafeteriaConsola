package Controlador;

import Modulo.Almacen;
import Modulo.MenuTienda;
import Modulo.Percistencia;
import Vista.VistaAlmacen;
import Vista.VistaMenu;

import java.util.ArrayList;

public class ControladorAlmacen {
    private ArrayList<Almacen> almacenList;
    private VistaAlmacen vista;
    private Almacen almacen1;

    public void setMenuTList(ArrayList<Almacen> menuTList) {
        this.almacenList = menuTList;
    }
    public ArrayList<Almacen> getMenuTList() {
        return almacenList;
    }

    ControladorAlmacen(VistaAlmacen vista){
        almacenList =  new ArrayList<>();
        this.vista=vista;

    }//Constructor
    public void iniciardatos (){

        almacenList = Percistencia.cargarIngredientes("Almacen.txt");

    }

    public void agregar() throws Exception {
        almacen1 = new Almacen(vista.SolicitarCodigo(),
                vista.SolicitarCategoria(),
                vista.SolicitarNombre(),
                vista.SolicitarExistencias());
        almacenList.add(almacen1);
        Percistencia.guardarIngredientes(almacenList,"Almacen.txt");
    } //Método agregar productos



    public int buscar(String codigo){
        //String codigo =menu1.getCodigo();
        for (int i = 0; i < almacenList.size(); i++) {
            String newcodigo = almacenList.get(i).getCodigo();

            if (codigo.equals(almacenList.get(i).getCodigo())) {
                System.out.println(i);
                return i;
            }//
        }
        return -1;//Código de producto no encotrado

    } //Método que buscas el codigo del producto



    public boolean eliminarProducto (String codigo){
        int compara = buscar(codigo);
        if (compara != -1) {
            almacenList.remove(compara);//elimina el producto del Array
            return true;
        }else {

            return false;
        }
    }//Metodo para eliminar productos



    public void modificarMenu(String codigo) throws Exception {
        int  compara = buscar(codigo);
        if(compara != -1 ) {
            vista.imprimirInfoIngred(almacenList.get(compara));
            Integer opcion = 0;
            while (opcion != 4) {
                switch (vista.MenuModificarAlmacen()) {
                    case 1:

                        vista.imprimirInfoIngred(almacenList.get(compara));
                        almacenList.get(compara).setCategoria(vista.SolicitarCategoria());

                        break;
                    case 2:

                        vista.imprimirInfoIngred(almacenList.get(compara));
                        almacenList.get(compara).setNombre(vista.SolicitarNombre());

                        break;
                    case 3:

                        vista.imprimirInfoIngred(almacenList.get(compara));
                        almacenList.get(compara).setExistencia(vista.SolicitarExistencias());

                        break;
                    case 4:

                        opcion = 4;
                        break;

                }//fin switch
            }//llave final del while
        }//llave final del if
    }//Método para modificar los atributos


    public void MenuDeAlmacen() throws Exception {
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
                    modificarMenu(almacen1.getCodigo());

                    break;
                case 4:
                    vista.imprimirInfoTotalIngred(almacenList);

                    break;
                case 5:
                    opcion = 5;
                    break;
            } //fin del switch
        } //fin del while
    } //fin de Menu de Tienda

}
