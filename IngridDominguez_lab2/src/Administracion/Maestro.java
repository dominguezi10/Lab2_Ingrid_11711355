
package Administracion;

import java.util.ArrayList;

/**
 *
 * @author 1234
 */
public class Maestro {
    public String nombre;
    public String titulo;
    public String maestria;
    public String usuario;
    public String contraseña;
    public int CantidaMaxClases;
    public ArrayList <String> listaClases = new ArrayList();
    
    public Maestro(String n, String t, String m, String u, String c, int CMC){
        nombre = n;
        titulo = t;
        maestria = m;
        usuario = u;
        contraseña = c;
        CantidaMaxClases = CMC;
    }// fin del metodo constructor
    
    
}// fin de la clase
