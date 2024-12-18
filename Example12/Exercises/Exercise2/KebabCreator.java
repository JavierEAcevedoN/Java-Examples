package Example12.Exercises.Exercise2;

public class KebabCreator extends Creator {
    @Override
    public ComidaRapida crearComida() {
        return new Kebab();
    }
}