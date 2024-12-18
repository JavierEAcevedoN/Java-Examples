package Example18.Lectura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JFileChooser;

public class Leer {
    public static void main(String[] args) {
        File archivo = null;
        FileReader reader = null;
        BufferedReader bf = null;
        JFileChooser inputChooser = new JFileChooser();

        try {
            inputChooser.showOpenDialog(inputChooser);
            String path = inputChooser.getSelectedFile().getAbsolutePath();

            archivo = new File(path);
            reader = new FileReader(archivo);
            bf = new BufferedReader(reader);

            String line;
            while ((line = bf.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (Exception e2) {
                System.out.println("Error al cerrar el recurso");
                e2.printStackTrace();
            }
        }
    }
}