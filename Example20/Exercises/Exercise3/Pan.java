package Example20.Exercises.Exercise3;

public class Pan implements Productos{
    private String nombre;
    private double precio;

    public Pan(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("El nombre del Pan es: "+nombre+" y el precio es: "+precio);
    }
}
