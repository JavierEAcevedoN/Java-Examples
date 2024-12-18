package Example16.Hilo;

public class Hilo1 extends Thread{
    @Override
    public void run() {
        System.out.println("El hilo esta en ejecucion");
    }

    public static void main(String[] args) {
        Hilo1 hilo = new Hilo1();

        System.out.println("Ejecucion del metodo MAIN");
        hilo.start();
        System.out.println("Ejecucion metodo FIN");
    }
}