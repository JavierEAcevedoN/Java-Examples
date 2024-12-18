package Example20.ExpresionesLambda.Predicate.PParametro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FiltrarNumeros {
    public static List<Integer> filtrar(List<Integer> numeros, Predicate<Integer> predicate) {
        List<Integer> resultado = new ArrayList<>();

        for (Integer numero : numeros) {
            if (predicate.test(numero)) {
                resultado.add(numero);
            }
        }
        return resultado;
    }
}