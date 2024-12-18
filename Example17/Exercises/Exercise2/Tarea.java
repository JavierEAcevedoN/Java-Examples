package Example17.Exercises.Exercise2;

import java.util.List;

class Tarea implements Runnable {
    private List<Integer> arreglo;
    private int sumaArreglo;
    
    public Tarea(List<Integer> arreglo) {
        this.arreglo = arreglo;
    }

    @Override
    public void run() {
        
        sumaArreglo = 0;
        for (int i : arreglo) {
            sumaArreglo += i;
        }
        System.out.println("Suma del arreglo es de: "+sumaArreglo);
    }

    public int getSumaArreglo() {
        return sumaArreglo;
    }
}