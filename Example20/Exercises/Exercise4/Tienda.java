package Example20.Exercises.Exercise4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Tienda {
    public static void main(String[] args) {
        Gaseosa gaseosa1 = new Gaseosa("Pepi", 12.999);
        Gaseosa gaseosa2 = new Gaseosa("Pipe", 23.593);
        Gaseosa gaseosa3 = new Gaseosa("Malta", 54.21);
        Gaseosa gaseosa4 = new Gaseosa("Spray", 1432.2143);

        Pan pan1 = new Pan("Limbo", 12.999);
        Pan pan2 = new Pan("LAM", 23.593);
        Pan pan3 = new Pan("Dimbo", 54.21);

        List<Productos> productos = new ArrayList<>();

        productos.addAll(Arrays.asList(gaseosa1,gaseosa2,gaseosa3,gaseosa4,pan1,pan2,pan3));

        Consumer<Productos> pConsumer = i -> i.mostrarInformacion();

        Supplier<Double> pDescuento = () -> 1.00-((new Random().nextInt(15)+1)/100.0);

        Consumer<Productos> pAConsumer = i -> i.setPrecio(i.getPrecio()*pDescuento.get());

        pAConsumer.accept(gaseosa4);
        productos.forEach(pConsumer);
    }
}