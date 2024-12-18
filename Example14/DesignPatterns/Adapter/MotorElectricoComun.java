package Example14.DesignPatterns.Adapter;

public class MotorElectricoComun implements MotorElectrico{
    public MotorElectricoComun() {
        System.out.println("Se ha creado un motor electrico comun");
    }

    @Override
    public void activar() {
        System.out.println("Se activo el motor electrico comun");
    }
    @Override
    public void conectar() {
        System.out.println("Se conecto el motor electrico comun");
    }
    @Override
    public void desconectar() {
        System.out.println("Se desconeto el motor electrico comun");
    }
    @Override
    public void moverMasRapido() {
        System.out.println("El motor electrico comun es mas rapido");
    }
    @Override
    public void detener() {
        System.out.println("Se detenio el motor electrico comun");
    }
}