package Example15.DesignPatterns.Strategy;

public class Cliente {
    public static void main(String[] args) {
        CarritoDeCompras carritoDeCompras = new CarritoDeCompras();
        carritoDeCompras.setDescuento(new SinDescuento());
        System.out.println(carritoDeCompras.calcularPrecioFinal(1000.00));

        carritoDeCompras.setDescuento(new DescuentoPromocion());
        System.out.println(carritoDeCompras.calcularPrecioFinal(1000.00));

        carritoDeCompras.setDescuento(new DescuentoTemporada());
        System.out.println(carritoDeCompras.calcularPrecioFinal(1000.00));
    }
}