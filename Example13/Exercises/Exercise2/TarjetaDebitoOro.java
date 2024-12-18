package Example13.Exercises.Exercise2;

public class TarjetaDebitoOro extends TarjetaDebito {
    @Override
    public void ingresar() {
        System.out.println("Se ingreso a la tarjeta de Debito Oro");
    }
    @Override
    public void pagar() {
        System.out.println("Se pago con la tarjeta de Debito Oro");
    }
    @Override
    public void retirar() {
        System.out.println("Se retiro con la tarjeta de Debito Oro");
    }
}