package Example16.Hilo;

class Tarea extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Soy el hilo ["+i+"] en ejecucion");
        }
    }
}
public class Hilo2 {
    public static void main(String[] args) {
        Tarea tarea = new Tarea();
        tarea.start();
        System.out.println("Hilo principal y sigo haciendo mi trabajo");
        System.out.println("Fin del hilo principal");
    }
}