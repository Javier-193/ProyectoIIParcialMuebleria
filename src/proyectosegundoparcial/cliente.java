/*
 * Chimaltenango, 26 de septiembre 2025
 * Programador: Javier Chex
 * Descripcion: Clase cliente
 */
package proyectosegundoparcial;

public class cliente {
    
    // Atributos de la clase cliente
    private String DPI;
    private String Nombre;
    private String Telefono;
    
    // Metodo constructor
    public cliente(String DPI, String Nombre, String Telefono) {
        this.DPI = DPI;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
    } // Fin metodo constructor
    
    // Getters y Setters

    public String getDPI() {
        return DPI;
    }
    public void setDPI(String DPI) {
        this.DPI = DPI;
    }

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTelefono() {
        return Telefono;
    }
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
    // Metodo toString

    @Override
    public String toString() {
        return  DPI + "," + Nombre + "," + Telefono;
    } // Fin metodo toString 
    
} // Fin cleas Cliente
