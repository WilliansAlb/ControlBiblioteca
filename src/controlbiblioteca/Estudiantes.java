/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlbiblioteca;

/**
 *
 * @author willians
 */
public class Estudiantes {
    
    private String nombre;
    private int carnet;
    private String fechaNacimiento;
    private String[] carrera={"Ingeniería","Medicina","Derecho","Arquitectura","Administración"};

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

    public String[] getCarrera() {
        return carrera;
    }

    public void setCarrera(String[] carrera) {
        this.carrera = carrera;
    }
    
    public void verificarEstudiante(String aVerificar, String busqueda){
        if (aVerificar.equalsIgnoreCase("nombre")){
            buscarPorNombre(busqueda);
        } else if (aVerificar.equalsIgnoreCase("carné")){
            buscarPorCarne(busqueda);
        } else if (aVerificar.equalsIgnoreCase("carrera")){
            mostrarPorCarrera(busqueda);
        } 
    }
    public void buscarPorNombre(String buscando){
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
        } else
        {
            javax.swing.JOptionPane.showMessageDialog(null, "No es un nombre");
        }
    }
    public void buscarPorCarne(String buscando){
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
        } else
        {
            javax.swing.JOptionPane.showMessageDialog(null, "No es un carné valido");
        }
    }
    public void mostrarPorCarrera(String buscando){
        int buscan = Integer.parseInt(buscando);
        switch(buscan){
            case 1: 
            {
            System.out.println("Ingeniería");
            }
            case 2:
            {
            System.out.println("Medicina");
            }
            case 3:
            {
            System.out.println("Derecho");
            }
            case 4:
            {
            System.out.println("Arquitectura");
            }
            case 5:
            {
            System.out.println("Administración");
            }
            default:
            {
            System.out.println("No es una carrera");
            }
        }
    
    
    }
}
