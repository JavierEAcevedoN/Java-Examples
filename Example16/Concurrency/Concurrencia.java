package Example16.Concurrency;

public class Concurrencia extends Thread {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        long id = Thread.currentThread().getId();
        String name = Thread.currentThread().getName();
        int priority = Thread.currentThread().getPriority();
        State state = Thread.currentThread().getState();
        String threadGroupName = Thread.currentThread().getThreadGroup().getName();

        System.out.println("ID: "+id);
        System.out.println("Nombre: "+name);
        System.out.println("Prioridad: "+priority);
        System.out.println("Estado: "+state);
        System.out.println("NombreGrupo: "+threadGroupName);
    }
}
