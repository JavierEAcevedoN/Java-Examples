package Example18.Archivos;

import java.io.File;

public class Archivos {
    public static void main(String[] args) {
        File archivo = new File("Example18\\Archivos\\mbox.txt"); 

        //el metodo exists devuelve un booleano si el archivo existe o no.
        System.out.println("El archivo existe?: "+archivo.exists());
        // el metodo isFile indica si es un archivo o no (directorio que no es directamente un archivo).
        System.out.println("Es un archivo? "+archivo.isFile());
        System.out.println("El archivo se puede leer? "+ archivo.canRead());
        System.out.println("El archivo se puede escribir? "+ archivo.canWrite());
        // el metodo rename sirve para cambiar el nombre del archivor otro.
        System.out.println(archivo.renameTo(new File("Example18\\Archivos\\ejemplo.txt")));
        if (archivo.exists()) {
            System.out.println("Eliminando el archivo: "+archivo.delete());
        }

        System.out.println();

        File direct = new File("Example18\\\\Archivos");

        System.out.println("El archivo existe?: "+direct.exists());
        System.out.println("Es un archivo? "+direct.isFile());
        if (direct.exists()) {
            // el metodo isDirectory muestra si es un directorio o no. 
            System.out.println("Es un directorio? "+direct.isDirectory());
        } else {
            // el metodo mkdir sirve para crear un directorio;
            direct.mkdir();
        }
    }
}