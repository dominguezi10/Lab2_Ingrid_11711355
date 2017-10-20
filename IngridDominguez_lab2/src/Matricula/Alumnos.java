
package Matricula;

import java.util.ArrayList;

/**
 *
 * @author 1234
 */
public class Alumnos {
    public String nombreAlumno;
    public int numeroDeCuenta;
    public String carrera;
    public int edad;
    public double dineroDisponible;
    public String usuarioAlumno;
    public String contraseñaAlumno;
    public String secciones;
    public ArrayList <String> clasesCursando  = new ArrayList();
    
    public Alumnos(String nA, int nC, String c, int e, double dd, String uA, String cA, ArrayList cc){
        nombreAlumno = nA;
        numeroDeCuenta = nC;
        carrera =c;
        edad   = e;
        dineroDisponible  = dd;
        usuarioAlumno = uA;
        contraseñaAlumno = cA;
        clasesCursando = cc;
        secciones = Secciones(clasesCursando);
    }// fin del metodo constructor
    
    
    public void setUsuario(String u){
        usuarioAlumno = u;
    }// mutador 
    
    public String getUsuario(){
        return usuarioAlumno;
    } //mutador
    
         @Override
    public String toString(){
        return "Nombre : "+nombreAlumno
                +"\nNumero de Cuenta : "+numeroDeCuenta
                +"\nCarrera: "+carrera
                +"\nEdad: "+edad
                +"\nDinero Disponible: "+dineroDisponible
                +"\nUsuario Alumno: "+usuarioAlumno
                +"\nContraseña Alumno: "+contraseñaAlumno
                +"\nClases Cursando: "+secciones+"\n";
    }// fin del metodo
    
    public String Secciones(ArrayList a){
        String Secciones = "";
        for (int i = 0; i < a.size(); i++) {
            Secciones += "" +i+" "+a.get(i)+ "\n";
        }
        return Secciones;
    }
}// fin de la clase
