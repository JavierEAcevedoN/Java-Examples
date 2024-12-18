package Example20.Exercises.Exercise4;

public class Gaseosa implements Productos{
    private String nombre;
    private double precio;

    public Gaseosa(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("El nombre de la Gaseosa es: "+nombre+" y el precio es: "+precio);
    }
}