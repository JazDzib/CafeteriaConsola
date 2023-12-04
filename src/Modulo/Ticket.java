package Modulo;

public class Ticket extends RegistroVentas{
    public Ticket(String id, String fecha, String nombreC, int precio, int prodVend) {
        super(id, fecha, nombreC, precio, prodVend);


    }

    @Override
    public String toString() {
        return super.toString();
    }
}
