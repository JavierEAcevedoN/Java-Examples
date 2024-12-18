package Example13.DesignPatterns.Builder;

public class PizzaPicanteBuilder extends PizzaBuilder {
    @Override
    public void buildMasa() {
        pizza.setMasa("Cocida");
    }
    @Override
    public void buildRelleno() {
        pizza.setSalsa("Peperoni y Carne");
    }
    @Override
    public void buildSalsa() {
        pizza.setRelleno("Picante");
    }
    @Override
    public void buildTipo() {
        pizza.setTipo("Picante"); 
    }
}