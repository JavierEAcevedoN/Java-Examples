package Example10.Conjuntos;

import java.util.HashSet;
import java.util.Set;

public class Conjuntos {
    public static void main(String[] args) {
        // Los guardan los elementos con un orden natural y no se guardan datos repetidos.
        Set<Integer> conjunto = new HashSet<>();

        // add sirve para agregar los elementos al Set.
        conjunto.add(1);
        conjunto.add(2);
        conjunto.add(4);
        conjunto.add(7);
        conjunto.add(6);
        conjunto.add(6);
        conjunto.add(3);
        conjunto.add(1);

        // Recorrer el Set utilizando ForEach
        for (Integer numero : conjunto) {
            System.out.println(numero);
        }

        System.out.println();
        System.out.println("El largo del Set es: "+conjunto.size());

        System.out.println();
        System.out.println("El Set esta vacio: "+conjunto.isEmpty());

        System.out.println();
        System.out.println("El Set contiene el numero 9: "+conjunto.contains(9));

        System.out.println();
        conjunto.remove(6);
        System.out.println("Se elimino el numero 6");
        for (Integer numero : conjunto) {
            System.out.println(numero);
        }
    }
}