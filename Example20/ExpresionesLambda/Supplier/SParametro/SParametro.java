package Example20.ExpresionesLambda.Supplier.SParametro;

import java.util.function.Supplier;

public class SParametro {
    public static void main(String[] args) {
        Supplier<Integer> numeroAleatorio = GeneradorAleatorio::generarNumero;

        System.out.println("Numero aleatorio: "+numeroAleatorio.get());
    }
}