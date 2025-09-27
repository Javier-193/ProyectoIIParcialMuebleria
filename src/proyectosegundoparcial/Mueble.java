/*
 * Chimaltenango, 26 de septiembre 2025
 * Programador: Javier Chex
 * Descripcion: Clase Mueble
 */
package proyectosegundoparcial;

public class Mueble extends Producto{
    
    // Atributos clase Mueble
    private String Material;
    private String Tipo;
    
    // Metodo constructor 
    public Mueble(String Codigo, String Nombre, double Precio, String Material, String Tipo) {
        super(Codigo, Nombre, Precio);
        this.Material = Material;
        this.Tipo = Tipo;
    } // Fin metodo constructor
    
    // Getters y Setters
    public String getMaterial() {
        return Material;
    }
    public void setMaterial(String Material) {
        this.Material = Material;
    }

    public String getTipo() {
        return Tipo;
    }
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    // metodo toString
    // Para archivo
    @Override
    public String toString() {
        return super.toString() + "--" + Material + "--" + Tipo; //To change body of generated methods, choose Tools | Templates.
    } // Fin metodo toString
    
    // Para mostrar en pantalla
    public String mostrar() {
    return "Código: " + getCodigo() +
           " | Nombre: " + getNombre() +
           " | Precio: Q" + getPrecio() +
           " | Material: " + Material +
           " | Tipo: " + Tipo;
        } // Fin metodo mostar
   
    
} // Fin clase Mueble
