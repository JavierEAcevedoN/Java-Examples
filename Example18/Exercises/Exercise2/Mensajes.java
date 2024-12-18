package Example18.Exercises.Exercise2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Mensajes {
    public static void main(String[] args) {
        try (BufferedReader buffer = new BufferedReader(new FileReader(new File("Example18\\Exercises\\Exercise2\\mbox.txt")))) {
            String linea;
            String correo;
            List<String> correos = new ArrayList<>();
            while ((linea = buffer.readLine()) != null) {
                if (linea.startsWith("From:")) {
                    correo = linea.substring(6);
                    if (!correos.contains(correo)) {
                        correos.add(correo);
                        System.out.println(linea+" enviado [ok]");
                    } /* else {
                        System.out.println(linea+" ya se envio [ok]");
                    } */
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}