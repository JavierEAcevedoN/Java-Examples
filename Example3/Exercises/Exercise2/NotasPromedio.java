package Exercise2;

import java.util.Scanner;

/**
 *
 * @author JavierEAcevedoN
 */
public class NotasPromedio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalnotas = 0;
        int cantidad = 0;
        int aprobadas = 0;
        int reprobadas = 0;
        int nota;

        while (true) {
            System.out.print("Ingresa las notas (numero negativo para terminar): ");
            nota = input.nextInt();
            if (nota<0) {
                break;
            } else if (nota<6) {
                reprobadas++;
            } else {
                aprobadas++;
            }
            totalnotas += nota;
            cantidad++;
        }

        

        System.out.println("Obtubiste "+aprobadas+" calificación (es) aprobatoria (s) y "+reprobadas+" calificación (es) reprobatoria (s).");
        System.out.println("Tu promedio fue de: "+(totalnotas/cantidad));

        input.close();
    }
}