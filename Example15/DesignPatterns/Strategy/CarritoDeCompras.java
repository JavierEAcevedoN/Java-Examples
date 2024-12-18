package Example15.DesignPatterns.Strategy;

public class CarritoDeCompras {
    private EstrategiaDescuento descuento;

    public void setDescuento(EstrategiaDescuento descuento) {
        this.descuento = descuento;
    }

    public double calcularPrecioFinal (double precio) {
        if (descuento == null) {
            descuento = new SinDescuento();
        }
        return descuento.aplicarDescuento(precio);
    }
}