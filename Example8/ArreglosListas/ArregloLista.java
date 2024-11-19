package Example8.ArreglosListas;

import java.util.ArrayList;

public class ArregloLista {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        lista.add("hola");

        for (String string : lista) {
            System.out.println(string);
        }

        lista.add("buenas");

        for (String string : lista) {
            System.out.println(string);
        }

        lista.add("tardes");

        for (String string : lista) {
            System.out.println(string);
        }

        lista.remove(0);

        for (String string : lista) {
            System.out.println(string);
        }

        lista.clear();
        System.out.println(lista.isEmpty());

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 5000; i++) {
            numeros.add(i);
        }

        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}