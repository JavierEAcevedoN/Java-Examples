package Example8.Exercises.Exercise1;

import java.util.Arrays;
import java.util.Comparator;

public class Sort {
    public static void main(String[] args) {
        String[] nombres = {"David","Elkin","Fabian"};

        Arrays.sort(nombres);

        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        Arrays.sort(nombres, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}