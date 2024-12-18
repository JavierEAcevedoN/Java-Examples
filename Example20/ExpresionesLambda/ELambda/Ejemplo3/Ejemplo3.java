package Example20.ExpresionesLambda.ELambda.Ejemplo3;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo3 {
    public static void main(String[] args) {
        List<Integer> paises = new ArrayList<>();

        paises.add(12);
        paises.add(15);
        paises.add(1);
        paises.add(2);
        paises.add(5);
        paises.add(11);

        paises.stream().filter(num -> num%2 != 0).forEach(n -> System.out.println(n));
    }
}