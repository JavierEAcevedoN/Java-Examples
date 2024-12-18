package Example15.DesignPatterns.Strategy;

public class SinDescuento implements EstrategiaDescuento{
    @Override
    public double aplicarDescuento(double precio) {
        System.out.println("sin descuento aplicado");
        return precio;
    }
}