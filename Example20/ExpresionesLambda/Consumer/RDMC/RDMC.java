package Example20.ExpresionesLambda.Consumer.RDMC;

import java.util.function.Consumer;

public class RDMC {
    public static void main(String[] args) {
        // se referencia el metodo estatico al consumidor
        Consumer<String> consumer = Saludador::Saludar;

        // Consumer<String> consumer = mensaje -> Saludador.Saludar(mensaje);

        // uso del consumidor 
        consumer.accept("Hola Como estas");
    }
}