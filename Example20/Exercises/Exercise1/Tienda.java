package Example20.Exercises.Exercise1;

import java.util.function.Consumer;

public class Tienda {
    public static void main(String[] args) {
        Gaseosa gaseosa1 = new Gaseosa("Pepi", 12.999);
        Gaseosa gaseosa2 = new Gaseosa("Pipe", 23.593);
        Gaseosa gaseosa3 = new Gaseosa("Malta", 54.21);
        Gaseosa gaseosa4 = new Gaseosa("Spray", 1432.2143);

        PaqueteDeGaseosas pg = new PaqueteDeGaseosas();
        pg.agregarVariasGaseosas(gaseosa1, gaseosa2, gaseosa3, gaseosa4);

        Consumer<Producto> cg = i -> i.obtenerInformacion();
        cg.accept(gaseosa2);
        cg.accept(gaseosa3);

        System.out.println();

        cg.accept(pg);
    }
}