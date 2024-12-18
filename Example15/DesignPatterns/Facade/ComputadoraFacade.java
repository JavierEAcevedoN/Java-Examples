package Example15.DesignPatterns.Facade;

public class ComputadoraFacade {
    private CPU cpu;
    private Memoria memoria;

    public ComputadoraFacade() {
        cpu = new CPU();
        memoria = new Memoria();
    }

    public void encender() {
        cpu.iniciar();
        memoria.cargarSistemaOperativo();
        System.out.println("Computadora encendia");
    }
    public void apagar() {
        memoria.liberarRecursos();
        cpu.apagar();
        System.out.println("Computadora apagada");
    }
}