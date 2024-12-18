package Example16.Runnable.Descanso;

public class Descanso implements Runnable{
    public void doSomethingUseful(int counter) {
        System.out.println("Ejecutando tarea util en la iteracion "+counter);
    }
    @Override
    public void run() {
        int counter = 0;
        while (counter < 5) {
            doSomethingUseful(counter);
            try {
                // el metodo sleep sirve para que el hilo que se  esta ejecutando haga una pequeña pausa
                Thread.sleep(1000);
            } catch (Exception e) {
                System.err.println("Hilo interrupido: "+Thread.currentThread().getName());
                break;
            }
            counter++;
        }
        System.out.println("El hilo a finalizado");
    }
}