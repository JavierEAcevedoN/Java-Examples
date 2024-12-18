package Example12.Exercises.Exercise2;

public class PizzaCreator extends Creator{
    @Override
    public ComidaRapida crearComida() {
        return new Pizza();
    }
}