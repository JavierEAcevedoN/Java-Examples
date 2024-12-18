package Example20.Exercises.Exercise1;

public class Gaseosa implements Producto{
    private String nombre;
    private double precio;

    public Gaseosa(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public void obtenerInformacion() {
        System.out.println("El nombre de la Gaseosa es: "+nombre+" y el precio es: "+precio);
    }
}