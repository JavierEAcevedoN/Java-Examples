package Example16.Hilo;

class Tarea2 extends Thread {
    private int numHilo;

    public Tarea2(int i) {
        numHilo = i;
        System.out.println("Creando el hilo ["+numHilo+"]");
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Soy el hilo ["+numHilo+" - "+i+"]");
        }
    }
}

public class Hilo3 {
    public static void main(String[] args) {
        System.out.println("Hilo principal");
        for (int i = 0; i < 5; i++) {
            Thread hilo = new Thread(new Tarea2(i));
            hilo.start();
        }
        System.out.println("Fin del hilo principal");
    }
}