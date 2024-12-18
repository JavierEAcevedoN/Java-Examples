package Example18.Exercises.Exercise1;

import java.io.File;

public class Ejemplo {
    public static void main(String[] args) {
        Analizar analisis = new Analizar(new File("Example18"));
        
        analisis.ejecutarBusqueda();
    }
}