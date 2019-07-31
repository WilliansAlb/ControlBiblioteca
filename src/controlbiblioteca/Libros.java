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
public class Libros {
    public static final String PATH = "./Biblio/Libros";
    private String titulo;
    private String autor;
    private String editorial;
    private String fechaPublicacion;
    private String codigo;
    private int cantidad;
    private int cantidadLibrosPrestados;

    public Libros(String titulo, String autor, String codigo, int cantidad, String fecha, String editorial) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.fechaPublicacion = fecha;
        this.editorial = editorial; }

    public Libros() {}
    
    @Override
    public String toString() {
       return "Libro: "  + codigo + "; " + titulo  + "; " +  autor + "; " +
               editorial + "; " + fechaPublicacion + "; " + cantidad;
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

    public int getCantidadLibrosPrestados() {
        return cantidadLibrosPrestados;
    }

    public void setCantidadLibrosPrestados(int cantidadLibrosPrestados) {
        this.cantidadLibrosPrestados = cantidadLibrosPrestados;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
    public void verificarLibro1 (String aVerificar, String busqueda){
        if (aVerificar.equalsIgnoreCase("titulo") || aVerificar.equalsIgnoreCase("autor") || aVerificar.equalsIgnoreCase("editorial")){
            buscarPorNombre(busqueda);
        } else if (aVerificar.equalsIgnoreCase("codigo")){
            buscarPorCodigo(busqueda);
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
    public void buscarPorCodigo(String buscando){
        int longitud = buscando.length();
        String num = "0123456789";
        String guion = "-";
        int longitudABC = num.length();
        int correcto = 0;
        if (longitud==7){
            for (int i = 0; i< 3; i++)
        {
            for (int u = 0; u < longitudABC; u++)
            {
            if (buscando.charAt(i)==num.charAt(u))
            {
                correcto++;
            }
            }
        }
        if (correcto==3 && buscando.charAt(3)==guion.charAt(0)){
            String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
            int correcto2 = 0;
            for (int i = 4; i< 7; i++)
        {
            for (int u = 0; u < abc.length(); u++)
            {
            if (buscando.charAt(i)==abc.charAt(u))
            {
                correcto2++;
            }
            }
           
        }
            if (correcto2==3)
            {
                javax.swing.JOptionPane.showMessageDialog(null, "Sí es un codigo de libro valido");
            }
        }   else
        {
            javax.swing.JOptionPane.showMessageDialog(null, "No es un codigo de libro valido");
        }
        } else
        {
            javax.swing.JOptionPane.showMessageDialog(null, "No es un codigo de libro valido");
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
