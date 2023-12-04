package Modulo;

import java.io.Serializable;

public class Ticket extends RegistroVentas implements Serializable {
    public Ticket(String id, String fecha, String nombreC, int precio, int prodVend) {
        super(id, fecha, nombreC, precio, prodVend);


    }

    @Override
    public String toString() {
        return super.toString();
    }
}
