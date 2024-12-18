package Example13.Exercises.Exercise2;

public class CuentaBuild {
    private CuentaFactory cuentaFactory;
    private Regalo regalo;
    private TarjetaCredito tarjetaCredito;
    private TarjetaDebito tarjetaDebito;

    public void setCuentaFactory(CuentaFactory cuentaFactory) {
        this.cuentaFactory = cuentaFactory;
    }
    public void setRegalo(Regalo regalo) {
        this.regalo = regalo;
    }
    public void setTarjetaCredito(TarjetaCredito tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }
    public void setTarjetaDebito(TarjetaDebito tarjetaDebito) {
        this.tarjetaDebito = tarjetaDebito;
    }
    public Cuenta getCuenta() {
        return cuentaFactory.crearCuenta();
    }
    public Regalo getRegalo() {
        return regalo;
    }
    public TarjetaCredito getTarjetaCredito() {
        return tarjetaCredito;
    }
    public TarjetaDebito getTarjetaDebito() {
        return tarjetaDebito;
    }
}