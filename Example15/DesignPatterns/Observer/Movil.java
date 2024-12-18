package Example15.DesignPatterns.Observer;

public class Movil implements Dispositivos{
    @Override
    public void notificar(double temperatura) {
        System.out.println("*Sale una notificacion en el telefono*");
        System.out.println("La temperatura es de "+temperatura);
    }
}