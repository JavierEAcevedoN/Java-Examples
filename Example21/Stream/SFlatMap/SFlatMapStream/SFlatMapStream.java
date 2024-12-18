package Example21.Stream.SFlatMap.SFlatMapStream;

import java.util.List;

public class SFlatMapStream {
    public static void main(String[] args) {
        // flatMap se utiliza para descompone y transforma los elementos del stream, y los resultados los combina en un unico stream
        List<List<String>> listas = List.of(
        List.of("Ana","Luis","Carlos"),
        List.of("Elkin","Edgan","Carlos"),
        List.of("Javier","Mariana","Kevin")
        );

        listas.stream().flatMap(List::stream).forEach(i->System.out.println(i));
    }
}