package Example12.DesignPatterns.Factory;

public class ClienteAnimal {
    public static void main(String[] args) {
        Creator perroFact = new PerroCreator();
        Creator gatoFact = new GatoCreator();
        Creator patoFact = new PatoCreator();

        Animal perro = perroFact.crearAnimal();
        Animal gato = gatoFact.crearAnimal();
        Animal pato = patoFact.crearAnimal();

        perro.hacerSonido();
        gato.hacerSonido();
        pato.hacerSonido();
    }
}
