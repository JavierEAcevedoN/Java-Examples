package Example21.Stream.CreacionStream.Arreglo;

import java.util.Arrays;
import java.util.stream.Stream;

public class SArreglo {
    public static void main(String[] args) {
        String[] arreglo = {"Gato","Perro","Pato"};

        Stream<String> animales = Arrays.stream(arreglo);

        animales.forEach(i -> System.out.println(i));
    }
}