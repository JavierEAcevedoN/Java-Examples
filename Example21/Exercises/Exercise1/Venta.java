package Example21.Exercises.Exercise1;

public class Venta {
    private String id, nombre;
    private double iTotal;

    public Venta(String id, String nombre, double itotal) {
        this.id = id;
        this.nombre = nombre;
        iTotal = itotal;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getiTotal() {
        return iTotal;
    }
    public void setiTotal(double itotal) {
        iTotal = itotal;
    }
    public String getId() {
        return id;
    }
    public String getInfo() {
        return "El codigo es: "+id+" el nombre es: "+nombre+" y el importe total es: "+iTotal;
    }
}