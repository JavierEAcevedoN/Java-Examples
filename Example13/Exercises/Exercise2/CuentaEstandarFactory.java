package Example13.Exercises.Exercise2;

public class CuentaEstandarFactory implements CuentaFactory{
    @Override
    public Cuenta crearCuenta() {
        return new CuentaEstandar();
    }
    @Override
    public TarjetaDebito crearTarjetaDebito() {
        return new TarjetaDebitoEstandar();
    }
}