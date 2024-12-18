package Example20.ExpresionesLambda.FLambda.FVariable;

import java.util.function.Function;

public class FVariable {
    public static void main(String[] args) {
        // el lambda Function se utiliza para pazar un parametro y retornar algo
        Function<String,Integer> largoString1 = (String s) -> {
            return s.length();
        };

        Function<String,Integer> largoString2 = s -> s.length();

        String cadena = "cadena de texto larga o no?";

        System.out.println("Largo de la cadena "+largoString1.apply(cadena));
        System.out.println("Largo de la cadena "+largoString2.apply(cadena));
    }
}