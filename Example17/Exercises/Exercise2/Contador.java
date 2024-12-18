package Example17.Exercises.Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Contador {
    public static void main(String[] args) {
        Thread[] hilos = new Thread[2];
        Tarea[] tareas = new Tarea[2];

        List<Integer> arreglo = new ArrayList<>();
        for (int i = 0; i < 1001; i++) {
            arreglo.add(i);
        }

        tareas[0] = new Tarea(arreglo.subList(0, arreglo.size()/2));
        tareas[1] = new Tarea(arreglo.subList((arreglo.size()/2)+1, arreglo.size()));

        for (int i = 0; i < 2; i++) {
            hilos[i] = new Thread(tareas[i]);
            hilos[i].start();
        }

        for (int i = 0; i < 2; i++) {
            try {
                hilos[i].join();
            } catch (Exception e) {
                System.out.println("Hilo interrumpido: "+hilos[i].getName());
            }
        }

        int sumaTotal = 0;
        for (int i = 0; i < 2; i++) {
            sumaTotal += tareas[i].getSumaArreglo();
        }

        System.out.println("Suma total: "+sumaTotal);
    }
}