
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
    public double salario;
    public ArrayList <String> listaClases = new ArrayList();
    public String secciones;
    
    public Maestro(String n, String t, String m, String u, String c, int CMC, ArrayList s){
        nombre = n;
        titulo = t;
        maestria = m;
        usuario = u;
        contraseña = c;
        CantidaMaxClases = CMC;
        listaClases = s;
        salario = 1000*CMC;
        secciones = secciones(s);
    }// fin del metodo constructor
    
    
     @Override
    public String toString(){
        return "Nombre : "+nombre
                +"\nTitulo : "+titulo
                +"\nMaestria: "+maestria
                +"\nUsuario: "+usuario
                +"\nContraseña: "+contraseña
                +"\nCantidad Maxima Clases: "+CantidaMaxClases
                +"\nSalario: "+salario
                +"\nSeccione: "+secciones+"\n";
    }// fin del metodo
    
    public String secciones(ArrayList a){
        String Secciones = "";
        for (int i = 0; i < a.size(); i++) {
            Secciones += "" +i+" "+a.get(i)+ "\n";
        }
        return Secciones;
    }
}// fin de la clase
