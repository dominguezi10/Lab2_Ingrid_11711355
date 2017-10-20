
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
    public ArrayList <String> clsesCursando  = new ArrayList();
    
    public Alumnos(String nA, int nC, String c, int e, double dd, String uA, String cA){
        nombreAlumno = nA;
        numeroDeCuenta = nC;
        carrera =c;
        edad   = e;
        dineroDisponible  = dd;
        usuarioAlumno = uA;
        contraseñaAlumno = cA;
    }// fin del metodo constructor
}// fin de la clase
