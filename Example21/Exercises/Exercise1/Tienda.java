package Example21.Exercises.Exercise1;

import java.util.List;

public class Tienda {
    public static void main(String[] args) {
        List<Venta> listaVentas = List.of(
        new Venta("32dfs4gfbfh323s43","Edgan",120),
        new Venta("3566gdfrg5y564@","Elquin",348),
        new Venta("3535dsdfdñdpls0976$#","Kelvin",561),
        new Venta("3jdk63984$%#2@","Javier",1908)
        );

        List<Venta> ventasMayor500 = listaVentas.stream().filter(i -> i.getiTotal() > 500.0).toList();
        List<String> ventasMayusculas = listaVentas.stream().map(i -> i.getNombre().toUpperCase()).toList();
        List<Venta> ventasMenoMayor = listaVentas.stream().sorted((l,r) -> (int) (l.getiTotal() - r.getiTotal())).toList();

        ventasMayor500.forEach(i->System.out.println(i.getInfo()));
        ventasMayusculas.forEach(i->System.out.println(i));
        ventasMenoMayor.forEach(i->System.out.println(i.getInfo()));
    }
}