package Example20.Exercises.Exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PaqueteDeGaseosas implements Producto{
    private List<Gaseosa> paqueteDeGaseosas;

    public PaqueteDeGaseosas() {
        paqueteDeGaseosas = new ArrayList<>();
    }

    public void agregarGaseosa(Gaseosa gaseosa) {
        paqueteDeGaseosas.add(gaseosa);
    }

    public void agregarVariasGaseosas(Gaseosa ...gaseosas) {
        paqueteDeGaseosas.addAll(Arrays.asList(gaseosas));
    }

    @Override
    public void obtenerInformacion() {
        paqueteDeGaseosas.forEach(i -> i.obtenerInformacion());
    }
}