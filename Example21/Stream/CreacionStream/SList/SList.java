package Example21.Stream.CreacionStream.SList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SList {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
            lista.add("Gato");
            lista.add("Perro");
            lista.add("Pato");

        Stream<String> animales = lista.stream();
        animales.forEach(i -> System.out.println(i));
    }
}