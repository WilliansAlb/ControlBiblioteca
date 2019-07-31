/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlbiblioteca;

import java.io.Serializable;

/**
 *
 * @author willians
 */
public class Estudiantes implements Serializable{
    public static final String PATH = "./Biblio/Estudiantes";
    
    private String nombre;
    private int carnet;
    private String fechaNacimiento;
    private int carrera;
    private String[] carreraA={"Ingeniería","Medicina","Derecho","Arquitectura","Administración"};

    public Estudiantes() {
    }

    public Estudiantes(String nombre, int carnet, String fechaNacimiento, int carrera) {
        this.nombre = nombre;
        this.carnet = carnet;
        this.fechaNacimiento = fechaNacimiento;
        this.carrera = carrera;
    }

    public Estudiantes(String nombre, int carnet, int carrera) {
        this.nombre = nombre;
        this.carnet = carnet;
        this.carrera = carrera;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getCarrera() {
        return carrera;
    }

    public void setCarrera(int carrera) {
        this.carrera = carrera;
    }
    
    public boolean verificarEstudiante(String aVerificar, String busqueda){
        if (aVerificar.equalsIgnoreCase("nombre")){
            return buscarPorNombre(busqueda);
        } else if (aVerificar.equalsIgnoreCase("carne")){
            return buscarPorCarne(busqueda);
        } else if (aVerificar.equalsIgnoreCase("carrera")){
            return mostrarPorCarrera(busqueda);
        } 
        return false;
    }
    public boolean buscarPorNombre(String buscando){
        int longitud = buscando.length();
        String abc = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZáéíóú ";
        int longitudABC = abc.length();
        int correcto = 0;
        for (int i = 0; i< longitud; i++)
        {
            for (int u = 0; u < longitudABC; u++)
            {
            if (buscando.charAt(i)==abc.charAt(u))
            {
                correcto++;
            }
            }
        }
        if (correcto==longitud){
            System.out.println("Si es un nombre");
            return true;
        } else
        {
            javax.swing.JOptionPane.showMessageDialog(null, "No es un nombre");
            return false;
        }
    }
    public boolean buscarPorCarne(String buscando){
        int longitud = buscando.length();
        String abc = "0123456789";
        int longitudABC = abc.length();
        int correcto = 0;
        for (int i = 0; i< longitud; i++)
        {
            for (int u = 0; u < longitudABC; u++)
            {
            if (buscando.charAt(i)==abc.charAt(u))
            {
                correcto++;
            }
            }
        }
        if (correcto==longitud && correcto==9){
            System.out.println("Si es un carné");
            return true;
        } else
        {
            javax.swing.JOptionPane.showMessageDialog(null, "No es un carné valido");
            return false;
        }
    }
    public boolean mostrarPorCarrera(String buscando){
        int buscan = Integer.parseInt(buscando);
        switch(buscan){
            case 1: 
            {
            System.out.println("Ingeniería");
            return true;
            }
            case 2:
            {
            System.out.println("Medicina");
            return true;
            }
            case 3:
            {
            System.out.println("Derecho");
            return true;
            }
            case 4:
            {
            System.out.println("Arquitectura");
            return true;
            }
            case 5:
            {
            System.out.println("Administración");
            return true;
            }
            default:
            {
            System.out.println("No es una carrera");
            return false;
            }
        }
    }
}
