/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administracion;

import java.util.ArrayList;

/**
 *
 * @author 1234
 */
public class Clases {
    public String nombreClase;
    public String seccion;
    public int CantidaMaxAlumnos;
    public String maestro;
    public int unidadesValorativas;
    ArrayList <String> listaNombresAlumnos = new ArrayList();
    
    
    public Clases(String n, String s, int CMA, String m, int uv){
        nombreClase = m;
        seccion = s;
        CantidaMaxAlumnos = CMA;
        maestro = m;
        unidadesValorativas = uv;
    }// metodo contructor
    
    
}// fin de la clase
