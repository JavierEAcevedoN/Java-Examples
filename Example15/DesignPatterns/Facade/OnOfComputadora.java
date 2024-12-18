package Example15.DesignPatterns.Facade;

public class OnOfComputadora {
    public static void main(String[] args) {
        ComputadoraFacade computadora = new ComputadoraFacade();

        computadora.encender();

        computadora.apagar();
    }
}