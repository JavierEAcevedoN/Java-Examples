package Example10.Exercises.Exercise4;

import java.util.HashSet;
import java.util.Set;

public class RestaGeneral{
    public static <generic extends Number> void resta(generic obj1, generic obj2){
        double resultado = obj1.doubleValue() - obj2.doubleValue();
        System.out.println("Resultado de la resta es: "+resultado);
    }
    public static void resta(String str1, String str2) {
        Set<Character> sstr1 = new HashSet<>();
        Set<Character> sstr2 = new HashSet<>();

        for (Character character : str1.toLowerCase().toCharArray()) {
            sstr1.add(character);
        }

        for (Character character : str2.toLowerCase().toCharArray()) {
            sstr2.add(character);
        }

        sstr1.removeAll(sstr2);

        System.out.println("El resultado de la resta de los Strings es: ");
        for (Character character : sstr1) {
            System.out.println(character);
        }
    }
}
class InnerRestaGeneral {
    public static void main(String[] args) {
        double numero1 = 10.434;
        double numero2 = 20.43242;

        RestaGeneral.resta(numero1, numero2);
        
        String string1 = "Hola"; //Hl
        String string2 = "Adios"; //dis

        RestaGeneral.resta(string1, string2);;
    }
}