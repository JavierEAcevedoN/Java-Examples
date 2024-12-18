package Example13.Exercises.Exercise2;

public class CuentaOroFactory implements CuentaFactory{
    @Override
    public Cuenta crearCuenta() {
        return new CuentaOro();
    }
    @Override
    public TarjetaDebito crearTarjetaDebito() {
        return new TarjetaDebitoOro();
    }
    public Regalo crearRegalo() {
        return new RegaloOro();
    }
    public TarjetaCredito crearTarjetaCredito() {
        return new TarjetaCreditoOro();
    }
}