package Example16.Exercises.Exercise2;

import java.util.ArrayList;

class Tarea implements Runnable {
    private int inicio, fin, sumaParcial;
    private ArrayList<Integer> nPrimos = new ArrayList<>();

    public Tarea(int inicio, int fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    @Override
    public void run() {
        sumaParcial = 0;
        for (int i = inicio; i < fin; i++) {
            sumaParcial += i;

            if (i == 2) {
                nPrimos.add(2);
            } else if (i > 2) {
                boolean esPrimo = true;

                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        esPrimo = false;
                        break;
                    }
                }

                if (esPrimo) {
                    nPrimos.add(i);
                }
            }
        }

        System.out.println("Suma parcial del rango " + inicio + " a " + fin + ": " + sumaParcial);
    }

    public int getSumaParcial() {
        System.out.println("Hilo terminado");
        return sumaParcial;
    }

    public ArrayList<Integer> getNPrimos() {
        return nPrimos;
    }
}