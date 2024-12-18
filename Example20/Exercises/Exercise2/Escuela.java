package Example20.Exercises.Exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Escuela {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Javier", 5, 5, 5);
        Estudiante estudiante2 = new Estudiante("Edgan", 4, 3, 3);
        Estudiante estudiante3 = new Estudiante("Elkin", 4.7, 5, 3);
        Estudiante estudiante4 = new Estudiante("Angel", 5, 4.2, 4.9);
        Estudiante estudiante5 = new Estudiante("Ignacio", 4, 4.9, 4.3);

        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.addAll(Arrays.asList(estudiante1,estudiante2,estudiante3,estudiante4,estudiante5));

        estudiantes.forEach(i -> i.calcularDefinitiva());

        estudiantes.forEach(i -> {
            if (i.getDefinitiva() < 3.5) {
                i.setDefinitiva(i.getDefinitiva()*1.05);
            }
        });

        Predicate<Estudiante> resultado = estudiante -> estudiante.getDefinitiva() > 3.5;

        Supplier<String> mensajeA = () -> "Aprobo";
        Supplier<String> mensajeR = () -> "Reprobo";

        estudiantes.forEach(i -> {
            if (resultado.test(i)) {
                System.out.println(mensajeA.get());
            } else {
                System.out.println(mensajeR.get());
            }
        });
    }
}