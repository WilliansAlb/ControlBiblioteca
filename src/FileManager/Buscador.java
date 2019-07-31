package FileManager;


import controlbiblioteca.Estudiantes;
import controlbiblioteca.Libros;
import java.io.File;
import java.util.ArrayList;

public class Buscador {
  
    public static ArrayList<Libros> buscarLibro(String param, int tipo, String path) {
        File file;
        String[] files;
        Libros encontrado = new Libros();
        ArrayList<Libros> encontrados = new ArrayList<>();
        try {
             file = new File(path);
             files = file.list();
           for (String f:files) {
            encontrado = Controlador.recuperar(encontrado, path + "/" + f);
            switch (tipo) {
                case 0:
                    if (encontrado.getCodigo().equals(param)) {
                        encontrados.add(encontrado);
                    }
                    break;
                case 1:
                   if (encontrado.getTitulo().equals(param)) {
                        encontrados.add(encontrado);
                    }
                    break;
                case 2:
                    if (encontrado.getAutor().equals(param)) {
                        encontrados.add(encontrado);
                    }
                    break; 
                default:
                return null;
            }       
           }
           return encontrados;
        } catch (Exception e) {
            System.out.println("Libro inexistente");
            e.printStackTrace();
            return null;
        }

    }
    public static ArrayList<Estudiantes> buscarEstudiante(String param, int tipo, String path) {
        File file;
        String[] files;
        Estudiantes encontrado = new Estudiantes();
        ArrayList<Estudiantes> encontrados = new ArrayList<>();
        try {
             file = new File(path);
             files = file.list();
           for (String f:files) {
            encontrado = Controlador.recuperar(encontrado, path + "/" + f);
            switch (tipo) {
                case 0:
                    if (encontrado.getCarnet() == Integer.parseInt(param)) {
                        encontrados.add(encontrado);
                    }
                    break;
                case 1:
                   if (encontrado.getNombre().equals(param)) {
                        encontrados.add(encontrado);
                    }
                    break;
                case 2:
                    if (encontrado.getCarrera()==Integer.parseInt(param)) {
                        encontrados.add(encontrado);
                    }
                    break; 
                default:
                return null;
            }       
           }
           return encontrados;
        } catch (Exception e) {
            System.out.println("Estudiante inexistente");
            e.printStackTrace();
            return null;
        }

    }
}