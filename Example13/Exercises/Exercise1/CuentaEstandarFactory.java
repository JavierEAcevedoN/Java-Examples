package Example13.Exercises.Exercise1;

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