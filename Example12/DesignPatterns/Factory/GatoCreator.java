package Example12.DesignPatterns.Factory;

public class GatoCreator extends Creator {
    @Override
    public Animal crearAnimal() {
        return new Gato();
    }
}