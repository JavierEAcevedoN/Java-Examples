package Example20.ExpresionesLambda.Predicate.PVariable;

import java.util.function.Predicate;

public class PVariable {
    public static void main(String[] args) {
        Predicate<Integer> pred = number -> number % 2 == 0;
        System.out.println("El 4 es par? "+pred.test(4));
        System.out.println("El 3 es par? "+pred.test(7));
    }
}