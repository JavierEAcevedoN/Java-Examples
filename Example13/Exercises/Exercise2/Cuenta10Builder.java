package Example13.Exercises.Exercise2;

public class Cuenta10Builder extends CuentaBuilder {
    @Override
    public void buildCuenta() {
        cuentaBuild.setCuentaFactory(new Cuenta10Factory());
    }
    @Override
    public void buildRegalo() {
        cuentaBuild.setRegalo(new Regalo10());
    }
    @Override
    public void buildTarjetaCredito() {
        cuentaBuild.setTarjetaCredito(new TarjetaCredito10());
    }
    @Override
    public void buildTarjetadebito() {
        cuentaBuild.setTarjetaDebito(new TarjetaDebito10());
    }
}