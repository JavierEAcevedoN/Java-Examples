package Example12.Exercises.Exercise2;

public class ComidaCliente {
    public static void main(String[] args) {
        Creator hamburgesaCre = new HamburgesaCreator();
        Creator kebabCre = new KebabCreator();
        Creator pizzaCre = new PizzaCreator();

        ComidaRapida hamburgesa = hamburgesaCre.crearComida();
        ComidaRapida kebab = kebabCre.crearComida();
        ComidaRapida pizza = pizzaCre.crearComida();

        hamburgesa.comprar();
        kebab.comprar();
        pizza.comprar();
    }
}