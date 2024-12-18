package Example13.Exercises.Exercise2;

public abstract class CuentaBuilder {
    protected CuentaBuild cuentaBuild;

    public CuentaBuild getCuentaBuild() {
        return cuentaBuild;
    }

    public void createCuentaBuild() {
        cuentaBuild = new CuentaBuild();
    }

    public abstract void buildCuenta();
    public abstract void buildRegalo();
    public abstract void buildTarjetaCredito();
    public abstract void buildTarjetadebito();
}