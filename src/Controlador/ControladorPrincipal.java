package Controlador;

import Modulo.Percistencia;
import Vista.*;

public class ControladorPrincipal {
    private VistaControladorP vistacontroladorP;
    private Percistencia persistenciaA;
    private VistaMenu vistamenu;
    private ControladorMenuT controlMenu;
    private ControladorMenuT controla;
    private VistaClientes vistaclien;
    private ControladorClientes controlClin;
    private VistaLevantarP vistaPedido;
    private ControladorLevantarP controlPedido;
    private VistaAlmacen vistaAlmacen;
    private ControladorAlmacen controlAlmacen;
    private VistaRegistroV vistaVenta;
    private ControladorVenta controlVenta;

    public ControladorPrincipal(VistaControladorP vistacontroladorP) {
        this.vistacontroladorP = vistacontroladorP;
        persistenciaA = new Percistencia();

        vistamenu = new VistaMenu();
        controlMenu = new ControladorMenuT(vistamenu);


        vistaclien =new VistaClientes();
        controlClin  = new ControladorClientes(vistaclien);

        vistaPedido =new VistaLevantarP();
        controlPedido  = new ControladorLevantarP(vistaPedido);

        vistaAlmacen =new VistaAlmacen();
        controlAlmacen  = new ControladorAlmacen(vistaAlmacen);
        vistaVenta =new VistaRegistroV();
        controlVenta  = new ControladorVenta(vistaVenta);



    }

    public void iniciarListas(){
        controlMenu.iniciardatos();
        controlPedido.iniciardatos();
        controlAlmacen.iniciardatos();
        controlClin.iniciardatosC();
        controlVenta.iniciardatos();

    }



    public Percistencia obtenerPersistencia(){
        return persistenciaA;
    }

    public ControladorMenuT obtenerControladorMenu(){
        return controlMenu;
    }
    public ControladorClientes obtenerControladorClientes(){return controlClin; }
    public ControladorLevantarP obtenerLevantarPedido(){return controlPedido ; }
    public ControladorAlmacen obtenerAlmacen(){return controlAlmacen ; }

    public void MenuPrincipal() throws Exception {
        Integer opcion=0;
        while(opcion != 7){
            switch (vistacontroladorP.Menu()){
                case 1:
                    controlMenu.MenuDELaTienda();
                    break;
                case 2:
                    controlPedido.MenuLevantarPe();

                    break;
                case 3:
                    controlAlmacen.MenuDeAlmacen();

                    break;
                case 4:
                    controlVenta.MenuVenta();


                    break;
                case 5:
                    controlClin.MenudeClientes();

                    break;

                case 6:
                   controlVenta.GenerarTicket();

                    break;

                case 7:
                    opcion = 7;
                    vistacontroladorP.MsgGracias();

                    break;

            } //fin del switch
        } //fin del while
    }
}
