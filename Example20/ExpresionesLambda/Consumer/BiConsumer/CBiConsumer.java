package Example20.ExpresionesLambda.Consumer.BiConsumer;

import java.util.function.BiConsumer;

public class CBiConsumer {
    public static void main(String[] args) {
        // el BiConsumer es como consumer pero se le pueden pasar dos parametros
        BiConsumer<String, String> biconsumer = (saludo, nombre) -> {
            // dentro del cuerpo del consuemr se pueden crear variables
            String lenguaje = "Java";

            System.out.println(saludo+" "+nombre+" Bienvedid@ a "+lenguaje+"!");
        };
        biconsumer.accept("Buenos dias", "Javier");
    }
}