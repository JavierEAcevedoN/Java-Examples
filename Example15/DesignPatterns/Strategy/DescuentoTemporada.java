package Example15.DesignPatterns.Strategy;

public class DescuentoTemporada implements EstrategiaDescuento{
    @Override
    public double aplicarDescuento(double precio) {
        System.out.println("descuento del 90%");
        return precio - (precio * 0.9);
    }
}