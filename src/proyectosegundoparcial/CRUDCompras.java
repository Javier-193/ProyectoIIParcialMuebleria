/*
 * Chimaltenango, 26 de septiembre 2025
 * Programador: Javier Chex
 * Descripcion: Clase CRUD Compras (Crear, Leer,Actualizar y Eliminar)
 */
package proyectosegundoparcial;

import java.io.*;
import java.util.*;

public class CRUDCompras {

    private static final String FILE_NAME = "Compras.txt";

    // Crear
    public void crear(Compra compra) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            bw.write(compra.toString());
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Leer
    public List<Compra> leer() {
        List<Compra> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 6) {
                    String dpi = datos[0];
                    String nombre = datos[1];
                    String telefono = datos[2];
                    int cantidad = Integer.parseInt(datos[3]);
                    String producto = datos[4];
                    String tipoPago = datos[5];
                    lista.add(new Compra(cantidad, producto, tipoPago, dpi, nombre, telefono));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista;
    }

    // Actualizar
    public void actualizar(String DPI, Compra nuevaCompra) {
        List<Compra> lista = leer();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Compra c : lista) {
                if (c.getDPI().equals(DPI)) {
                    bw.write(nuevaCompra.toString());
                } else {
                    bw.write(c.toString());
                }
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Eliminar
    public void eliminar(String DPI) {
        List<Compra> lista = leer();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Compra c : lista) {
                if (!c.getDPI().equals(DPI)) {
                    bw.write(c.toString());
                    bw.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
    