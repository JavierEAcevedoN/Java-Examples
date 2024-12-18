package Example13.Exercises.Exercise2;

public class ClienteDirector {
    private CuentaBuilder cuentaBuilder;

    public void setCuentaBuilder(CuentaBuilder cb) {
        cuentaBuilder = cb;
    }

    public CuentaBuilder getCuenta() {
        return cuentaBuilder;
    }

    public void construirCuenta() {
        cuentaBuilder.createCuentaBuild();
        cuentaBuilder.buildCuenta();
        cuentaBuilder.buildRegalo();
        cuentaBuilder.buildTarjetaCredito();
        cuentaBuilder.buildTarjetadebito();
    }
}