package Example16.Sincronizacion.Sincronizado;

public class Sincronizado implements Runnable{
    private static int counter = 0;

    @Override
    public void run() {
        while (counter < 10) {
            synchronized (Sincronizado.class) {
                System.out.println("["+Thread.currentThread().getName()+"] Antes: "+counter);
                counter++;
                System.out.println("["+Thread.currentThread().getName()+"] Despues: "+counter);
            }
        }
    }
}