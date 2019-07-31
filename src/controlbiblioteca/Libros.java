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
public class Libros implements Serializable{
    public static final String PATH = "./Biblio/Libros";
    
    private String titulo;
    private String autor;
    private String editorial;
    private String fecha_publicacion;
    private String codigo;
    private int cantidad;
    private int cantidad_prestados;

    public Libros() {
    }

    public Libros(String titulo, String autor, String editorial, String fecha_publicacion, String codigo, int cantidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.fecha_publicacion = fecha_publicacion;
        this.codigo = codigo;
        this.cantidad = cantidad;
    }

    public Libros(String titulo, String autor, String codigo, int cantidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.cantidad = cantidad;
    }
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getFecha_publicacion() {
        return fecha_publicacion;
    }

    public void setFecha_publicacion(String fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad_prestados() {
        return cantidad_prestados;
    }

    public void setCantidad_prestados(int cantidad_prestados) {
        this.cantidad_prestados = cantidad_prestados;
    }
    
    public boolean verificarLibro1 (String aVerificar, String busqueda){
        if (aVerificar.equalsIgnoreCase("titulo") || aVerificar.equalsIgnoreCase("autor") || aVerificar.equalsIgnoreCase("editorial")){
            return buscarPorNombre(busqueda);
        } else if (aVerificar.equalsIgnoreCase("codigo")){
            return buscarPorCodigo(busqueda);
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
    public boolean buscarPorCodigo(String buscando){
        int longitud = buscando.length();
        String num = "0123456789";
        String guion = "-";
        int longitudABC = num.length();
        int correcto = 0;
        if (longitud==7){
            for (int i = 0; i< 3; i++){
                for (int u = 0; u < longitudABC; u++){
                    if (buscando.charAt(i)==num.charAt(u)){
                        correcto++;
                    }
                }
            }
            if (correcto==3 && buscando.charAt(3)==guion.charAt(0)){
                String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                int correcto2 = 0;
                for (int i = 4; i< 7; i++){
                    for (int u = 0; u < abc.length(); u++){
                        if (buscando.charAt(i)==abc.charAt(u)){
                            correcto2++;
                        }
                    }
           
                }
                if (correcto2==3)  {
                    javax.swing.JOptionPane.showMessageDialog(null, "Sí es un codigo de libro valido");
                    return true;
                }
            }   else {
                javax.swing.JOptionPane.showMessageDialog(null, "No es un codigo de libro valido");
                return false;
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "No es un codigo de libro valido");
            return false;
        }
     return false;   
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
