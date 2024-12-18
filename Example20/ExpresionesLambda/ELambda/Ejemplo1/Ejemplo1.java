package Example20.ExpresionesLambda.ELambda.Ejemplo1;

import java.util.stream.IntStream;

public class Ejemplo1 {
    public static void main(String[] args) {
        IntStream.range(1, 10).parallel().forEach(i -> {
            System.out.println("Tarea ejecuta por: "+
                Thread.currentThread().getName() + " para i = "+i);
        });
    }
}