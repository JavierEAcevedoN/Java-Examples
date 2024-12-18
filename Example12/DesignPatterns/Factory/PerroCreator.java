package Example12.DesignPatterns.Factory;

public class PerroCreator extends Creator {
    @Override
    public Animal crearAnimal() {
        return new Perro();
    }
}
