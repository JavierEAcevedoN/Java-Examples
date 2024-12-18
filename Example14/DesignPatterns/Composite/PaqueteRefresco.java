package Example14.DesignPatterns.Composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PaqueteRefresco implements Producto{
    private List<Producto> productos = new ArrayList<>();

    public void add(Producto producto) {
        productos.add(producto);
    }

    public void add(Producto ...producto) {
        productos.addAll(Arrays.asList(producto));
    }

    public void add(int quantity, Producto producto) {
        productos.add(quantity, producto);
    }

    public void remove(int number) {
        productos.remove(number);
    }

    public void remove(Producto producto) {
        productos.remove(producto);
    }

    @Override
    public double getValor() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getValor();
        }
        return total;
    }
}