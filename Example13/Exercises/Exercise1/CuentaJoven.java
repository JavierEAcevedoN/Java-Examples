package Example13.Exercises.Exercise1;

public class CuentaJoven extends Cuenta {
    @Override
    public void abrir() {
        System.out.println("Se abrio la cuenta Joven");
    }
    @Override
    public void ingresar() {
        System.out.println("Se ingreso a la cuenta Joven");
    }
    @Override
    public void llegaRecibo() {
        System.out.println("Llego el recibo de la cuenta Joven");
    }
    @Override
    public void retirar() {
        System.out.println("Se retiro de la cuenta Joven");
    }
}