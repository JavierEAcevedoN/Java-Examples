package Example18.Exercises.Exercise1;

import java.io.File;

public class Analizar {
    private File ruta;

    public Analizar(File ruta) {
        this.ruta = ruta;
    }

    public void setRuta(File ruta) {
        this.ruta = ruta;
    }

    public void ejecutarBusqueda() {
        if (ruta == null || !ruta.exists()) {
            System.out.println("La ruta no existe o no es válida.");
            return;
        }

        System.out.println("Explorando la carpeta: " + ruta.getAbsolutePath());
        System.out.println();
        System.out.println("-- Pesos de Directorios --");
        listarDirectorios(ruta);
        System.out.println();
        System.out.println("-- Archivos.java y .py --");
        listarArchivosJVPY(ruta);
    }

    public Long listarDirectorios(File ruta) {
        long peso = 0;
        for (File contenido : ruta.listFiles()) {
            if (contenido.isDirectory()) {
                long dirPeso = listarDirectorios(contenido);
                imprimirRuta(contenido, dirPeso);
                peso += dirPeso;
            } else {
                peso += contenido.length();
            }
        }
        return peso;
    }

    public void listarArchivosJVPY(File ruta) {
        for (File contenido : ruta.listFiles()) {
            if (contenido.isFile()) {
                if (contenido.toString().endsWith(".java") || contenido.toString().endsWith(".py")) {
                    imprimirRuta(contenido, contenido.length());
                }
            } else {
                listarArchivosJVPY(contenido);
            }
        }
    }

    private void imprimirRuta(File file, Long peso) {
        System.out.println("Directorio: " + file.getPath() + " (" + (peso / 1024.0) + " KB)");
    }
}