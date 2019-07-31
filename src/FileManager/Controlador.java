//Actualizar los originales


package FileManager;

import java.io.*;


public class Controlador {
    public static final String[] PATHS = {"./Biblio", "./Biblio/Libros",
                                        "./Biblio/Prestamos","./Biblio/Estudiantes"
    };
      //Extension de los archivos binarios
  public static final String EXT = ".bin";
    
    public static void paths(){
        for (String path : PATHS) {
            File ruta = new File(path);
            ruta.mkdirs();
        }
    }

    public static <T> void guardar(T objeto, String path) {
        
        try {
            FileOutputStream archivo = new FileOutputStream(path);
            ObjectOutputStream binario = new ObjectOutputStream(archivo);
            binario.writeObject(objeto);
            binario.close();
            archivo.close();
            System.out.println("Objeto correctamente almacenado en " + path);
        } catch (Exception e) {
           e.printStackTrace();
        }
    }

    public static <T> T recuperar(T objeto, String path) {
        try {
            FileInputStream archivo = new FileInputStream(path);
            ObjectInputStream binario = new ObjectInputStream(archivo);
            objeto = (T) binario.readObject();
            binario.close();
            archivo.close();
            return objeto;
        } catch (Exception e) {
            System.out.println("Objeto no encontrado en " + path);
            e.printStackTrace();
            return null;
        }
    }
}
