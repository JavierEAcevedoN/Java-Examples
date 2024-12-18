package Example21.Stream.CreacionStream.StreamOf;

import java.util.stream.Stream;

public class StreamOf {
    public static void main(String[] args) {
        // los streams son una erramienta que se utiliza para la manipulacion de datos, apartir de objetos iterable (listas, arrays, etc)
        Stream<String> animales = Stream.of("Gato","Perro","Pato");

        animales.forEach(i -> System.out.println(i));
    }
}