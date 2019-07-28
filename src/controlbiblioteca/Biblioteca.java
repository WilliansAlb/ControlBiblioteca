/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlbiblioteca;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
/**
 *
 * @author willians
 */
public class Biblioteca extends javax.swing.JFrame{
    Estudiantes estudiante;
    Libros libro;
    Prestamos prestamo;
    Reportes reporte;
    JTabbedPane pestañas;
    JButton cargarArchivos;
    
    public Biblioteca(){
        setTitle ("Biblioteca");
        setSize (750,500);
        setLocationRelativeTo(null);
        iniciarComponentes();
    }
    private void iniciarComponentes(){
        cargarArchivos = new JButton("Cargar archivo");
        cargarArchivos.setBounds(620, 2, 130, 15);
        add(cargarArchivos);
        pestañas = new JTabbedPane();
        estudiante = new Estudiantes();
        libro = new Libros();
        prestamo = new Prestamos();
        reporte = new Reportes();
        pestañas.setBounds(60,150,400,200);
        pestañas.add("Estudiantes",estudiante);
        pestañas.add("Libros", libro);
        pestañas.add("Prestamos", prestamo);
        pestañas.add("Reportes", reporte);
        add(pestañas);
    }
}
