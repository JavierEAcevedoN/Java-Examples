package Example21.Stream.SMap;

import java.util.List;

public class SMap {
    public static void main(String[] args) {
        // map se utiliza para convertir cada elemento del stream en otro valor aplicando una funcion
        List<String> lista = List.of("Ana","Luis","Carlos");

        lista.stream().map(String::toUpperCase).forEach(i->System.out.println(i));
    }
}