package Example13.DesignPatterns.Builder;

public class PruebaPizza {
    public static void main(String[] args) {
        Cocina cocina = new Cocina();
        PizzaPicanteBuilder pizzaPicanteBuilder = new PizzaPicanteBuilder();
        PizzaHauwaianaBuilder pizzaHauwaianaBuilder = new PizzaHauwaianaBuilder();
        
        cocina.setPizzaBuilder(pizzaPicanteBuilder);
        cocina.construirPizza();
        Pizza pizzaPicante = cocina.getPizza();
        pizzaPicante.obtenerInformacion();

        cocina.setPizzaBuilder(pizzaHauwaianaBuilder);
        cocina.construirPizza();
        Pizza pizzaHauwaiana = cocina.getPizza();
        pizzaHauwaiana.obtenerInformacion();
    }
}