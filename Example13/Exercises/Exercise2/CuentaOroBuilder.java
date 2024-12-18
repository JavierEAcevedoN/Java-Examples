package Example13.Exercises.Exercise2;

public class CuentaOroBuilder extends CuentaBuilder{
    @Override
    public void buildCuenta() {
        cuentaBuild.setCuentaFactory(new CuentaOroFactory());
    }
    @Override
    public void buildRegalo() {
        cuentaBuild.setRegalo(new RegaloOro());
    }
    @Override
    public void buildTarjetaCredito() {
        cuentaBuild.setTarjetaCredito(new TarjetaCreditoOro());
    }
    @Override
    public void buildTarjetadebito() {
        cuentaBuild.setTarjetaDebito(new TarjetaDebitoOro());
    }
}