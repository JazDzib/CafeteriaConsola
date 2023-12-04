package Vista;

import java.util.Scanner;

public class VistaControladorP {
    private Scanner lectura;
    public Integer Menu(){
        lectura = new Scanner(System.in);
        System.out.println("Menú");
        System.out.println("1- Menu Tienda ");
        System.out.println("2- Registro de Pedido ");
        System.out.println("3- Almacen ");
        System.out.println("4- Registro de Ventas");
        System.out.println("5- Clientes");
        System.out.println("6- Mesas y sillas");
        System.out.println("7- Ticket");
        System.out.println("8- Generador de reportes");
        System.out.println("9- Salir");
        System.out.println("Opción: ");
        return lectura.nextInt();
    }

    public void MsgGracias(){
        System.out.println("Gracias por utilizar el sistema");
    }

    public void MsgVersion(){
        System.out.println("Control Escolar ver. 0.1");
    }
}
