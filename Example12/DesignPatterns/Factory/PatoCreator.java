package Example12.DesignPatterns.Factory;

public class PatoCreator extends Creator {
    @Override
    public Animal crearAnimal() {
        return new Pato();
    }
}