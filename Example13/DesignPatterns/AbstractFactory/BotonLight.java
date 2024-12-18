package Example13.DesignPatterns.AbstractFactory;

public class BotonLight implements Boton{
    @Override
    public void render() {
        System.out.println("Boton Light");
    }
}