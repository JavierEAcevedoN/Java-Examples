package Example20.ExpresionesLambda.ELambda.Ejemplo4;

public class Ejemplo4 {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("Corriendo un hilo...");
        new Thread(task).start();
    }
}