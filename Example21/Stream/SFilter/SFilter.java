package Example21.Stream.SFilter;

import java.util.List;

public class SFilter {
    public static void main(String[] args) {
        // filter filtra los elementos del stream segun la expresion booleana
        List<Integer> lista = List.of(2,5,3,2,4,5,6,7,5,3,3,6,7,1);

        lista.stream().filter(i -> i % 2 == 0).forEach(i->System.out.println(i));
    }
}