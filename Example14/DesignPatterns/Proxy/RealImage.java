package Example14.DesignPatterns.Proxy;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        cargarDisco();
    }

    public void cargarDisco() {
        System.out.println("La imagen se a cargado del disco: "+fileName);
    }

    @Override
    public void display() {
        System.out.println("Mostrando imagen: "+fileName);
    }
}