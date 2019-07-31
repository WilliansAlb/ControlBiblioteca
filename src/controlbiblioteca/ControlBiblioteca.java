/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlbiblioteca;

import FileManager.Controlador;

/**
 *
 * @author willians
 */
public class ControlBiblioteca {
   
    public static void main(String args[]){
        Controlador.paths();
        Menu ir=new Menu();
        ir.setVisible(true);
    }   
}
