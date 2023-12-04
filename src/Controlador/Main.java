package Controlador;

import Modulo.Percistencia;
import Vista.VistaControladorP;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
        VistaControladorP vistacontroladorP = new VistaControladorP();
        ControladorPrincipal sistema   = new ControladorPrincipal(vistacontroladorP);
        sistema.iniciarListas();
        sistema.MenuPrincipal();




    }
}
