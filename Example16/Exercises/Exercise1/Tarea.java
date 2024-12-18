package Example16.Exercises.Exercise1;

class Tarea implements Runnable {
    private int inicio, fin, sumaParcial;
    
    public Tarea(int inicio, int fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    @Override
    public void run() {
        
        sumaParcial = 0;
        for (int i = inicio; i < fin; i++) {
            sumaParcial += i;
        }
        System.out.println("Suma parcial del rango "+inicio+" a "+fin+": "+sumaParcial);
    }

    public int getSumaParcial() {
        return sumaParcial;
    }
}