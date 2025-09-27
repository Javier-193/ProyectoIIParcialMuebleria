/*
 * Chimaltenango, 26 de septiembre 2025
 * Programador: Javier Chex
 * Descripcion: Clase Main (Clase Principal)
 */
package proyectosegundoparcial;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        CRUDMuebles crudMuebles = new CRUDMuebles();
        CRUDCompras crudCompras = new CRUDCompras();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== SISTEMA MUEBLERÍA =====");
            System.out.println("1. CRUD Muebles");
            System.out.println("2. CRUD Compras");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    menuMuebles(sc, crudMuebles);
                    break;
                case 2:
                    menuCompras(sc, crudCompras);
                    break;
            }
        } while (opcion != 3);

        sc.close();
    }

    // Submenú de Muebles
    private static void menuMuebles(Scanner sc, CRUDMuebles crud) {
        int op;
        do {
            System.out.println("\n--- CRUD Muebles ---");
            System.out.println("1. Crear");
            System.out.println("2. Leer");
            System.out.println("3. Actualizar");
            System.out.println("4. Eliminar");
            System.out.println("5. Volver al menú principal");
            System.out.print("Elige una opción: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Código: ");
                    String codigo = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Material: ");
                    String material = sc.nextLine();
                    System.out.print("Tipo: ");
                    String tipo = sc.nextLine();
                    crud.Crear(new Mueble(codigo, nombre, precio, material, tipo));
                    break;

                case 2:
                    List<Mueble> listaMuebles = crud.Leer();
                    System.out.println("--- Lista de Muebles ---");
                    for (Mueble m : listaMuebles) {
                        System.out.println(m.mostrar());
                    }
                    break;

                case 3:
                    System.out.print("Código del mueble a actualizar: ");
                    String codAct = sc.nextLine();
                    System.out.print("Nuevo Nombre: ");
                    String nuevoNombre = sc.nextLine();
                    System.out.print("Nuevo Precio: ");
                    double nuevoPrecio = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Nuevo Material: ");
                    String nuevoMaterial = sc.nextLine();
                    System.out.print("Nuevo Tipo: ");
                    String nuevoTipo = sc.nextLine();
                    crud.Actualizar(codAct, new Mueble(codAct, nuevoNombre, nuevoPrecio, nuevoMaterial, nuevoTipo));
                    break;

                case 4:
                    System.out.print("Código del mueble a eliminar: ");
                    String codDel = sc.nextLine();
                    crud.Eliminar(codDel);
                    break;
            }
        } while (op != 5);
    }

    // Submenú de Compras
    private static void menuCompras(Scanner sc, CRUDCompras crud) {
        int op;
        do {
            System.out.println("\n--- CRUD Compras ---");
            System.out.println("1. Crear");
            System.out.println("2. Leer");
            System.out.println("3. Actualizar");
            System.out.println("4. Eliminar");
            System.out.println("5. Volver al menú principal");
            System.out.print("Elige una opción: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.print("DPI: ");
                    String DPI = sc.nextLine();
                    System.out.print("Nombre: ");
                    String Nombre = sc.nextLine();
                    System.out.print("Teléfono: ");
                    String Telefono = sc.nextLine();
                    System.out.print("Cantidad del producto: ");
                    int cantidadProd = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nombre del producto: ");
                    String nomProducto = sc.nextLine();
                    System.out.print("Tipo de pago: ");
                    String tipoPago = sc.nextLine();

                    crud.crear(new Compra(cantidadProd, nomProducto, tipoPago, DPI, Nombre, Telefono));
                    break;

                case 2:
                    List<Compra> listaCompras = crud.leer();
                    System.out.println("--- Lista de Compras ---");
                    for (Compra c : listaCompras) {
                        System.out.println(c.mostrar());
                    }
                    break;

                case 3:
                    System.out.print("DPI de la compra a actualizar: ");
                    String dpiAct = sc.nextLine();
                    System.out.print("Nuevo Nombre: ");
                    String nuevoNombre = sc.nextLine();
                    System.out.print("Nuevo Teléfono: ");
                    String nuevoTel = sc.nextLine();
                    System.out.print("Nueva Cantidad: ");
                    int nuevaCantidad = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nuevo Producto: ");
                    String nuevoProd = sc.nextLine();
                    System.out.print("Nuevo Tipo de pago: ");
                    String nuevoPago = sc.nextLine();

                    crud.actualizar(dpiAct, new Compra(nuevaCantidad, nuevoProd, nuevoPago, dpiAct, nuevoNombre, nuevoTel));
                    break;

                case 4:
                    System.out.print("DPI de la compra a eliminar: ");
                    String dpiDel = sc.nextLine();
                    crud.eliminar(dpiDel);
                    break;
            }
        } while (op != 5);
    }
}
