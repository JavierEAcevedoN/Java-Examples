package Example16.Exercises.Exercise2;

import java.util.ArrayList;

public class Contador {
    public static void main(String[] args) {
        Thread[] hilos = new Thread[4];
        Tarea[] tareas = new Tarea[4];

        System.out.println("Inicio");

        int[][] rangos = {
            {1,250},
            {251,500},
            {501,750},
            {751,1000}
        };

        for (int i = 0; i < 4; i++) {
            tareas[i] = new Tarea(rangos[i][0], rangos[i][1]);
            hilos[i] = new Thread(tareas[i]);
            hilos[i].start();
        }

        for (int i = 0; i < 4; i++) {
            try {
                hilos[i].join();
                System.out.println("Join");
            } catch (Exception e) {
                System.out.println("Hilo interrumpido: "+hilos[i].getName());
            }
        }

        int sumaTotal = 0;
        ArrayList<Integer> primos = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            sumaTotal += tareas[i].getSumaParcial();
            primos.addAll(tareas[i].getNPrimos());
        }

        System.out.println("Suma total: "+sumaTotal);

        System.out.println("Numeros primos encontrados en orden ascendente");
        for (Integer integer : primos) {
            System.out.println(integer);
        }

        System.out.println("Final");
    }
}