package Example14.DesignPatterns.Adapter;

public class MotorEconomico implements Motor {
    public MotorEconomico() {
        System.out.println("Creando el motor economico");
    }
    @Override
    public void encender() {
        System.out.println("Encendiendo motor economico");
    }
    @Override
    public void acelerar() {
        System.out.println("Acelerando el motor economico");
    }
    @Override
    public void apagar() {
        System.out.println("Apagando motor economico");
    }
}