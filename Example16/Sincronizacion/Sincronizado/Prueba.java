package Example16.Sincronizacion.Sincronizado;

public class Prueba {
    public static void main(String[] args) throws InterruptedException {
        Thread[] hilos = new Thread[5];
        for (int i = 0; i < hilos.length; i++) {
            hilos[i] = new Thread(new Sincronizado(), "Hilo-"+i);
            hilos[i].start();
        }
        for (Thread hilo : hilos) {
            hilo.join();
        }
    }
}