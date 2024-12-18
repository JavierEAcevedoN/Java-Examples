package Example12.Exercises.Exercise2;

public class HamburgesaCreator extends Creator{
    @Override
    public ComidaRapida crearComida() {
        return new Hamburgesa();
    }
}