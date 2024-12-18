package Example15.DesignPatterns.Observer;

public class Pantalla implements Dispositivos {
    @Override
    public void notificar(double temperatura) {
        System.out.println("*Se muestra en la pantalla*");
        System.out.println("La temperatura es de "+temperatura);
    }
}