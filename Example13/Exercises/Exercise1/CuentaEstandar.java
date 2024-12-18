package Example13.Exercises.Exercise1;

public class CuentaEstandar extends Cuenta {
    @Override
    public void abrir() {
        System.out.println("Se abrio la cuenta Estandar");
    }
    @Override
    public void ingresar() {
        System.out.println("Se ingreso a la cuenta Estandar");
    }
    @Override
    public void llegaRecibo() {
        System.out.println("Llego el recibo de la cuenta Estandar");
    }
    @Override
    public void retirar() {
        System.out.println("Se retiro de la cuenta Estandar");
    }
}