package controlbiblioteca;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Bladimir
 */
public class CargarArchivo {
    public  String leerGrafico(){
	File f;
	javax.swing.JFileChooser j= new javax.swing.JFileChooser();
	j.showOpenDialog(j);
	try{
            String path= j.getSelectedFile().getAbsolutePath();
            String lectura="";
            f = new File(path);
	try{
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String aux;
            while((aux = br.readLine())!=null)
            lectura = lectura+aux+"\n";
	}catch(IOException e){}
            return lectura;
	}catch(NullPointerException e){
            javax.swing.JOptionPane.showMessageDialog(j, "Has seleccionado cerrar programa, saliendo...");
            System.exit(0);
	}return null;  
}}
