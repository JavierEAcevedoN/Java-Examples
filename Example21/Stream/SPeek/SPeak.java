package Example21.Stream.SPeek;

import java.util.List;

public class SPeak {
    public static void main(String[] args) {
        // peek permite hacer acciones en los elementos del stream sin modificarlos
        List<String> lista = List.of("Ana","Luis","Carlos");

        lista.stream().peek(i->System.out.println("Antes cambio: "+i)).map(String::toUpperCase).forEach(i->System.out.println(i));
    }
}