package Example14.DesignPatterns.Adapter;

public class MotorElectricoAdapter implements Motor {
    protected MotorElectrico motorElectrico;

    public MotorElectricoAdapter() {
        System.out.println("Se creo un motor electrico adaptado");
        motorElectrico = new MotorElectricoComun();
    }
    
    @Override
    public void acelerar() {
        motorElectrico.moverMasRapido();
        System.out.println("Se esta acelerando el motor electrico adaptado");
    }
    @Override
    public void apagar() {
        motorElectrico.detener();
        motorElectrico.conectar();
        System.out.println("Se apago el motor electrico adaptado");
    }
    @Override
    public void encender() {
        motorElectrico.desconectar();
        motorElectrico.activar();
        System.out.println("Se encendio el motor electrico adaptado");
    }
}