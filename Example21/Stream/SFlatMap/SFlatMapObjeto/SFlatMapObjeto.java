package Example21.Stream.SFlatMap.SFlatMapObjeto;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SFlatMapObjeto {
    public static void main(String[] args) {
        Stream<Animal> animales = Stream.of("Gato","Perro","Pato","Perro Grande","Perro Pequeño")
        .map(i -> new Animal(i))
        .flatMap(i -> {
            if (i.getTipo().equalsIgnoreCase("Gato")) {
                return Stream.of(i);
            }
            return Stream.empty();
        })
        .peek(System.out::println);

        List<Animal> animalsList = animales.collect(Collectors.toList());
        System.out.println(animalsList);
    }
}
