package Example13.Exercises.Exercise2;

public abstract class Cuenta {
    protected String mPKEntidad;
    protected String mPKSucursal;
    protected String mPKDC;
    protected String mPKCCC;
    
    public abstract void abrir();
    public abstract void llegaRecibo();
    public abstract void ingresar();
    public abstract void retirar();
}