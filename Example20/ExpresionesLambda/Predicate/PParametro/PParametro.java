package Example20.ExpresionesLambda.Predicate.PParametro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PParametro {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(3);
        numeros.add(12);
        numeros.add(34);
        numeros.add(532);
        numeros.add(12);
        numeros.add(6654);
        numeros.add(23);

        Predicate<Integer> predicate = numero -> numero % 2 == 0;

        List<Integer> numerosPares = FiltrarNumeros.filtrar(numeros, predicate);

        numerosPares.forEach(i -> System.out.println(i));
    }
}