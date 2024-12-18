package Example13.Exercises.Exercise2;

public class CuentaEstandarBuilder extends CuentaBuilder{
    @Override
    public void buildCuenta() {
        cuentaBuild.setCuentaFactory(new CuentaEstandarFactory());
    }
    @Override
    public void buildRegalo() {
        cuentaBuild.setRegalo(null);
    }
    @Override
    public void buildTarjetaCredito() {
        cuentaBuild.setTarjetaCredito(null);
    }
    @Override
    public void buildTarjetadebito() {
        cuentaBuild.setTarjetaDebito(new TarjetaDebitoEstandar());
    }
}