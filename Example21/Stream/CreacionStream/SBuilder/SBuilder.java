package Example21.Stream.CreacionStream.SBuilder;

import java.util.stream.Stream;

public class SBuilder {
    public static void main(String[] args) {
        Stream<String> animales = Stream.<String>builder()
            .add("Gato")
            .add("Perro")
            .add("Pato")
            .build();

        animales.forEach(i -> System.out.println(i));
    }
}