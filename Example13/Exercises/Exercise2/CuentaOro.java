package Example13.Exercises.Exercise2;

public class CuentaOro extends Cuenta{
    @Override
    public void abrir() {
        System.out.println("Se abrio la cuenta Oro");
    }
    @Override
    public void ingresar() {
        System.out.println("Se ingreso a la cuenta Oro");
    }
    @Override
    public void llegaRecibo() {
        System.out.println("Llego el recibo de la cuenta Oro");
    }
    @Override
    public void retirar() {
        System.out.println("Se retiro de la cuenta Oro");
    }
}