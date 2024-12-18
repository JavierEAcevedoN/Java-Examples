package Example18.Escritura;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.imageio.IIOException;
import javax.swing.JFileChooser;

public class Escribir {
    public static void main(String[] args) {
        File archivo = null;
        FileWriter writer = null;
        PrintWriter pw = null;
        // JFileChooser se utiliza para poder seleccionar un archivo sin la necesidad de ponerlo directamente en el codigo.
        JFileChooser inputChooser = new JFileChooser();

        try {
            inputChooser.showOpenDialog(inputChooser);
            String path = inputChooser.getSelectedFile().getAbsolutePath();

            archivo = new File(path);
            writer = new FileWriter(archivo);
            pw = new PrintWriter(writer);

            for (int i = 0; i < 10; i++) {
                pw.println("Linea "+i);
            }
        } catch (IIOException e) {
            System.out.println("Error en la escritura");
        } catch (Exception e) {
            System.out.println("Error");
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar el recurso");
            }
        }
    }
}