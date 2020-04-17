package compartido;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author Ricardo
 */
public class Archivo {

    private Archivo() {
    }

    /**
     * agrega texto a un archivo sino lo crea
     *
     * @param nameFile
     * @param texto
     */
    public static void append(String nameFile, String texto) {
        String temp = Archivo.read(nameFile);
        temp = temp + texto;
        Archivo.createFile(nameFile, temp);
    }

    /**
     * crea un archivo
     *
     * @param nameFile si se le indica la ruta dentro del nobre si no lo crea en
     * el directorio del proyecto
     * @param texto texto a escribir en el archivo
     */
    public static void createFile(String nameFile, String texto) {
        try {
            File f = new File(nameFile);
            FileWriter escribirArchivo = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(escribirArchivo);
            PrintWriter salida = new PrintWriter(bw);
            salida.write(texto + "\n");
            salida.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * cra un archivo con un directorio especifico
     *
     * @param file
     * @param texto
     */
    public static void create(File file, String texto) {
        try {
            File f = file;
            FileWriter escribirArchivo = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(escribirArchivo);
            PrintWriter salida = new PrintWriter(bw);
            salida.write(texto + "\n");
            salida.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * lee un archivo especificado
     *
     * @param nombre
     * @return
     */
    public static String read(String nombre) {
        try {
            File f = new File(nombre);
            FileReader lectorArchivo = new FileReader(f);
            BufferedReader br = new BufferedReader(lectorArchivo);
            String l = "";
            while (true) {
                String aux = br.readLine();
                if (aux != null) {
                    l += aux + "\n";
                } else {
                    break;
                }
            }
            br.close();
            lectorArchivo.close();
            return l;
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        return "";
    }
}