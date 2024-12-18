package Example13.Exercises.Exercise2;

public class Cuenta10Factory implements CuentaFactory{
    @Override
    public Cuenta crearCuenta() {
        return new Cuenta10();
    }
    @Override
    public TarjetaDebito crearTarjetaDebito() {
        return new TarjetaDebito10();
    }
    public Regalo crearRegalo() {
        return new Regalo10();
    }
    public TarjetaCredito crearTarjetaCredito() {
        return new TarjetaCredito10();
    }
}