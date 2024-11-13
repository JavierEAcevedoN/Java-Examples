package Exercise25;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author JavierEAcevedoN
 */
public class getSmallestAndLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa una cadena de texto: ");
        String cadena = input.nextLine();
        System.out.print("Ingresa un número entero para el substring: ");
        int entero = input.nextInt();

        if (cadena.length()>1001) {
            System.out.println("Ese largo de cadena no es valido");
            input.close();
            return;
        }

        Pattern patron = Pattern.compile("[^A-Za-z]+");
        Matcher coincidencia = patron.matcher(cadena);

        if (coincidencia.find()) {
            System.out.println("La cadena contiene caracteres no válidos.");
            input.close();
            return;
        }

        if (entero <= 0 || entero > cadena.length()) {
            System.out.println("El tamaño del subString no es válido.");
            input.close();
            return;
        }
        
        List<String> substrings = new ArrayList<>();

        for (int i = 0; i <= cadena.length() - entero; i++) {
            String substring = cadena.substring(i, i + entero);
            substrings.add(substring);
        }

        System.out.println("Estos son las  subcadenas de la cadena de texto: ");
        System.out.println("\t"+cadena);
        System.out.println("Con un tamaño de " + entero + " caracteres: ");

        for (String string : substrings) {
            System.out.println("\t"+string);
        }


        substrings.sort(String.CASE_INSENSITIVE_ORDER);

        System.out.println("La subcadena mas pequeña es: " + substrings.get(0));
        System.out.println("La subcadena mas grande es: " + substrings.get(substrings.size() - 1));

        input.close();
    }
}