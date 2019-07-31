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
public class Prestamos1 {
    
    private int codigo_prestamos;
    private String codgo_libro;
    private int carnet;
    private String fecha;
    private int mora;
    private int monto;

    public int getCodigo_prestamos() {
        return codigo_prestamos;
    }

    public void setCodigo_prestamos(int codigo_prestamos) {
        this.codigo_prestamos = codigo_prestamos;
    }

    public String getCodgo_libro() {
        return codgo_libro;
    }

    public void setCodgo_libro(String codgo_libro) {
        this.codgo_libro = codgo_libro;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getMora() {
        return mora;
    }

    public void setMora(int mora) {
        this.mora = mora;
    }

    public int getMoto() {
        return monto;
    }

    public void setMoto(int moto) {
        this.monto = moto;
    }
    
    public void verificarPrestamo1 (String aVerificar, String busqueda){
        if (aVerificar.equalsIgnoreCase("codigo del libro")){
            buscarPorCodigoLibro(busqueda);
        } else if (aVerificar.equalsIgnoreCase("carne del estudiante")){
            buscarPorCarneEstudiante(busqueda);
        } else if (aVerificar.equalsIgnoreCase("fecha"))
        {
            buscarPorFecha(busqueda);
        }
    }  
    
    public void buscarPorCodigoLibro(String buscando){
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
    public void buscarPorCarneEstudiante(String buscando){
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
    public void buscarPorFecha(String buscando){
        String correctas = "0123456789-";
        int longitud = buscando.length();
        int correctas1 = 0;
        String guion = "-";
        if (buscando.length()==10){
            for (int i = 0; i< longitud; i++)
        {
            for (int u = 0; u < correctas.length(); u++)
            {
            if (buscando.charAt(i)==correctas.charAt(u))
            {
                correctas1++;
            }
            }
        }
            if (correctas1==10 && buscando.charAt(4)==guion.charAt(0) && buscando.charAt(7)==guion.charAt(0))
            {
                String año = "";
                String mes = "";
                String dia = "";
                for (int i = 0; i < 4; i++)
                {
                    año+= buscando.charAt(i);
                }
                
                dia+= buscando.charAt(8);
                dia+= buscando.charAt(9);
                mes+= buscando.charAt(5);
                mes+= buscando.charAt(6);
                int diaNum = 0;
                diaNum = Integer.parseInt(dia);
                int mesNum = 0;
                mesNum = Integer.parseInt(mes);
                int añoNum = 0;
                System.out.print(dia + "mes "+ mes);
                añoNum = Integer.parseInt(año);
                if (añoNum<=2019 && mesNum<=12 && diaNum<=30){
                    javax.swing.JOptionPane.showMessageDialog(null, "Fecha valida");
                } else {
                    javax.swing.JOptionPane.showMessageDialog(null, "Fecha invalida");
                }
            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "Fecha invalida");
            }
        }
        
        
    }
}
