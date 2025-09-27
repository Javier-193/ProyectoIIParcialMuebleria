/*
 * Chimaltenango, 26 de septiembre 2025
 * Programador: Javier Chex
 * Descripcion: Clase cliente
 */
package proyectosegundoparcial;

public class Compra extends cliente {
   
    // Atributos clase Compra
    private int cantidadProd;
    private String nomProducto;
    private String tipoPago;
    
    // Metodo constructor
    public Compra(int cantidadProd, String nomProducto, String tipoPago, String DPI, String Nombre, String Telefono) {
        super(DPI, Nombre, Telefono);
        this.cantidadProd = cantidadProd;
        this.nomProducto = nomProducto;
        this.tipoPago = tipoPago;
    } // Fin metodo constructor
    
    // Gettters y Setters

    public int getCantidadProd() {
        return cantidadProd;
    }
    public void setCantidadProd(int cantidadProd) {
        this.cantidadProd = cantidadProd;
    }

    public String getNomProducto() {
        return nomProducto;
    }
    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public String getTipoPago() {
        return tipoPago;
    }
    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }
    
    // Metodo toString
    @Override
    public String toString() {
        return super.toString()+"," + cantidadProd + "," + nomProducto + "," + tipoPago; //To change body of generated methods, choose Tools | Templates.
    } // Fin metodo toString
    
    // Para mostrar en pantalla
    public String mostrar() {
    return " | DPI: " + getDPI() +
           " | Nombre: " + getNombre() +
           " | Telefono: " + getTelefono() +
           " | Cantidad del producto: " + cantidadProd +
           " | Nombre del producto: " + nomProducto +
           " | Tipo de pago: " + tipoPago;
        } // Fin metodo mostar   
    
} //Fin clase Compra
