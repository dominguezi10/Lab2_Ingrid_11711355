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
   //public ArrayList <String> listaClases = new ArrayList();
   // ArrayList <String> secciones = new ArrayList();
    
    public Clases(String n, String s, int CMA, int uv){
        nombreClase = n;
        seccion = s;
        CantidaMaxAlumnos = CMA;
        unidadesValorativas = uv;
        maestro = null;
        //listaClases.add(seccion);
    }// metodo contructor

    //mutadores de la seccion
    public void setSeccion( String s){
        seccion = s;
    }
    
    public String getSeccion(){
        return seccion;
    }
    
    @Override
    public String toString(){
        return "Nombre : "+nombreClase
                +"\nSeccion : "+seccion
                +"\nCantida Maxima Alumnos: "+CantidaMaxAlumnos
                +"\nMaestro: "+maestro
                +"\nUnidades Valorativas: "+unidadesValorativas;
    }// fin del metodo
    
    
    
    //mutadores del nombre de la clase
    /*public void setNombreClase(String clase){
        nombreClase = clase;
    }
    
    public String getNombreClase(){
        return nombreClase;
    }*/
}// fin de la clase
