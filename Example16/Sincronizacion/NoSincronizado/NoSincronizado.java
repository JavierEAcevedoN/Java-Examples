package Example16.Sincronizacion.NoSincronizado;

public class NoSincronizado implements Runnable{
    private static int counter = 0;

    @Override
    public void run() {
        while (counter < 10) {
            System.out.println("["+Thread.currentThread().getName()+"] Antes: "+counter);
            counter++;
            System.out.println("["+Thread.currentThread().getName()+"] Despues: "+counter);
        }
    }
}