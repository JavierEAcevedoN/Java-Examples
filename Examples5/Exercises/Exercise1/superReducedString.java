import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class superReducedString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa un String para reducirlo: ");
        String inputString = input.nextLine();
        inputString = inputString.toLowerCase();

        Pattern patron = Pattern.compile("[^A-Za-z]+");
        Matcher coincidencia = patron.matcher(inputString);

        if (coincidencia.find()) {
            System.out.println("La cadena contiene caracteres no válidos.");
            input.close();
            return;
        }

        int i = -1;
        int j;
        int largo;
        char caracter1;
        char caracter2;
        String subString1;
        String subString2;
        
        while (true) {
            largo = inputString.length()-1;
            i++;
            j = i + 1;
            if (j>largo) {
                break;
            }
            caracter1 = (char) inputString.charAt(i);
            caracter2 = (char) inputString.charAt(j);
            if (caracter1 == caracter2) {
                subString1 = inputString.substring(0, i);
                subString2 = inputString.substring(j+1, largo+1);
                inputString = subString1.concat(subString2);
                i = -1;
            }
        }
        if (inputString.isEmpty()) {
            System.out.println("El string esta vacio");
        } else {
            System.out.println(inputString);
        }
        input.close();
    }
}