package Modulo;

import java.io.Serializable;
import java.util.ArrayList;

public class Ticket extends RegistroVentas implements Serializable {
    public Ticket(String fecha, String nombreC, int mesa, ArrayList<LevantarPedido> datosPedido) {
        super(fecha, nombreC, mesa, datosPedido);
    }

    public Ticket() {
    }

    public void GenerarTicket() {
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

    }
}
