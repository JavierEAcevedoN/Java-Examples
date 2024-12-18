package Example16.Runnable.Ejecutable;

public class Ejecutable implements Runnable {
    @Override
    public void run() {
        System.out.println("Ejecutando el hilo "+Thread.currentThread().getName());
    }
    
    public static void main(String[] args) throws InterruptedException {
        Thread hilo = new Thread(new Ejecutable(), "Ejecutable");
        hilo.start();
    }
}