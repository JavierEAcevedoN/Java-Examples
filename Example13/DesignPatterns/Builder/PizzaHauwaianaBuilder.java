package Example13.DesignPatterns.Builder;

public class PizzaHauwaianaBuilder extends PizzaBuilder {
    @Override
    public void buildMasa() {
        pizza.setMasa("Suave");
    }
    @Override
    public void buildRelleno() {
        pizza.setSalsa("Piña y Queso");
    }
    @Override
    public void buildSalsa() {
        pizza.setRelleno("Dulce");
    }
    @Override
    public void buildTipo() {
        pizza.setTipo("Hauwaiana");
    }
}