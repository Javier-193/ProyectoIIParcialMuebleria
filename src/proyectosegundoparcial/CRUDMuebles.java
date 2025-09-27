/*
 * Chimaltenango, 26 de septiembre 2025
 * Programador: Javier Chex
 * Descripcion: Clase CRUD Muebles (Crear, Leer,Actualizar y Eliminar)
 */
package proyectosegundoparcial;

import java.io.*;
import java.util.*;

public class CRUDMuebles {
    
    private static final String FILE_NAME = "Muebles.txt";
    
    // Crear
    public void Crear(Mueble mueble){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, true))){
            
            bw.write(mueble.toString());
            bw.newLine();
            
        } catch (IOException e){
            e.printStackTrace();
        }
    } // Fin crear
    
    
    // Leer
    public List<Mueble> Leer(){
        
        List<Mueble> lista = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))){
            String linea;
            while((linea = br.readLine()) != null){
                String[] datos = linea.split("--");
                if(datos.length == 5){
                    lista.add(new Mueble(datos[0], datos[1], Double.parseDouble(datos[2]), datos[3], datos[4]));
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return lista;
    } // Fin leer
    
    
    // Actualizar
    public void Actualizar(String codigo, Mueble nuevo){
        List<Mueble> lista  = Leer();
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))){
            for(Mueble m : lista){
                if(m.getCodigo().equals(codigo)){
                    bw.write(nuevo.toString());
                }else{
                    bw.write(m.toString());
                }
                bw.newLine();   
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    } // Fin Actualizar
    
    
    // Eliminar
    public void Eliminar(String codigo){
        List<Mueble> lista  = Leer();
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))){
            for(Mueble m : lista){
                if(!m.getCodigo().equals(codigo)){
                    bw.write(m.toString());
                    bw.newLine();
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    } // Fin Eliminar
    
} // Fin clase CRUDMuebles
