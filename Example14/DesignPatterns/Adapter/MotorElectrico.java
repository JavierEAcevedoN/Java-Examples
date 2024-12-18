package Example14.DesignPatterns.Adapter;

public interface MotorElectrico {
    public void conectar();
    public void activar();
    public void moverMasRapido();
    public void desconectar();
    public void detener();
}