package Example13.Exercises.Exercise1;

public class TarjetaCreditoOro implements TarjetaCredito {
    @Override
    public void ingresar() {
        System.out.println("Se ingreso a la tarjeta de Credito Oro");
    }
    @Override
    public void pagar() {
        System.out.println("Se pago con la tarjeta de Credito Oro");
    }
    @Override
    public void retirar() {
        System.out.println("Se retiro con la tarjeta de Credito Oro");
    }
}