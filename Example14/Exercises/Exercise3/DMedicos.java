package Example14.Exercises.Exercise3;

public class DMedicos implements Datos{
    private String ruta;

    public DMedicos(String ruta) {
        this.ruta = ruta;
        cargarDatos();
    }

    public void cargarDatos() {
        System.out.println("Se esta cargando los datos de la ruta: "+ruta);
    }

    @Override
    public void mostrar() {
        System.out.println("Estos son los datos de la ruta: "+ruta);
    }
}