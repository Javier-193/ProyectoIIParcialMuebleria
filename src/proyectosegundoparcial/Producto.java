/*
 * Chimaltenango, 26 de septiembre 2025
 * Programador: Javier Chex
 * Descripcion: Clase Producto
 */
package proyectosegundoparcial;

public class Producto {
    
    // Atributos Clase Producto
    private String Codigo;
    private String Nombre;
    private double Precio;
    
    // Metodo Constructor
    public Producto(String Codigo, String Nombre, double Precio) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Precio = Precio;
    } // Fin metodo constructor
    
    // Getters y Setters
    public String getCodigo() {
        return Codigo;
    }
    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecio() {
        return Precio;
    }
    public void setPrecio(double Precio) {
        this.Precio = Precio;
    } 
    
    // metodo toString, parecido al metodo mostrarDatos()
    @Override
    public String toString() {
        return Codigo + "--" + Nombre + "--" + Precio;
    } // Fin metodo toString
    
    
} // Fin clase Producto

