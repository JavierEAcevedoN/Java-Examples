package Example15.DesignPatterns.Strategy;

public class DescuentoPromocion implements EstrategiaDescuento{
    @Override
    public double aplicarDescuento(double precio) {
        System.out.println("Descuento del 80%");
        return precio - (precio * 0.8);
    }
}