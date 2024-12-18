package Example13.Exercises.Exercise1;

public class TarjetaDebito10 extends TarjetaDebito {
    @Override
    public void ingresar() {
        System.out.println("Se ingreso a la tarjeta de Debito 10");
    }
    @Override
    public void pagar() {
        System.out.println("Se pago con la tarjeta de Debito 10");
    }
    @Override
    public void retirar() {
        System.out.println("Se retiro con la tarjeta de Debito 10");
    }
}