package Example16.Runnable.Descanso;

public class PDescanso {
    public static void main(String[] args) throws InterruptedException {
        Thread hilo = new Thread(new Descanso(), "Descanso");
        hilo.start();
    }
}