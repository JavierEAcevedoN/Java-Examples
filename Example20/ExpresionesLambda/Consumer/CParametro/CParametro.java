package Example20.ExpresionesLambda.Consumer.CParametro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class CParametro {
    // se puede usar el consumer como parametro al llamar un metodo
    public static void process(List<Integer> list, Consumer<Integer> c) {
        c.accept(list.get(0));
    }
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(12);
        numeros.add(2);
        numeros.add(15);
        numeros.add(5);
        numeros.add(1);
        numeros.add(11);

        // al llamar el metodo se utiliza la sintaxis del mismo para hacer el uso de este
        process(numeros, (i)->System.out.println(i));

        /* for (Integer integer : numeros) {
            Consumer<Integer> c = i -> System.out.println(i);
            c.accept(integer);
        } */
    }
}