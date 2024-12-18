package Example20.ExpresionesLambda.FLambda.BiFunction;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FBiFunction {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Pepe"));
        personas.add(new Persona("Andres"));

        personas.forEach(i -> System.out.println(i.nombre));

        // el lambda BiFuntion se utiliza recibiendo dos parametros y devolviendo algo
        Comparator <Persona> comp = (l,r) -> l.nombre.compareTo(r.nombre);
        personas.sort(comp);
        // personas.sort((l,r) -> l.nombre.compareTo(r.nombre));
        System.out.println();

        personas.forEach(i -> System.out.println(i.nombre));
    }
}