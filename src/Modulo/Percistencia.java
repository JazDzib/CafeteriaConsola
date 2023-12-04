package Modulo;

import java.io.*;
import java.util.ArrayList;

public class Percistencia {

    public static void guardarMenu(ArrayList<MenuTienda> menuTlist, String nombreArchivo) {
        try (ObjectOutputStream salidaM = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            salidaM.writeObject(menuTlist);
            System.out.println("Lista de platillos guardada con éxito en " + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<MenuTienda> cargarMenu(String nombreArchivo) {
        ArrayList<MenuTienda> listaLeida = new ArrayList<>();
        try (ObjectInputStream entradaM = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            listaLeida = (ArrayList<MenuTienda>) entradaM.readObject();
            System.out.println("Lista de platillos cargada con éxito desde " + nombreArchivo);
        } catch (FileNotFoundException e) {
            System.out.println("El archivo " + nombreArchivo + " no existe. Se creará uno nuevo.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return listaLeida;
    }
    public static void guardarClientes(ArrayList<Clientes> clientesList, String nombreArchivo) {
        try (ObjectOutputStream salidaC = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            salidaC.writeObject(clientesList);
            System.out.println("Lista de clientes guardada con éxito en " + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Clientes> cargarClientes(String nombreArchivo) {
        ArrayList<Clientes> listaLeida = new ArrayList<>();
        try (ObjectInputStream entradaC = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            listaLeida = (ArrayList<Clientes>) entradaC.readObject();
            System.out.println("Lista de clientes cargada con éxito desde " + nombreArchivo);
        } catch (FileNotFoundException e) {
            System.out.println("El archivo " + nombreArchivo + " no existe. Se creará uno nuevo.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return listaLeida;
    }
    public static void guardarPedidos(ArrayList<LevantarPedido> pedidosList, String nombreArchivo) {
        try (ObjectOutputStream salidaP = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            salidaP.writeObject(pedidosList);
            System.out.println("Lista de pedidos guardada con éxito en " + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<LevantarPedido> cargarPedidos(String nombreArchivo) {
        ArrayList<LevantarPedido> listaLeida = new ArrayList<>();
        try (ObjectInputStream entradaP = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            listaLeida = (ArrayList<LevantarPedido>) entradaP.readObject();
            System.out.println("Lista de pedidos cargada con éxito desde " + nombreArchivo);
        } catch (FileNotFoundException e) {
            System.out.println("El archivo " + nombreArchivo + " no existe. Se creará uno nuevo.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return listaLeida;
    }

    public static void guardarIngredientes(ArrayList<Almacen> almacenList, String nombreArchivo) {
        try (ObjectOutputStream salidaI = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            salidaI.writeObject(almacenList);
            System.out.println("Lista de pedidos guardada con éxito en " + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Almacen> cargarIngredientes(String nombreArchivo) {
        ArrayList<Almacen> listaLeida = new ArrayList<>();
        try (ObjectInputStream entradaI = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            listaLeida = (ArrayList<Almacen>) entradaI.readObject();
            System.out.println("Lista de pedidos cargada con éxito desde " + nombreArchivo);
        } catch (FileNotFoundException e) {
            System.out.println("El archivo " + nombreArchivo + " no existe. Se creará uno nuevo.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return listaLeida;
    }
}
