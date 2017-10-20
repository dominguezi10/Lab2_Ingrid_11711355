/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingriddominguez_lab2;

import javax.swing.JOptionPane;

/**
 *
 * @author 1234
 */
public class IngridDominguez_lab2 {

    
    public static void main(String[] args) {
        String resp = "e";
        while(resp != "e"|| resp == "E" ){
            resp = JOptionPane.showInputDialog("Ingresa tu opcion: \n"
                    + "a.- Administracion\n"
                    + "b.- Matricula \n"
                    + "c.- Log in\n"
                    + "e.- Salir");
        }// fin del while de respuesta de usuario
    }// fin del main
    
}// fin de la clase
