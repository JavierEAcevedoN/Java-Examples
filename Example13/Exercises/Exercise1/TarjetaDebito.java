package Example13.Exercises.Exercise1;

public abstract class TarjetaDebito {
    protected String mPKNumero;

    public abstract void retirar();
    public abstract void ingresar();
    public abstract void pagar();
}