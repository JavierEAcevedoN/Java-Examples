package Example12.DesignPatterns.Factory;

public class Gato implements Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Miau Miau");
    }
}