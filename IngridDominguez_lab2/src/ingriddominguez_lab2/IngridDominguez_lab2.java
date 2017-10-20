/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingriddominguez_lab2;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import Administracion.Clases;
import Administracion.Maestro;
import Matricula.Alumnos;
/**
 *
 * @author 1234
 */
public class IngridDominguez_lab2 {

    static ArrayList Alumnos_Creados = new ArrayList();
    static ArrayList Maestros_Creados = new ArrayList();
    static ArrayList Clases_Creadas = new ArrayList();
    static ArrayList <String> Secciones = new ArrayList();
    static String secciones = "";
    static int contSeccion = 0;
    public static void main(String[] args) {
        String resp = "p";
        while (!resp.equals("d"
                + "")) {
            resp = JOptionPane.showInputDialog("Ingresa tu opcion: \n"
                    + "a.- Administracion\n"
                    + "b.- Matricula \n"
                    + "c.- Log in\n"
                    + "d.- Salir");

            if (resp.equals("a") || resp.equals("A")) {
                Administracion();
            } else if (resp.equals("b") || resp.equals("B")) {
                Matricula();
            } else if (resp.equals("c") || resp.equals("C")) {

            }// fin de las condiciones
        }// fin del while de respuesta de usuario

        System.out.println("salio del prgrama");
    }// fin del main

    public static void Administracion() {
        String resp = "p";
        while (!resp.equals("e")) {
            resp = JOptionPane.showInputDialog("Ingresa tu opcion: \n"
                    + "a.- Crear Maestros\n"
                    + "b.- Crear Clases\n"
                    + "e.- Regresar");

            if ((resp.equals("a") || resp.equals("A")) && (Clases_Creadas.size() == 0)) {
                JOptionPane.showMessageDialog(null, "Lo siento primero se crean las clases");
            }
            if ((resp.equals("a") || resp.equals("A")) && (Clases_Creadas.size() > 0)) {
                System.out.println("crear maestros");
                CrearMaestro();
                JOptionPane.showMessageDialog(null, impresionMaestro());

            } else if (resp.equals("b") || resp.equals("B")) {
                System.out.println("crear clases");
                
                CrearClase();
                JOptionPane.showMessageDialog(null, impresionClase());
                
            }
        }// fin del while resp usuario

        System.out.println("salistes de la opcion administrar");
    }// metodo para gestionar toda la matricula
    
    public static void Matricula(){
        String nombre = JOptionPane.showInputDialog("Ingresa tu nombre: ");
        int numeroCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu numero de cuenta: "));
        String carrera = JOptionPane.showInputDialog("Ingresa tu carrera: ");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad: "));
        double dineroDisponible = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu dinero Disponible "));
        String usuario = JOptionPane.showInputDialog("Ingresa tu Usuario: ");
        String contraseña = JOptionPane.showInputDialog("Ingresa tu contraseña: ");
        
        ArrayList <String> SeccionesAlumnos = new ArrayList();
        int aumento = 1440;
        int contador  = 0;
        while(contador <= dineroDisponible){
            contador = contador+1440;
            if(contador <=dineroDisponible ){
                break;
            }
            int posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de la secccion: \n"+secciones));
            SeccionesAlumnos.add(Secciones.get(posicion)); 
            
        } // fin del while
        
        //creo el objeto
        Alumnos_Creados.add(new Alumnos(nombre, numeroCuenta, carrera, edad, dineroDisponible,usuario, contraseña, SeccionesAlumnos));
        
        JOptionPane.showMessageDialog(null, impresionAlumno());
    }// fin del metodo para matricular
    
    public static void CrearClase(){
        String nombre = JOptionPane.showInputDialog("Ingresa tu nombre");
        String seccion = JOptionPane.showInputDialog("Ingresa tu seccion:");
        int CMAlumnos = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantida de alumnos maximo:"));
        int unidadesValorativas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantida de unidades valorativas:"));
        
        //creo el objeto
        Clases_Creadas.add(new Clases(nombre, seccion, CMAlumnos, unidadesValorativas));
        secciones += ""+contSeccion+ "- "+seccion+"\n";
        Secciones.add(seccion);
        contSeccion++;
    }// creamos la clase
    
    public static void CrearMaestro(){
        String nombre = JOptionPane.showInputDialog("Ingresa tu nombre");
        String titulo = JOptionPane.showInputDialog("Ingresa tu titulo:");
        String maestria = JOptionPane.showInputDialog("Ingresa tu maestria:");
        String usuario = JOptionPane.showInputDialog("Ingresa tu usuaro:");
        String contraseña = JOptionPane.showInputDialog("Ingresa tu contraseña:");
        int CantidaMaximaClases = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu cantida de clases:"));
        ArrayList <String>  SeccionesMaestro = new ArrayList();
        int contador = 0;
        while(contador < CantidaMaximaClases){
            int posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de la secccion: \n"+secciones));
            SeccionesMaestro.add(Secciones.get(posicion)); 
            contador++;
        }
        
        
        //creo el objeto
        Maestros_Creados.add(new Maestro(nombre, titulo, maestria, usuario, contraseña,CantidaMaximaClases,SeccionesMaestro ));
    }// creamos la clase

    public static String impresionClase(){
        String clases = "";
        for (Object t : Clases_Creadas) {
            if(t instanceof Clases){
                clases+= Clases_Creadas.indexOf(t)+"- "+t+"\n";
            }
        }
        
        return clases;
    }
    
    public static String impresionMaestro(){
        String clases = "";
        for (Object t : Maestros_Creados) {
            if(t instanceof Clases){
                clases+= Maestros_Creados.indexOf(t)+"- "+t+"\n";
            }
        }
        
        return clases;
    }
    
    public static String impresionAlumno(){
        String clases = "";
        for (Object t : Alumnos_Creados) {
            if(t instanceof Alumnos){
                clases+= Alumnos_Creados.indexOf(t)+"- "+t+"\n";
            }
        }
        
        return clases;
    }
}// fin de la clase
