package Example20.ExpresionesLambda.Supplier.SVariable;

import java.util.function.Supplier;

public class SVariable {
    public static void main(String[] args) {
        // el lambda Supplier se utiliza para retornar datos, ya que no recibe parametros.
        Supplier<Double> numeroRandom = () ->  Math.random();
        System.out.println("Numero aleatorio: "+numeroRandom.get());

        Supplier<String> cadena = () -> "Cadena de ejemplo";
        System.out.println(cadena.get());

        Supplier<String> upperCase = () -> "Hola".toUpperCase();
        System.out.println(upperCase.get());
    }
}