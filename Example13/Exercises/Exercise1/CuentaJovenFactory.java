package Example13.Exercises.Exercise1;

public class CuentaJovenFactory implements CuentaFactory {
    @Override
    public Cuenta crearCuenta() {
        return new CuentaJoven();
    }
    @Override
    public TarjetaDebito crearTarjetaDebito() {
        return new TarjetaDebitoJoven();
    }
    public Regalo crearRegalo() {
        return new RegaloJoven();
    }
}