package Example13.Exercises.Exercise2;

public class CuentaJovenBuilder extends CuentaBuilder {
    @Override
    public void buildCuenta() {
        cuentaBuild.setCuentaFactory(new CuentaJovenFactory());
    }
    @Override
    public void buildRegalo() {
        cuentaBuild.setRegalo(new RegaloJoven());
    }
    @Override
    public void buildTarjetaCredito() {
        cuentaBuild.setTarjetaCredito(null);
    }
    @Override
    public void buildTarjetadebito() {
        cuentaBuild.setTarjetaDebito(new TarjetaDebitoJoven());
    }
}