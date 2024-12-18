package Example20.ExpresionesLambda.ELambda.Ejemplo2;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo2 {
    public static void main(String[] args) {
        List<String> paises = new ArrayList<>();

        paises.add("Ecuador");
        paises.add("Bolivia");
        paises.add("Perú");
        paises.add("Colombia");
        paises.add("Argentina");
        paises.add("Venezuela");

        paises.forEach(pais -> System.out.println("Pais: "+pais));
    }
}