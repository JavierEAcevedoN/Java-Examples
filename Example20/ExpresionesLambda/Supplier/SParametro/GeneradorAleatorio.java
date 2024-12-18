package Example20.ExpresionesLambda.Supplier.SParametro;

import java.util.Random;

public class GeneradorAleatorio {
    public static int generarNumero() {
        return new Random().nextInt(100)+1;
    }
}