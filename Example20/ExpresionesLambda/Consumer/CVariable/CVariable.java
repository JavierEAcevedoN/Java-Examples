package Example20.ExpresionesLambda.Consumer.CVariable;

import java.util.function.Consumer;

public class CVariable {
    public static void main(String[] args) {
        // el lambda Consumer se utiliza para hacer operaciones sobre un objeto en el cual no se necesite devolver nada
        Consumer<String> imprimirMensaje = mesaje -> System.out.println("Mensaje: "+mesaje);
        imprimirMensaje.accept("Hola");
    }
}